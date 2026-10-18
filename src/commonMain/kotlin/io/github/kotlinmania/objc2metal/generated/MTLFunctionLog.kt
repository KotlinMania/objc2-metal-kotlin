// port-lint: source generated/MTLFunctionLog.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSFastEnumeration
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger
import io.github.kotlinmania.objc2foundation.generated.NSURL

/**
 * Type of function log.
 */
data class MTLFunctionLogType(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Validation = MTLFunctionLogType(0uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Container for log items.
 */
interface MTLLogContainer : NSObjectProtocol, NSFastEnumeration

/**
 * Debug location for a function log.
 */
interface MTLFunctionLogDebugLocation : NSObjectProtocol {
    fun functionName(): NSString?
    fun URL(): NSURL?
    fun line(): NSUInteger
    fun column(): NSUInteger
}

/**
 * A log item from a function.
 */
interface MTLFunctionLog : NSObjectProtocol {
    fun type(): MTLFunctionLogType
    fun encoderLabel(): NSString?
    fun function(): MTLFunction?
    fun debugLocation(): MTLFunctionLogDebugLocation?
}
