// port-lint: source generated/MTLHeap.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Describes the mode of operation for an MTLHeap.
 */
data class MTLHeapType(val rawValue: NSInteger) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val Automatic = MTLHeapType(0L)
        val Placement = MTLHeapType(1L)
        val Sparse = MTLHeapType(2L)
    }
}

open class MTLHeapDescriptor : NSObject() {
    typealias Result = MTLHeapDescriptor

    var size: NSUInteger = 0uL
    var storageMode: MTLStorageMode = MTLStorageMode.Private
    var cpuCacheMode: MTLCPUCacheMode = MTLCPUCacheMode.DefaultCache
    var hazardTrackingMode: MTLHazardTrackingMode = MTLHazardTrackingMode.Default
    var resourceOptions: MTLResourceOptions = MTLResourceOptions(0uL)
    var type: MTLHeapType = MTLHeapType.Automatic

    companion object {
        fun defaultRetained(): MTLHeapDescriptor = MTLHeapDescriptor()
    }
}

interface MTLHeap : MTLAllocation {
    fun label(): NSString?
    fun setLabel(label: NSString?)
    fun device(): MTLDevice
    fun storageMode(): MTLStorageMode
    fun cpuCacheMode(): MTLCPUCacheMode
    fun hazardTrackingMode(): MTLHazardTrackingMode
    fun resourceOptions(): MTLResourceOptions
    fun size(): NSUInteger
    fun usedSize(): NSUInteger
    fun currentAllocatedSize(): NSUInteger
    fun maxAvailableSizeWithAlignment(alignment: NSUInteger): NSUInteger
    fun newBufferWithLength(length: NSUInteger, options: MTLResourceOptions): MTLBuffer?
    fun newTextureWithDescriptor(descriptor: MTLTextureDescriptor): MTLTexture?
    fun setPurgeableState(state: MTLPurgeableState): MTLPurgeableState
    fun type(): MTLHeapType
    fun newBufferWithLength(length: NSUInteger, options: MTLResourceOptions, offset: NSUInteger): MTLBuffer?
    fun newTextureWithDescriptor(descriptor: MTLTextureDescriptor, offset: NSUInteger): MTLTexture?
}
