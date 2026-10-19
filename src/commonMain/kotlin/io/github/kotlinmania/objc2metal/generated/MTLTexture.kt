// port-lint: source generated/MTLTexture.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSRange
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Type of a Metal texture.
 */
data class MTLTextureType(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Type1D = MTLTextureType(0uL)
        val Type1DArray = MTLTextureType(1uL)
        val Type2D = MTLTextureType(2uL)
        val Type2DArray = MTLTextureType(3uL)
        val Type2DMultisample = MTLTextureType(4uL)
        val TypeCube = MTLTextureType(5uL)
        val TypeCubeArray = MTLTextureType(6uL)
        val Type3D = MTLTextureType(7uL)
        val Type2DMultisampleArray = MTLTextureType(8uL)
        val TypeTextureBuffer = MTLTextureType(9uL)
    }
}

/**
 * Texture swizzle value.
 */
data class MTLTextureSwizzle(
    val rawValue: UByte,
) {
    companion object {
        const val ENCODING: String = "C"
        const val ENCODING_REF: String = "^C"

        val Zero = MTLTextureSwizzle(0u)
        val One = MTLTextureSwizzle(1u)
        val Red = MTLTextureSwizzle(2u)
        val Green = MTLTextureSwizzle(3u)
        val Blue = MTLTextureSwizzle(4u)
        val Alpha = MTLTextureSwizzle(5u)
    }
}

/**
 * Texture swizzle channel mappings.
 */
data class MTLTextureSwizzleChannels(
    val red: MTLTextureSwizzle = MTLTextureSwizzle.Red,
    val green: MTLTextureSwizzle = MTLTextureSwizzle.Green,
    val blue: MTLTextureSwizzle = MTLTextureSwizzle.Blue,
    val alpha: MTLTextureSwizzle = MTLTextureSwizzle.Alpha,
) {
    companion object {
        const val ENCODING: String = "{?=CCCC}"
        const val ENCODING_REF: String = "^{?=CCCC}"

        fun make(
            r: MTLTextureSwizzle,
            g: MTLTextureSwizzle,
            b: MTLTextureSwizzle,
            a: MTLTextureSwizzle,
        ): MTLTextureSwizzleChannels =
            MTLTextureSwizzleChannels(r, g, b, a)
    }
}

/**
 * Shared texture handle.
 */
open class MTLSharedTextureHandle : NSObject() {
    fun device(): MTLDevice = error("Unimplemented")

    fun label(): NSString? = null
}

/**
 * Options declaring how the texture will be used over its lifetime.
 */
data class MTLTextureUsage(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Unknown = MTLTextureUsage(0x0000uL)
        val ShaderRead = MTLTextureUsage(0x0001uL)
        val ShaderWrite = MTLTextureUsage(0x0002uL)
        val RenderTarget = MTLTextureUsage(0x0004uL)
        val PixelFormatView = MTLTextureUsage(0x0010uL)
        val ShaderAtomic = MTLTextureUsage(0x0020uL)
    }
}

/**
 * Texture compression type.
 */
data class MTLTextureCompressionType(
    val rawValue: Long,
) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val Lossless = MTLTextureCompressionType(0L)
        val Lossy = MTLTextureCompressionType(1L)
    }
}

/**
 * Descriptor for creating textures.
 */
open class MTLTextureDescriptor : NSObject() {
    typealias Result = MTLTextureDescriptor

    var textureType: MTLTextureType = MTLTextureType.Type2D
    var pixelFormat: MTLPixelFormat = MTLPixelFormat.RGBA8Unorm
    var width: NSUInteger = 1uL
    var height: NSUInteger = 1uL
    var depth: NSUInteger = 1uL
    var mipmapLevelCount: NSUInteger = 1uL
    var sampleCount: NSUInteger = 1uL
    var arrayLength: NSUInteger = 1uL
    var resourceOptions: MTLResourceOptions = MTLResourceOptions(0uL)
    var cpuCacheMode: MTLCPUCacheMode = MTLCPUCacheMode.DefaultCache
    var storageMode: MTLStorageMode = MTLStorageMode.Shared
    var hazardTrackingMode: MTLHazardTrackingMode = MTLHazardTrackingMode.Default
    var usage: MTLTextureUsage = MTLTextureUsage.ShaderRead
    var allowGPUOptimizedContents: Boolean = true
    var compressionType: MTLTextureCompressionType = MTLTextureCompressionType.Lossless
    var swizzle: MTLTextureSwizzleChannels = MTLTextureSwizzleChannels()

    companion object {
        fun texture2DDescriptorWithPixelFormat(
            pixelFormat: MTLPixelFormat,
            width: NSUInteger,
            height: NSUInteger,
            mipmapped: Boolean,
        ): MTLTextureDescriptor {
            val desc = MTLTextureDescriptor()
            desc.textureType = MTLTextureType.Type2D
            desc.pixelFormat = pixelFormat
            desc.width = width
            desc.height = height
            desc.mipmapLevelCount = if (mipmapped) 1uL else 1uL
            return desc
        }

        fun textureCubeDescriptorWithPixelFormat(
            pixelFormat: MTLPixelFormat,
            size: NSUInteger,
            mipmapped: Boolean,
        ): MTLTextureDescriptor {
            val desc = MTLTextureDescriptor()
            desc.textureType = MTLTextureType.TypeCube
            desc.pixelFormat = pixelFormat
            desc.width = size
            desc.height = size
            desc.mipmapLevelCount = if (mipmapped) 1uL else 1uL
            return desc
        }

        fun textureBufferDescriptorWithPixelFormat(
            pixelFormat: MTLPixelFormat,
            width: NSUInteger,
            resourceOptions: MTLResourceOptions,
            usage: MTLTextureUsage,
        ): MTLTextureDescriptor {
            val desc = MTLTextureDescriptor()
            desc.textureType = MTLTextureType.TypeTextureBuffer
            desc.pixelFormat = pixelFormat
            desc.width = width
            desc.resourceOptions = resourceOptions
            desc.usage = usage
            return desc
        }
    }
}

/**
 * Protocol representing a Metal texture resource.
 */
interface MTLTexture : MTLResource {
    fun iosurfacePlane(): NSUInteger

    fun textureType(): MTLTextureType

    fun pixelFormat(): MTLPixelFormat

    fun width(): NSUInteger

    fun height(): NSUInteger

    fun depth(): NSUInteger

    fun mipmapLevelCount(): NSUInteger

    fun sampleCount(): NSUInteger

    fun arrayLength(): NSUInteger

    fun usage(): MTLTextureUsage

    fun isShareable(): Boolean

    fun isFramebufferOnly(): Boolean

    fun firstMipmapInTail(): NSUInteger

    fun tailSizeInBytes(): NSUInteger

    fun isSparse(): Boolean

    fun allowGPUOptimizedContents(): Boolean

    fun compressionType(): MTLTextureCompressionType

    fun gpuResourceID(): MTLResourceID

    fun newTextureViewWithPixelFormat(pixelFormat: MTLPixelFormat): MTLTexture?

    fun newTextureViewWithPixelFormat(
        pixelFormat: MTLPixelFormat,
        textureType: MTLTextureType,
        levelRange: NSRange,
        sliceRange: NSRange,
    ): MTLTexture?

    fun newSharedTextureHandle(): MTLSharedTextureHandle?

    fun remoteStorageTexture(): MTLTexture?

    fun newRemoteTextureViewForDevice(device: MTLDevice): MTLTexture?

    fun swizzle(): MTLTextureSwizzleChannels

    fun newTextureViewWithPixelFormat(
        pixelFormat: MTLPixelFormat,
        textureType: MTLTextureType,
        levelRange: NSRange,
        sliceRange: NSRange,
        swizzle: MTLTextureSwizzleChannels,
    ): MTLTexture?
}
