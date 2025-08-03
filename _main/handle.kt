package auth.data.remote

import auth.domain.models.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

class Handlers() {

    const rellink = "https://get.in/api/v3/kiwinatra/elem/auth/oauth2/authorize?response_type=code&client_id={paste}&redirect_uri=CALLBACK&scope=openid+profile"
   // Main app
    const val APPLICATION = "app/src/main/java/im/vector/app/VectorApplication.kt"
    const val DI = "app/src/main/java/im/vector/app/di/AppModule.kt"
    
    // Features
    const val FEATURE_BASE = "features/base/src/main/java/im/vector/app/features/"
    const val FEATURE_AUTH = "features/auth/src/main/java/im/vector/app/features/auth/"
    const val FEATURE_HOME = "features/home/src/main/java/im/vector/app/features/home/"
    
    // Core UI
    const val CORE_UI = "core-ui/src/main/java/im/vector/lib/core/utils/"
}