// port-lint: source generated/MTLSampler.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Filter options for minification and magnification.
 */
data class MTLSamplerMinMagFilter(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Nearest = MTLSamplerMinMagFilter(0uL)
        val Linear = MTLSamplerMinMagFilter(1uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Filter options for mipmaps.
 */
data class MTLSamplerMipFilter(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val NotMipmapped = MTLSamplerMipFilter(0uL)
        val Nearest = MTLSamplerMipFilter(1uL)
        val Linear = MTLSamplerMipFilter(2uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Options for wrap mode.
 */
data class MTLSamplerAddressMode(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val ClampToEdge = MTLSamplerAddressMode(0uL)
        val MirrorClampToEdge = MTLSamplerAddressMode(1uL)
        val Repeat = MTLSamplerAddressMode(2uL)
        val MirrorRepeat = MTLSamplerAddressMode(3uL)
        val ClampToZero = MTLSamplerAddressMode(4uL)
        val ClampToBorderColor = MTLSamplerAddressMode(5uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Options for border color.
 */
data class MTLSamplerBorderColor(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val TransparentBlack = MTLSamplerBorderColor(0uL)
        val OpaqueBlack = MTLSamplerBorderColor(1uL)
        val OpaqueWhite = MTLSamplerBorderColor(2uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Descriptor for creating sampler states.
 */
open class MTLSamplerDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLSamplerDescriptor

    open fun minFilter(): MTLSamplerMinMagFilter = MTLSamplerMinMagFilter.Nearest
    open fun setMinFilter(min_filter: MTLSamplerMinMagFilter) {}

    open fun magFilter(): MTLSamplerMinMagFilter = MTLSamplerMinMagFilter.Nearest
    open fun setMagFilter(mag_filter: MTLSamplerMinMagFilter) {}

    open fun mipFilter(): MTLSamplerMipFilter = MTLSamplerMipFilter.NotMipmapped
    open fun setMipFilter(mip_filter: MTLSamplerMipFilter) {}

    open fun maxAnisotropy(): NSUInteger = 1uL
    open fun setMaxAnisotropy(max_anisotropy: NSUInteger) {}

    open fun sAddressMode(): MTLSamplerAddressMode = MTLSamplerAddressMode.ClampToEdge
    open fun setSAddressMode(s_address_mode: MTLSamplerAddressMode) {}

    open fun tAddressMode(): MTLSamplerAddressMode = MTLSamplerAddressMode.ClampToEdge
    open fun setTAddressMode(t_address_mode: MTLSamplerAddressMode) {}

    open fun rAddressMode(): MTLSamplerAddressMode = MTLSamplerAddressMode.ClampToEdge
    open fun setRAddressMode(r_address_mode: MTLSamplerAddressMode) {}

    open fun borderColor(): MTLSamplerBorderColor = MTLSamplerBorderColor.TransparentBlack
    open fun setBorderColor(border_color: MTLSamplerBorderColor) {}

    open fun normalizedCoordinates(): Boolean = true
    open fun setNormalizedCoordinates(normalized_coordinates: Boolean) {}

    open fun lodMinClamp(): Float = 0.0f
    open fun setLodMinClamp(lod_min_clamp: Float) {}

    open fun lodMaxClamp(): Float = Float.MAX_VALUE
    open fun setLodMaxClamp(lod_max_clamp: Float) {}

    open fun lodAverage(): Boolean = false
    open fun setLodAverage(lod_average: Boolean) {}

    open fun compareFunction(): MTLCompareFunction = MTLCompareFunction.Never
    open fun setCompareFunction(compare_function: MTLCompareFunction) {}

    open fun supportArgumentBuffers(): Boolean = false
    open fun setSupportArgumentBuffers(support_argument_buffers: Boolean) {}

    open fun label(): NSString? = null
    open fun setLabel(label: NSString?) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLSamplerDescriptor = MTLSamplerDescriptor()
        fun new(): MTLSamplerDescriptor = MTLSamplerDescriptor()
        fun default_retained(): MTLSamplerDescriptor = new()
    }
}

/**
 * An immutable collection of sampler state.
 */
interface MTLSamplerState : NSObjectProtocol {
    fun label(): NSString?
    fun device(): MTLDevice
    fun gpuResourceID(): MTLResourceID
}
