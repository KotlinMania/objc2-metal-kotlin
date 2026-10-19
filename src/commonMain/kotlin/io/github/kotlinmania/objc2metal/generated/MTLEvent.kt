// port-lint: source generated/MTLEvent.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCoder
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.generated.NSCoding
import io.github.kotlinmania.objc2foundation.generated.NSSecureCoding

/**
 * Protocol for Metal events.
 */
interface MTLEvent : NSObjectProtocol {
    fun device(): MTLDevice?

    fun label(): NSString?

    fun setLabel(label: NSString?)
}

/**
 * Listener for shared events.
 */
open class MTLSharedEventListener : NSObject() {
    companion object {
        fun init(): MTLSharedEventListener = MTLSharedEventListener()

        fun new(): MTLSharedEventListener = MTLSharedEventListener()

        fun default_retained(): MTLSharedEventListener = new()
    }
}

/**
 * Notification block for shared events.
 */
typealias MTLSharedEventNotificationBlock = (MTLSharedEvent, ULong) -> Unit

/**
 * Protocol for shared Metal events.
 */
interface MTLSharedEvent : MTLEvent {
    fun notifyListener_atValue_block(
        listener: MTLSharedEventListener,
        value: ULong,
        block: MTLSharedEventNotificationBlock,
    )

    fun newSharedEventHandle(): MTLSharedEventHandle

    fun waitUntilSignaledValue_timeoutMS(value: ULong, milliseconds: ULong): Boolean

    fun signaledValue(): ULong

    fun setSignaledValue(signaled_value: ULong)
}

/**
 * Handle for shared events.
 */
open class MTLSharedEventHandle :
    NSObject(),
    NSCoding,
    NSSecureCoding {
    open fun label(): NSString? = null

    override fun encodeWithCoder(coder: NSCoder) {}

    override fun initWithCoder(coder: NSCoder): Any? = this

    companion object {
        fun init(): MTLSharedEventHandle = MTLSharedEventHandle()

        fun new(): MTLSharedEventHandle = MTLSharedEventHandle()
    }
}
