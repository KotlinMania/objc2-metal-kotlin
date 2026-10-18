// port-lint: source generated/MTLBlitCommandEncoder.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSRange
import io.github.kotlinmania.objc2foundation.NSUInteger
import io.github.kotlinmania.objc2metal.MTLOrigin
import io.github.kotlinmania.objc2metal.MTLRegion
import io.github.kotlinmania.objc2metal.MTLSize

/**
 * Controls the blit operation.
 */
data class MTLBlitOption(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val None = MTLBlitOption(0uL)
        val DepthFromDepthStencil = MTLBlitOption(1uL shl 0)
        val StencilFromDepthStencil = MTLBlitOption(1uL shl 1)
        val RowLinearPVRTC = MTLBlitOption(1uL shl 2)
    }
}

/**
 * A command encoder that performs basic copies and blits between buffers and textures.
 */
interface MTLBlitCommandEncoder : MTLCommandEncoder {
    fun synchronizeResource(resource: MTLResource)
    fun synchronizeTexture(texture: MTLTexture, slice: NSUInteger, level: NSUInteger)
    fun copyFromTexture(
        sourceTexture: MTLTexture,
        sourceSlice: NSUInteger,
        sourceLevel: NSUInteger,
        sourceOrigin: MTLOrigin,
        sourceSize: MTLSize,
        destinationTexture: MTLTexture,
        destinationSlice: NSUInteger,
        destinationLevel: NSUInteger,
        destinationOrigin: MTLOrigin,
    )
    fun copyFromBuffer(
        sourceBuffer: MTLBuffer,
        sourceOffset: NSUInteger,
        sourceBytesPerRow: NSUInteger,
        sourceBytesPerImage: NSUInteger,
        sourceSize: MTLSize,
        destinationTexture: MTLTexture,
        destinationSlice: NSUInteger,
        destinationLevel: NSUInteger,
        destinationOrigin: MTLOrigin,
    )
    fun copyFromBuffer(
        sourceBuffer: MTLBuffer,
        sourceOffset: NSUInteger,
        sourceBytesPerRow: NSUInteger,
        sourceBytesPerImage: NSUInteger,
        sourceSize: MTLSize,
        destinationTexture: MTLTexture,
        destinationSlice: NSUInteger,
        destinationLevel: NSUInteger,
        destinationOrigin: MTLOrigin,
        options: MTLBlitOption,
    )
    fun copyFromTexture(
        sourceTexture: MTLTexture,
        sourceSlice: NSUInteger,
        sourceLevel: NSUInteger,
        sourceOrigin: MTLOrigin,
        sourceSize: MTLSize,
        destinationBuffer: MTLBuffer,
        destinationOffset: NSUInteger,
        destinationBytesPerRow: NSUInteger,
        destinationBytesPerImage: NSUInteger,
    )
    fun copyFromTexture(
        sourceTexture: MTLTexture,
        sourceSlice: NSUInteger,
        sourceLevel: NSUInteger,
        sourceOrigin: MTLOrigin,
        sourceSize: MTLSize,
        destinationBuffer: MTLBuffer,
        destinationOffset: NSUInteger,
        destinationBytesPerRow: NSUInteger,
        destinationBytesPerImage: NSUInteger,
        options: MTLBlitOption,
    )
    fun generateMipmapsForTexture(texture: MTLTexture)
    fun fillBuffer(buffer: MTLBuffer, range: NSRange, value: UByte)
    fun copyFromTexture(
        sourceTexture: MTLTexture,
        sourceSlice: NSUInteger,
        sourceLevel: NSUInteger,
        toTexture: MTLTexture,
        destinationSlice: NSUInteger,
        destinationLevel: NSUInteger,
        sliceCount: NSUInteger,
        levelCount: NSUInteger,
    )
    fun copyFromTexture(sourceTexture: MTLTexture, toTexture: MTLTexture)
    fun copyFromBuffer(
        sourceBuffer: MTLBuffer,
        sourceOffset: NSUInteger,
        destinationBuffer: MTLBuffer,
        destinationOffset: NSUInteger,
        size: NSUInteger,
    )
    fun updateFence(fence: Any)
    fun waitForFence(fence: Any)
    fun getTextureAccessCounters(
        texture: MTLTexture,
        region: MTLRegion,
        mipLevel: NSUInteger,
        slice: NSUInteger,
        resetCounters: Boolean,
        countersBuffer: MTLBuffer,
        countersBufferOffset: NSUInteger,
    )
    fun resetTextureAccessCounters(
        texture: MTLTexture,
        region: MTLRegion,
        mipLevel: NSUInteger,
        slice: NSUInteger,
    )
    fun optimizeContentsForGPUAccess(texture: MTLTexture)
    fun optimizeContentsForGPUAccess(texture: MTLTexture, slice: NSUInteger, level: NSUInteger)
    fun optimizeContentsForCPUAccess(texture: MTLTexture)
    fun optimizeContentsForCPUAccess(texture: MTLTexture, slice: NSUInteger, level: NSUInteger)
    fun resetCommandsInBuffer(buffer: Any, range: NSRange)
    fun copyIndirectCommandBuffer(
        source: Any,
        sourceRange: NSRange,
        destination: Any,
        destinationIndex: NSUInteger,
    )
    fun optimizeIndirectCommandBuffer(indirectCommandBuffer: Any, range: NSRange)
    fun sampleCountersInBuffer(sampleBuffer: Any, sampleIndex: NSUInteger, barrier: Boolean)
    fun resolveCounters(
        sampleBuffer: Any,
        range: NSRange,
        destinationBuffer: MTLBuffer,
        destinationOffset: NSUInteger,
    )
}
