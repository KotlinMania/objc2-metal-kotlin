// port-lint: source generated/MTLLogState.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSErrorDomain
import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Level of a log entry.
 */
data class MTLLogLevel(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val Undefined = MTLLogLevel(0L)
        val Debug = MTLLogLevel(1L)
        val Info = MTLLogLevel(2L)
        val Notice = MTLLogLevel(3L)
        val Error = MTLLogLevel(4L)
        val Fault = MTLLogLevel(5L)

        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * State of logging.
 */
interface MTLLogState : NSObjectProtocol {
    fun addLogHandler(block: (NSString?, NSString?, MTLLogLevel, NSString) -> Unit)
}

/**
 * Descriptor for log state.
 */
open class MTLLogStateDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLLogStateDescriptor

    open fun level(): MTLLogLevel = MTLLogLevel.Undefined
    open fun setLevel(level: MTLLogLevel) {}

    open fun bufferSize(): NSInteger = 1024L
    open fun setBufferSize(buffer_size: NSInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLLogStateDescriptor = MTLLogStateDescriptor()
        fun new(): MTLLogStateDescriptor = MTLLogStateDescriptor()
    }
}

val MTLLogStateErrorDomain: NSErrorDomain = NSString("MTLLogStateErrorDomain")

/**
 * Error codes for MTLLogState.
 */
data class MTLLogStateError(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val InvalidSize = MTLLogStateError(1uL)
        val Invalid = MTLLogStateError(2uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}
