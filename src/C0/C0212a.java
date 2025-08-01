package com.google.android.material.elevation

import android.content.Context
import android.graphics.Color
import androidx.annotation.ColorInt
import androidx.annotation.FloatRange
import androidx.annotation.VisibleForTesting
import androidx.core.graphics.ColorUtils
import com.google.android.material.R
import com.google.android.material.resources.MaterialAttributes
import kotlin.math.ln1p
import kotlin.math.min

/**
 * Handles elevation overlays for Material surfaces by adjusting colors based on elevation.
 *
 * @property elevationOverlayEnabled Whether elevation overlays are enabled
 * @property elevationOverlayColor The base color used for elevation overlays
 * @property elevationOverlayAccentColor The accent color used for elevation overlays
 * @property surfaceColor The base surface color
 * @property displayDensity The display density used for elevation calculations
 */
class ElevationOverlayProvider @JvmOverloads constructor(
    private val elevationOverlayEnabled: Boolean,
    @ColorInt private val elevationOverlayColor: Int,
    @ColorInt private val elevationOverlayAccentColor: Int,
    @ColorInt private val surfaceColor: Int,
    private val displayDensity: Float
) {
    companion object {
        @VisibleForTesting
        internal const val OVERLAY_ALPHA = 20 // 5.1 rounded to nearest int

        /**
         * Creates an instance using values from the current theme.
         */
        @JvmStatic
        fun create(context: Context): ElevationOverlayProvider {
            return ElevationOverlayProvider(
                elevationOverlayEnabled = MaterialAttributes.resolveBoolean(
                    context,
                    R.attr.elevationOverlayEnabled,
                    false
                ),
                elevationOverlayColor = MaterialAttributes.resolveColor(
                    context,
                    R.attr.elevationOverlayColor
                ),
                elevationOverlayAccentColor = MaterialAttributes.resolveColor(
                    context,
                    R.attr.elevationOverlayAccentColor
                ),
                surfaceColor = MaterialAttributes.resolveColor(
                    context,
                    R.attr.colorSurface
                ),
                displayDensity = context.resources.displayMetrics.density
            )
        }
    }

    /**
     * Calculates the alpha value for the overlay based on elevation.
     *
     * @param elevation The elevation value in pixels
     * @return Alpha value between 0 and 1
     */
    @FloatRange(from = 0.0, to = 1.0)
    fun calculateOverlayAlpha(elevation: Float): Float {
        return when {
            displayDensity <= 0 || elevation <= 0 -> 0f
            else -> min((ln1p(elevation / displayDensity) * 4.5f + 2f) / 100f, 1f)
        }
    }

    /**
     * Composites the overlay color onto the given color based on elevation.
     *
     * @param color The base color
     * @param elevation The elevation value in pixels
     * @return The composited color
     */
    @ColorInt
    fun compositeOverlay(@ColorInt color: Int, elevation: Float): Int {
        val alpha = calculateOverlayAlpha(elevation)
        val baseColor = ColorUtils.setAlphaComponent(color, 255)
        var compositedColor = ColorUtils.blendARGB(
            baseColor,
            elevationOverlayColor,
            alpha
        )

        if (alpha > 0 && elevationOverlayAccentColor != 0) {
            compositedColor = ColorUtils.compositeColors(
                ColorUtils.setAlphaComponent(elevationOverlayAccentColor, OVERLAY_ALPHA),
                compositedColor
            )
        }

        return ColorUtils.setAlphaComponent(compositedColor, Color.alpha(color))
    }

    /**
     * Applies elevation overlay if enabled and the color matches the surface color.
     *
     * @param color The original color
     * @param elevation The elevation value in pixels
     * @return The original color or the composited color if overlay should be applied
     */
    @ColorInt
    fun applyOverlayIfNeeded(@ColorInt color: Int, elevation: Float): Int {
        return if (!elevationOverlayEnabled || !isSurfaceColor(color)) {
            color
        } else {
            compositeOverlay(color, elevation)
        }
    }

    /** Returns whether elevation overlay is enabled. */
    fun isElevationOverlayEnabled(): Boolean = elevationOverlayEnabled

    private fun isSurfaceColor(@ColorInt color: Int): Boolean {
        return ColorUtils.setAlphaComponent(color, 255) == surfaceColor
    }
}