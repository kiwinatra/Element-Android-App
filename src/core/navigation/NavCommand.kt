package com.elemsocial.core.navigation

import androidx.annotation.IdRes
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions

sealed class NavCommand {
    data class Direction(
        val directions: NavDirections,
        val navOptions: NavOptions? = null
    ) : NavCommand()

    data class Destination(
        @IdRes val destinationId: Int,
        val args: Map<String, Any> = emptyMap(),
        val navOptions: NavOptions? = null
    ) : NavCommand()

    data class Back(
        val destinationId: Int? = null,
        val inclusive: Boolean = false
    ) : NavCommand()

    data class BackToRoot(
        @IdRes val graphId: Int? = null
    ) : NavCommand()

    object Finish : NavCommand()
}

fun NavCommand.Direction.toBundle() = directions.arguments
fun NavCommand.Destination.toBundle() = createBundleFromMap(args)

private fun createBundleFromMap(args: Map<String, Any>): android.os.Bundle {
    return android.os.Bundle().apply {
        args.forEach { (key, value) ->
            when (value) {
                is String -> putString(key, value)
                is Int -> putInt(key, value)
                is Long -> putLong(key, value)
                is Float -> putFloat(key, value)
                is Double -> putDouble(key, value)
                is Boolean -> putBoolean(key, value)
                is android.os.Parcelable -> putParcelable(key, value)
                is java.io.Serializable -> putSerializable(key, value)
                else -> throw IllegalArgumentException("Unsupported argument type: ${value.javaClass.name}")
            }
        }
    }
}