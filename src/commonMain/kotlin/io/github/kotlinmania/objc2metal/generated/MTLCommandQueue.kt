// port-lint: source generated/MTLCommandQueue.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Descriptor for creating command queues.
 */
open class MTLCommandQueueDescriptor : NSObject() {
    typealias Result = MTLCommandQueueDescriptor

    var maxCommandBufferCount: NSUInteger = 64uL
}

/**
 * A serial queue of command buffers to be executed by the device.
 */
interface MTLCommandQueue : NSObjectProtocol {
    fun label(): NSString?
    fun setLabel(label: NSString?)
    fun device(): MTLDevice
    fun commandBuffer(): MTLCommandBuffer?
    fun commandBufferWithUnretainedReferences(): MTLCommandBuffer?
    fun insertDebugCaptureBoundary()
}
