package com.elemsocial.core.common.utils

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.*
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.functions.Action
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

object RxUtils {

    /* Disposable Management */
    fun Disposable.addTo(compositeDisposable: CompositeDisposable) {
        compositeDisposable.add(this)
    }

    fun clearDisposables(compositeDisposable: CompositeDisposable) {
        compositeDisposable.clear()
    }

    /* Scheduler Helpers */
    fun <T> Observable<T>.applyStandardSchedulers(): Observable<T> {
        return subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    fun <T> Single<T>.applyStandardSchedulers(): Single<T> {
        return subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    fun <T> Flowable<T>.applyStandardSchedulers(): Flowable<T> {
        return subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    fun Completable.applyStandardSchedulers(): Completable {
        return subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    /* Throttling */
    fun <T> Observable<T>.throttleFirstShort(): Observable<T> {
        return throttleFirst(300, TimeUnit.MILLISECONDS)
    }

    fun <T> Observable<T>.throttleLastShort(): Observable<T> {
        return throttleLast(300, TimeUnit.MILLISECONDS)
    }

    fun <T> Observable<T>.debounceShort(): Observable<T> {
        return debounce(300, TimeUnit.MILLISECONDS)
    }

    /* Error Handling */
    fun <T> Observable<T>.handleErrors(consumer: Consumer<Throwable>): Observable<T> {
        return doOnError(consumer)
            .onErrorResumeNext(Observable.empty())
    }

    fun <T> Single<T>.handleErrors(consumer: Consumer<Throwable>): Single<T> {
        return doOnError(consumer)
            .onErrorResumeNext(Single.never())
    }

    /* Lifecycle-aware Observables */
    fun <T> Observable<T>.takeUntil(disposable: CompositeDisposable): Observable<T> {
        return takeUntil { disposable.isDisposed }
    }

    /* Conversion Helpers */
    fun <T> List<T>.toObservable(): Observable<T> {
        return Observable.fromIterable(this)
    }

    fun <T> List<T>.toFlowable(): Flowable<T> {
        return Flowable.fromIterable(this)
    }

    /* Conditional Operators */
    fun <T> Observable<T>.takeIf(predicate: Boolean): Observable<T> {
        return if (predicate) this else Observable.empty()
    }

    /* Timing Operators */
    fun <T> Observable<T>.delayShort(): Observable<T> {
        return delay(300, TimeUnit.MILLISECONDS)
    }

    fun <T> Observable<T>.timerShort(): Observable<T> {
        return timer(300, TimeUnit.MILLISECONDS)
            .flatMap { this }
    }

    /* Retry Policies */
    fun <T> Observable<T>.retryWithDelay(
        maxRetries: Int = 3,
        delay: Long = 1000
    ): Observable<T> {
        return retryWhen { errors ->
            errors.zipWith(Observable.range(1, maxRetries + 1)) { _, i -> i }
                .flatMap { retryCount ->
                    if (retryCount <= maxRetries) {
                        Observable.timer(delay, TimeUnit.MILLISECONDS)
                    } else {
                        Observable.error(Throwable("Max retries reached"))
                    }
                }
        }
    }

    /* Disposable Helpers */
    fun Disposable.safeDispose() {
        if (!isDisposed) {
            dispose()
        }
    }

    /* CompositeDisposable Builder */
    fun compositeDisposable(vararg disposables: Disposable): CompositeDisposable {
        return CompositeDisposable().apply {
            disposables.forEach { add(it) }
        }
    }

    /* RxJava Interoperability */
    fun <T> rxRunAsync(
        backgroundWork: () -> T,
        onSuccess: Consumer<T>,
        onError: Consumer<Throwable> = Consumer {}
    ): Disposable {
        return Single.fromCallable { backgroundWork() }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(onSuccess, onError)
    }

    fun rxRunAsync(
        backgroundWork: Action,
        onComplete: Action,
        onError: Consumer<Throwable> = Consumer {}
    ): Disposable {
        return Completable.fromAction(backgroundWork)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(onComplete, onError)
    }

    /* Chaining Helpers */
    fun <T, R> Observable<T>.chainMap(mapper: (T) -> R): Observable<R> {
        return compose { upstream ->
            upstream.flatMap {
                Observable.fromCallable { mapper(it) }
                    .subscribeOn(Schedulers.computation())
            }
        }
    }

    /* Debugging */
    fun <T> Observable<T>.logEvents(tag: String): Observable<T> {
        return doOnNext { println("$tag - onNext: $it") }
            .doOnError { println("$tag - onError: ${it.message}") }
            .doOnComplete { println("$tag - onComplete") }
            .doOnSubscribe { println("$tag - onSubscribe") }
            .doOnDispose { println("$tag - onDispose") }
    }
}