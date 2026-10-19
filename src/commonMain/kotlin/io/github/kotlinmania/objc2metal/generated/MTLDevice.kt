// port-lint: source generated/MTLDevice.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2foundation.NSError
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

typealias MTLDeviceNotificationName = NSString
typealias MTLDeviceNotificationHandler = (MTLDevice, MTLDeviceNotificationName) -> Unit
typealias MTLAutoreleasedRenderPipelineReflection = Any
typealias MTLAutoreleasedComputePipelineReflection = Any
typealias MTLNewLibraryCompletionHandler = (Any?, NSError?) -> Unit
typealias MTLNewRenderPipelineStateCompletionHandler = (Any?, NSError?) -> Unit
typealias MTLNewRenderPipelineStateWithReflectionCompletionHandler = (Any?, Any?, NSError?) -> Unit
typealias MTLNewComputePipelineStateCompletionHandler = (Any?, NSError?) -> Unit
typealias MTLNewComputePipelineStateWithReflectionCompletionHandler = (Any?, Any?, NSError?) -> Unit
typealias MTLTimestamp = ULong

data class MTLIOCompressionMethod(
    val rawValue: Long,
) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
        val Zlib = MTLIOCompressionMethod(0L)
        val LZFSE = MTLIOCompressionMethod(1L)
        val LZ4 = MTLIOCompressionMethod(2L)
        val LZMA = MTLIOCompressionMethod(3L)
        val LZBitmap = MTLIOCompressionMethod(4L)
    }
}

data class MTLFeatureSet(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
        val iOS_GPUFamily1_v1 = MTLFeatureSet(0uL)
        val iOS_GPUFamily2_v1 = MTLFeatureSet(1uL)
        val iOS_GPUFamily1_v2 = MTLFeatureSet(2uL)
        val iOS_GPUFamily2_v2 = MTLFeatureSet(3uL)
        val iOS_GPUFamily3_v1 = MTLFeatureSet(4uL)
        val iOS_GPUFamily1_v3 = MTLFeatureSet(5uL)
        val iOS_GPUFamily2_v3 = MTLFeatureSet(6uL)
        val iOS_GPUFamily3_v2 = MTLFeatureSet(7uL)
        val iOS_GPUFamily1_v4 = MTLFeatureSet(8uL)
        val iOS_GPUFamily2_v4 = MTLFeatureSet(9uL)
        val iOS_GPUFamily3_v3 = MTLFeatureSet(10uL)
        val iOS_GPUFamily4_v1 = MTLFeatureSet(11uL)
        val iOS_GPUFamily1_v5 = MTLFeatureSet(12uL)
        val iOS_GPUFamily2_v5 = MTLFeatureSet(13uL)
        val iOS_GPUFamily3_v4 = MTLFeatureSet(14uL)
        val iOS_GPUFamily4_v2 = MTLFeatureSet(15uL)
        val iOS_GPUFamily5_v1 = MTLFeatureSet(16uL)
        val macOS_GPUFamily1_v1 = MTLFeatureSet(10000uL)
        val OSX_GPUFamily1_v1 = macOS_GPUFamily1_v1
        val macOS_GPUFamily1_v2 = MTLFeatureSet(10001uL)
        val OSX_GPUFamily1_v2 = macOS_GPUFamily1_v2
        val macOS_ReadWriteTextureTier2 = MTLFeatureSet(10002uL)
        val OSX_ReadWriteTextureTier2 = macOS_ReadWriteTextureTier2
        val macOS_GPUFamily1_v3 = MTLFeatureSet(10003uL)
        val macOS_GPUFamily1_v4 = MTLFeatureSet(10004uL)
        val macOS_GPUFamily2_v1 = MTLFeatureSet(10005uL)
        val tvOS_GPUFamily1_v1 = MTLFeatureSet(30000uL)
        val TVOS_GPUFamily1_v1 = tvOS_GPUFamily1_v1
        val tvOS_GPUFamily1_v2 = MTLFeatureSet(30001uL)
        val tvOS_GPUFamily1_v3 = MTLFeatureSet(30002uL)
        val tvOS_GPUFamily2_v1 = MTLFeatureSet(30003uL)
        val tvOS_GPUFamily1_v4 = MTLFeatureSet(30004uL)
        val tvOS_GPUFamily2_v2 = MTLFeatureSet(30005uL)
    }
}

data class MTLGPUFamily(
    val rawValue: Long,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
        val Apple1 = MTLGPUFamily(1001L)
        val Apple2 = MTLGPUFamily(1002L)
        val Apple3 = MTLGPUFamily(1003L)
        val Apple4 = MTLGPUFamily(1004L)
        val Apple5 = MTLGPUFamily(1005L)
        val Apple6 = MTLGPUFamily(1006L)
        val Apple7 = MTLGPUFamily(1007L)
        val Apple8 = MTLGPUFamily(1008L)
        val Apple9 = MTLGPUFamily(1009L)
        val Mac1 = MTLGPUFamily(2001L)
        val Mac2 = MTLGPUFamily(2002L)
        val Common1 = MTLGPUFamily(3001L)
        val Common2 = MTLGPUFamily(3002L)
        val Common3 = MTLGPUFamily(3003L)
        val MacCatalyst1 = MTLGPUFamily(4001L)
        val MacCatalyst2 = MTLGPUFamily(4002L)
        val Metal3 = MTLGPUFamily(5001L)
    }
}

data class MTLDeviceLocation(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
        val BuiltIn = MTLDeviceLocation(0uL)
        val Slot = MTLDeviceLocation(1uL)
        val External = MTLDeviceLocation(2uL)
        val Unspecified = MTLDeviceLocation(ULong.MAX_VALUE)
    }
}

data class MTLPipelineOption(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
        val None = MTLPipelineOption(0uL)
        val ArgumentInfo = MTLPipelineOption(1uL shl 0)
        val BufferTypeInfo = MTLPipelineOption(1uL shl 1)
        val FailOnBinaryArchiveMiss = MTLPipelineOption(1uL shl 2)
    }
}

data class MTLReadWriteTextureTier(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
        val TierNone = MTLReadWriteTextureTier(0uL)
        val Tier1 = MTLReadWriteTextureTier(1uL)
        val Tier2 = MTLReadWriteTextureTier(2uL)
    }
}

data class MTLArgumentBuffersTier(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
        val Tier1 = MTLArgumentBuffersTier(0uL)
        val Tier2 = MTLArgumentBuffersTier(1uL)
    }
}

data class MTLSparseTextureRegionAlignmentMode(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
        val Outward = MTLSparseTextureRegionAlignmentMode(0uL)
        val Inward = MTLSparseTextureRegionAlignmentMode(1uL)
    }
}

data class MTLSparsePageSize(
    val rawValue: Long,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
        val Size16 = MTLSparsePageSize(101L)
        val Size64 = MTLSparsePageSize(102L)
        val Size256 = MTLSparsePageSize(103L)
    }
}

data class MTLAccelerationStructureSizes(
    val accelerationStructureSize: NSUInteger = 0uL,
    val buildScratchBufferSize: NSUInteger = 0uL,
    val refitScratchBufferSize: NSUInteger = 0uL,
) {
    companion object {
        const val ENCODING: String = "{?=QQQ}"
        const val ENCODING_REF: String = "^{?=QQQ}"
    }
}

data class MTLCounterSamplingPoint(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
        val AtStageBoundary = MTLCounterSamplingPoint(0uL)
        val AtDrawBoundary = MTLCounterSamplingPoint(1uL)
        val AtDispatchBoundary = MTLCounterSamplingPoint(2uL)
        val AtTileDispatchBoundary = MTLCounterSamplingPoint(3uL)
        val AtBlitBoundary = MTLCounterSamplingPoint(4uL)
    }
}

data class MTLSizeAndAlign(
    val size: NSUInteger = 0uL,
    val align: NSUInteger = 0uL,
) {
    companion object {
        const val ENCODING: String = "{?=QQ}"
        const val ENCODING_REF: String = "^{?=QQ}"
    }
}

open class MTLArgumentDescriptor : NSObject() {
    typealias Result = MTLArgumentDescriptor
}

open class MTLArchitecture : NSObject() {
    typealias Result = MTLArchitecture
}

interface MTLDevice : NSObjectProtocol {
    fun name(): NSString

    fun registryID(): ULong

    fun isLowPower(): Boolean

    fun isHeadless(): Boolean

    fun isRemovable(): Boolean

    fun hasUnifiedMemory(): Boolean

    fun recommendedMaxWorkingSetSize(): ULong

    fun location(): MTLDeviceLocation

    fun locationNumber(): NSUInteger

    fun maxTransferRate(): ULong

    fun isDepth24Stencil8PixelFormatSupported(): Boolean

    fun readWriteTextureSupport(): MTLReadWriteTextureTier

    fun argumentBuffersSupport(): MTLArgumentBuffersTier

    fun supports32BitFloatFiltering(): Boolean

    fun supports32BitMSAA(): Boolean

    fun supportsQueryTextureLOD(): Boolean

    fun supportsBCTextureCompression(): Boolean

    fun supportsPullModelInterpolation(): Boolean

    fun supportsShaderBarycentricCoordinates(): Boolean

    fun currentAllocatedSize(): NSUInteger

    fun newCommandQueue(): MTLCommandQueue?

    fun newCommandQueue(maxCommandBufferCount: NSUInteger): MTLCommandQueue?

    fun newCommandQueue(descriptor: MTLCommandQueueDescriptor): MTLCommandQueue?

    fun newBufferWithLength(length: NSUInteger, options: MTLResourceOptions): MTLBuffer?

    fun newTextureWithDescriptor(descriptor: MTLTextureDescriptor): MTLTexture?
}

fun MTLCreateSystemDefaultDevice(): MTLDevice? = null

fun MTLCopyAllDevicesWithObserver(
    observer: Any,
    handler: MTLDeviceNotificationHandler,
): NSArray<MTLDevice> = NSArray()
