package com.elemsocial.core.common.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

interface DispatcherProvider {
    val main: CoroutineDispatcher
    val default: CoroutineDispatcher
    val io: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}

class DefaultDispatcherProvider : DispatcherProvider {
    override val main: CoroutineDispatcher = Dispatchers.Main
    override val default: CoroutineDispatcher = Dispatchers.Default
    override val io: CoroutineDispatcher = Dispatchers.IO
    override val unconfined: CoroutineDispatcher = Dispatchers.Unconfined
}

class TestDispatcherProvider(
    override val main: CoroutineDispatcher = Dispatchers.Unconfined,
    override val default: CoroutineDispatcher = Dispatchers.Unconfined,
    override val io: CoroutineDispatcher = Dispatchers.Unconfined,
    override val unconfined: CoroutineDispatcher = Dispatchers.Unconfined
) : DispatcherProvider

object CoroutineDispatchers {
    private var _provider: DispatcherProvider = DefaultDispatcherProvider()
    
    val main: CoroutineDispatcher get() = _provider.main
    val default: CoroutineDispatcher get() = _provider.default
    val io: CoroutineDispatcher get() = _provider.io
    val unconfined: CoroutineDispatcher get() = _provider.unconfined
    
    fun setProvider(provider: DispatcherProvider) {
        _provider = provider
    }
    
    fun resetToDefault() {
        _provider = DefaultDispatcherProvider()
    }
    
    inline fun <T> withMain(noinline block: suspend () -> T) = withContext(main, block)
    inline fun <T> withIO(noinline block: suspend () -> T) = withContext(io, block)
    inline fun <T> withDefault(noinline block: suspend () -> T) = withContext(default, block)
    
    suspend inline fun <T> withContext(
        context: CoroutineDispatcher,
        noinline block: suspend () -> T
    ): T = kotlinx.coroutines.withContext(context) { block() }
    
    fun dispatcherForNetworkType(networkType: NetworkType): CoroutineDispatcher {
        return when (networkType) {
            NetworkType.WIFI -> io
            NetworkType.CELLULAR -> default
            NetworkType.UNKNOWN -> main
            NetworkType.OFFLINE -> unconfined
        }
    }
}

enum class NetworkType {
    WIFI, CELLULAR, UNKNOWN, OFFLINE
}

inline fun <T> runOnMain(crossinline block: suspend () -> T) = CoroutineDispatchers.withMain(block)
inline fun <T> runOnIO(crossinline block: suspend () -> T) = CoroutineDispatchers.withIO(block)
inline fun <T> runOnDefault(crossinline block: suspend () -> T) = CoroutineDispatchers.withDefault(block)