package com.elemsocial.core.di

import android.content.Context
import com.elemsocial.core.common.exceptions.AppExceptions
import com.elemsocial.core.common.exceptions.ErrorHandler
import com.elemsocial.core.common.exceptions.Handlers
import com.elemsocial.core.common.utils.CoroutineDispatchers
import com.elemsocial.core.common.utils.RxUtils
import com.elemsocial.core.common.utils.SecurePrefs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoreModule {

    @Provides
    @Singleton
    fun provideCoroutineDispatchers(): CoroutineDispatchers {
        return CoroutineDispatchers
    }

    @Provides
    @Singleton
    fun provideRxUtils(): RxUtils {
        return RxUtils
    }

    @Provides
    @Singleton
    fun provideSecurePrefs(@ApplicationContext context: Context): SecurePrefs {
        return SecurePrefs.initialize(context)
    }

    @Provides
    @Singleton
    fun provideErrorHandler(
        @ApplicationContext context: Context,
        appExceptions: AppExceptions
    ): ErrorHandler {
        return ErrorHandler(context, FirebaseCrashlytics.getInstance(), appExceptions)
    }

    @Provides
    @Singleton
    fun provideAppExceptions(@ApplicationContext context: Context): AppExceptions {
        return AppExceptions(context, FirebaseCrashlytics.getInstance())
    }

    @Provides
    @Singleton
    fun provideHandlers(): Handlers {
        return Handlers
    }

    @Provides
    @Singleton
    fun provideNetworkMonitor(@ApplicationContext context: Context): NetworkMonitor {
        return NetworkMonitor(context)
    }

    @Provides
    @Singleton
    fun provideAnalyticsHelper(): AnalyticsHelper {
        return FirebaseAnalyticsHelper()
    }

    @Provides
    @Singleton
    fun provideImageLoader(@ApplicationContext context: Context): ImageLoader {
        return GlideImageLoader(context)
    }

    @Provides
    @Singleton
    fun provideNotificationHelper(@ApplicationContext context: Context): NotificationHelper {
        return NotificationHelperImpl(context)
    }

    @Provides
    @Singleton
    fun provideResourceProvider(@ApplicationContext context: Context): ResourceProvider {
        return AndroidResourceProvider(context)
    }

    @Provides
    @Singleton
    fun providePermissionManager(@ApplicationContext context: Context): PermissionManager {
        return PermissionManagerImpl(context)
    }

    @Provides
    @Singleton
    fun provideBiometricAuthManager(@ApplicationContext context: Context): BiometricAuthManager {
        return BiometricAuthManagerImpl(context)
    }

    @Provides
    @Singleton
    fun provideEncryptionManager(): EncryptionManager {
        return AESEncryptionManager()
    }

    @Provides
    @Singleton
    fun provideLocationProvider(@ApplicationContext context: Context): LocationProvider {
        return FusedLocationProvider(context)
    }

    @Provides
    @Singleton
    fun provideFileManager(@ApplicationContext context: Context): FileManager {
        return FileManagerImpl(context)
    }

    @Provides
    @Singleton
    fun provideClipboardManager(@ApplicationContext context: Context): ClipboardManager {
        return ClipboardManagerImpl(context)
    }

    @Provides
    @Singleton
    fun provideDeepLinkParser(): DeepLinkParser {
        return AppDeepLinkParser()
    }

    @Provides
    @Singleton
    fun provideWorkManager(@ApplicationContext context: Context): AppWorkManager {
        return AppWorkManagerImpl(context)
    }

    @Provides
    @Singleton
    fun provideCacheManager(@ApplicationContext context: Context): CacheManager {
        return CacheManagerImpl(context)
    }
}