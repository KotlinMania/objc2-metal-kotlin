// port-lint: source generated/MTLIOCommandBuffer.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString

/**
 * Status of an IO command buffer.
 */
data class MTLIOStatus(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val Pending = MTLIOStatus(0L)
        val Cancelled = MTLIOStatus(1L)
        val Error = MTLIOStatus(2L)
        val Complete = MTLIOStatus(3L)

        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * Completion handler for MTLIOCommandBuffer.
 */
typealias MTLIOCommandBufferHandler = (MTLIOCommandBuffer) -> Unit

/**
 * Represents a list of IO commands for a queue to execute.
 */
interface MTLIOCommandBuffer : NSObjectProtocol {
    fun addCompletedHandler(block: MTLIOCommandBufferHandler)

    fun status(): MTLIOStatus

    fun error(): Any?

    fun label(): NSString?

    fun setLabel(label: NSString?)

    fun enqueue()

    fun waitForCompletion()

    fun tryCancel()

    fun waitUntilCompleted()
}
