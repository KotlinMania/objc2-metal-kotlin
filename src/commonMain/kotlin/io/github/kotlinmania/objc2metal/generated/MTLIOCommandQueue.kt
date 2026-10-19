// port-lint: source generated/MTLIOCommandQueue.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger
import io.github.kotlinmania.objc2foundation.generated.NSErrorDomain

/**
 * Priority for MTLIOCommandQueue.
 */
data class MTLIOPriority(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val High = MTLIOPriority(0L)
        val Normal = MTLIOPriority(1L)
        val Low = MTLIOPriority(2L)

        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * Type of MTLIOCommandQueue.
 */
data class MTLIOCommandQueueType(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val Concurrent = MTLIOCommandQueueType(0L)
        val Serial = MTLIOCommandQueueType(1L)

        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

val MTLIOErrorDomain: NSErrorDomain = NSString("MTLIOErrorDomain")

/**
 * Error codes for MTLIO.
 */
data class MTLIOError(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val URLInvalid = MTLIOError(1L)
        val Internal = MTLIOError(2L)

        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * Queue that schedules command buffers for IO commands.
 */
interface MTLIOCommandQueue : NSObjectProtocol {
    fun enqueueBarrier()

    fun commandBuffer(): MTLIOCommandBuffer

    fun commandBufferWithUnretainedReferences(): MTLIOCommandBuffer

    fun label(): NSString?

    fun setLabel(label: NSString?)
}

/**
 * Protocol for scratch buffer used by IO commands.
 */
interface MTLIOScratchBuffer : NSObjectProtocol {
    fun buffer(): MTLBuffer
}

/**
 * Allocator for scratch buffers.
 */
interface MTLIOScratchBufferAllocator : NSObjectProtocol {
    fun newScratchBufferWithMinimumSize(minimum_size: NSUInteger): MTLIOScratchBuffer?
}

/**
 * File handle for IO commands.
 */
interface MTLIOFileHandle : NSObjectProtocol {
    fun label(): NSString?

    fun setLabel(label: NSString?)
}

/**
 * Descriptor for creating an MTLIOCommandQueue.
 */
open class MTLIOCommandQueueDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLIOCommandQueueDescriptor

    open fun maxCommandBufferCount(): NSUInteger = 0uL

    open fun setMaxCommandBufferCount(max_command_buffer_count: NSUInteger) {}

    open fun priority(): MTLIOPriority = MTLIOPriority.Normal

    open fun setPriority(priority: MTLIOPriority) {}

    open fun type(): MTLIOCommandQueueType = MTLIOCommandQueueType.Concurrent

    open fun setType(type: MTLIOCommandQueueType) {}

    open fun maxCommandsInFlight(): NSUInteger = 0uL

    open fun setMaxCommandsInFlight(max_commands_in_flight: NSUInteger) {}

    open fun scratchBufferAllocator(): MTLIOScratchBufferAllocator? = null

    open fun setScratchBufferAllocator(scratch_buffer_allocator: MTLIOScratchBufferAllocator?) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLIOCommandQueueDescriptor = MTLIOCommandQueueDescriptor()

        fun new(): MTLIOCommandQueueDescriptor = MTLIOCommandQueueDescriptor()
    }
}
