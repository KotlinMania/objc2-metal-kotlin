// port-lint: source generated/MTLCommandBuffer.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Status of a command buffer.
 */
data class MTLCommandBufferStatus(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val NotEnqueued = MTLCommandBufferStatus(0uL)
        val Enqueued = MTLCommandBufferStatus(1uL)
        val Committed = MTLCommandBufferStatus(2uL)
        val Scheduled = MTLCommandBufferStatus(3uL)
        val Completed = MTLCommandBufferStatus(4uL)
        val Error = MTLCommandBufferStatus(5uL)
    }
}

/**
 * Error codes for command buffer execution.
 */
data class MTLCommandBufferError(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val None = MTLCommandBufferError(0uL)
        val Internal = MTLCommandBufferError(1uL)
        val Timeout = MTLCommandBufferError(2uL)
        val PageFault = MTLCommandBufferError(3uL)
        val Blacklisted = MTLCommandBufferError(4uL)
        val AccessRevoked = MTLCommandBufferError(5uL)
        val NotPermitted = MTLCommandBufferError(6uL)
        val OutOfMemory = MTLCommandBufferError(7uL)
        val InvalidResource = MTLCommandBufferError(8uL)
        val Memoryless = MTLCommandBufferError(9uL)
        val DeviceRemoved = MTLCommandBufferError(10uL)
        val StackOverflow = MTLCommandBufferError(11uL)
    }
}

/**
 * Error options for command buffer execution.
 */
data class MTLCommandBufferErrorOption(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Command encoder error state.
 */
data class MTLCommandEncoderErrorState(
    val rawValue: Long,
) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val Unknown = MTLCommandEncoderErrorState(0L)
        val Completed = MTLCommandEncoderErrorState(1L)
        val Affected = MTLCommandEncoderErrorState(2L)
        val Pending = MTLCommandEncoderErrorState(3L)
        val Faulted = MTLCommandEncoderErrorState(4L)
    }
}

/**
 * Dispatch type for command buffers.
 */
data class MTLDispatchType(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Serial = MTLDispatchType(0uL)
        val Concurrent = MTLDispatchType(1uL)
    }
}

/**
 * Callback handler for command buffer status changes.
 */
typealias MTLCommandBufferHandler = (MTLCommandBuffer) -> Unit

/**
 * Descriptor for configuring command buffers.
 */
open class MTLCommandBufferDescriptor : NSObject() {
    typealias Result = MTLCommandBufferDescriptor

    var retainedReferences: Boolean = true
    var errorOptions: MTLCommandBufferErrorOption = MTLCommandBufferErrorOption(0uL)
}

/**
 * A container that stores encoded commands for the GPU to execute.
 */
interface MTLCommandBuffer : NSObjectProtocol {
    fun device(): MTLDevice

    fun commandQueue(): MTLCommandQueue

    fun retainedReferences(): Boolean

    fun label(): NSString?

    fun setLabel(label: NSString?)

    fun status(): MTLCommandBufferStatus

    fun enqueue()

    fun commit()

    fun addScheduledHandler(block: MTLCommandBufferHandler)

    fun waitUntilScheduled()

    fun addCompletedHandler(block: MTLCommandBufferHandler)

    fun waitUntilCompleted()

    fun renderCommandEncoderWithDescriptor(renderPassDescriptor: MTLRenderPassDescriptor): MTLRenderCommandEncoder?

    fun computeCommandEncoder(): MTLComputeCommandEncoder?

    fun blitCommandEncoder(): MTLBlitCommandEncoder?
}
