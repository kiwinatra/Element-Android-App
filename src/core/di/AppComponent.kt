package com.elemsocial.core.di

import android.content.Context
import com.elemsocial.core.common.exceptions.AppExceptions
import com.elemsocial.core.common.exceptions.ErrorHandler
import com.elemsocial.core.common.exceptions.Handlers
import com.elemsocial.core.common.utils.CoroutineDispatchers
import com.elemsocial.core.common.utils.RxUtils
import com.elemsocial.core.common.utils.SecurePrefs
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    NetworkModule::class,
    DatabaseModule::class,
    ViewModelModule::class,
    RepositoryModule::class,
    UseCaseModule::class
])
interface AppComponent {
    // Factory to create instances
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Expose dependencies to dependent components
    fun context(): Context
    fun coroutineDispatchers(): CoroutineDispatchers
    fun rxUtils(): RxUtils
    fun securePrefs(): SecurePrefs
    fun errorHandler(): ErrorHandler
    fun appExceptions(): AppExceptions
    fun exceptionHandlers(): Handlers

    // Subcomponents
    fun authComponent(): AuthComponent.Factory
    fun feedComponent(): FeedComponent.Factory
    fun chatComponent(): ChatComponent.Factory
    fun profileComponent(): ProfileComponent.Factory
    fun settingsComponent(): SettingsComponent.Factory

    // Injectors
    fun inject(application: ElemSocialApplication)
}

// Network module providing API services
@Module
class NetworkModule {
    @Provides
    @Singleton
    fun provideApiClient(): ApiClient {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
            .create(ApiClient::class.java)
    }
}

// Database module providing Room database
@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "elem-social-db"
        ).build()
    }
}

// ViewModel module
@Module
class ViewModelModule {
    @Provides
    @ViewModelKey(MainViewModel::class)
    fun provideMainViewModel(): ViewModel {
        return MainViewModel()
    }
}

// Feature components
@Subcomponent
interface AuthComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): AuthComponent
    }
    
    fun inject(fragment: AuthFragment)
}

@Subcomponent
interface FeedComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): FeedComponent
    }
    
    fun inject(fragment: FeedFragment)
}

