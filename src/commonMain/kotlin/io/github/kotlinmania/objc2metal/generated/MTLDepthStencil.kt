// port-lint: source generated/MTLDepthStencil.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Compare function for depth and stencil tests.
 */
data class MTLCompareFunction(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Never = MTLCompareFunction(0uL)
        val Less = MTLCompareFunction(1uL)
        val Equal = MTLCompareFunction(2uL)
        val LessEqual = MTLCompareFunction(3uL)
        val Greater = MTLCompareFunction(4uL)
        val NotEqual = MTLCompareFunction(5uL)
        val GreaterEqual = MTLCompareFunction(6uL)
        val Always = MTLCompareFunction(7uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Stencil operation to perform when tests pass or fail.
 */
data class MTLStencilOperation(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Keep = MTLStencilOperation(0uL)
        val Zero = MTLStencilOperation(1uL)
        val Replace = MTLStencilOperation(2uL)
        val IncrementClamp = MTLStencilOperation(3uL)
        val DecrementClamp = MTLStencilOperation(4uL)
        val Invert = MTLStencilOperation(5uL)
        val IncrementWrap = MTLStencilOperation(6uL)
        val DecrementWrap = MTLStencilOperation(7uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Stencil descriptor for depth/stencil state.
 */
open class MTLStencilDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLStencilDescriptor

    open fun stencilCompareFunction(): MTLCompareFunction = MTLCompareFunction.Always
    open fun setStencilCompareFunction(stencil_compare_function: MTLCompareFunction) {}

    open fun stencilFailureOperation(): MTLStencilOperation = MTLStencilOperation.Keep
    open fun setStencilFailureOperation(stencil_failure_operation: MTLStencilOperation) {}

    open fun depthFailureOperation(): MTLStencilOperation = MTLStencilOperation.Keep
    open fun setDepthFailureOperation(depth_failure_operation: MTLStencilOperation) {}

    open fun depthStencilPassOperation(): MTLStencilOperation = MTLStencilOperation.Keep
    open fun setDepthStencilPassOperation(depth_stencil_pass_operation: MTLStencilOperation) {}

    open fun readMask(): UInt = 0u
    open fun setReadMask(read_mask: UInt) {}

    open fun writeMask(): UInt = 0u
    open fun setWriteMask(write_mask: UInt) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLStencilDescriptor = MTLStencilDescriptor()
        fun new(): MTLStencilDescriptor = MTLStencilDescriptor()
    }
}

/**
 * Descriptor for depth/stencil state.
 */
open class MTLDepthStencilDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLDepthStencilDescriptor

    open fun depthCompareFunction(): MTLCompareFunction = MTLCompareFunction.Always
    open fun setDepthCompareFunction(depth_compare_function: MTLCompareFunction) {}

    open fun isDepthWriteEnabled(): Boolean = false
    open fun setDepthWriteEnabled(depth_write_enabled: Boolean) {}

    open fun frontFaceStencil(): MTLStencilDescriptor = MTLStencilDescriptor()
    open fun setFrontFaceStencil(front_face_stencil: MTLStencilDescriptor?) {}

    open fun backFaceStencil(): MTLStencilDescriptor = MTLStencilDescriptor()
    open fun setBackFaceStencil(back_face_stencil: MTLStencilDescriptor?) {}

    open fun label(): NSString? = null
    open fun setLabel(label: NSString?) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLDepthStencilDescriptor = MTLDepthStencilDescriptor()
        fun new(): MTLDepthStencilDescriptor = MTLDepthStencilDescriptor()
    }
}

/**
 * Depth and stencil state object.
 */
interface MTLDepthStencilState : NSObjectProtocol {
    fun label(): NSString?
    fun device(): MTLDevice
}
