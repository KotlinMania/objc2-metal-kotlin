// port-lint: source generated/MTLCommandEncoder.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Describes how a resource will be used by a shader through an argument buffer.
 */
data class MTLResourceUsage(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Read = MTLResourceUsage(1uL shl 0)
        val Write = MTLResourceUsage(1uL shl 1)
        val Sample = MTLResourceUsage(1uL shl 2)
    }
}

/**
 * Describes the types of resources that a barrier operates on.
 */
data class MTLBarrierScope(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Buffers = MTLBarrierScope(1uL shl 0)
        val Textures = MTLBarrierScope(1uL shl 1)
        val RenderTargets = MTLBarrierScope(1uL shl 2)
    }
}

/**
 * Common interface for objects that write commands into command buffers.
 */
interface MTLCommandEncoder : NSObjectProtocol {
    fun device(): MTLDevice
    fun label(): NSString?
    fun setLabel(label: NSString?)
    fun endEncoding()
    fun insertDebugSignpost(string: NSString)
    fun pushDebugGroup(string: NSString)
    fun popDebugGroup()
}
