// port-lint: source generated/MTLBuffer.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSRange
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * A typeless allocation accessible by both the CPU and the GPU (MTLDevice)
 * or by only the GPU when the storage mode is MTLResourceStorageModePrivate.
 */
interface MTLBuffer : MTLResource {
    fun length(): NSUInteger

    fun didModifyRange(range: NSRange)

    fun newTextureWithDescriptor(
        descriptor: MTLTextureDescriptor,
        offset: NSUInteger,
        bytesPerRow: NSUInteger,
    ): MTLTexture?

    fun addDebugMarker(marker: NSString, range: NSRange)

    fun removeAllDebugMarkers()

    fun remoteStorageBuffer(): MTLBuffer?

    fun newRemoteBufferViewForDevice(device: MTLDevice): MTLBuffer?

    fun gpuAddress(): ULong
}
