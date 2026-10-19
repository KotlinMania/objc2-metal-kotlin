// port-lint: source generated/MTLVisibleFunctionTable.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSRange
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlvisiblefunctiontabledescriptor?language=objc)
 */
open class MTLVisibleFunctionTableDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLVisibleFunctionTableDescriptor

    open fun functionCount(): NSUInteger = 0uL

    open fun setFunctionCount(function_count: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun visibleFunctionTableDescriptor(): MTLVisibleFunctionTableDescriptor =
            MTLVisibleFunctionTableDescriptor()

        fun init(): MTLVisibleFunctionTableDescriptor = MTLVisibleFunctionTableDescriptor()

        fun new(): MTLVisibleFunctionTableDescriptor = MTLVisibleFunctionTableDescriptor()

        fun default_retained(): MTLVisibleFunctionTableDescriptor = new()
    }
}

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlvisiblefunctiontable?language=objc)
 */
interface MTLVisibleFunctionTable : MTLResource {
    fun gpuResourceID(): MTLResourceID

    fun setFunction_atIndex(
        function: MTLFunctionHandle?,
        index: NSUInteger,
    )

    fun setFunctions_withRange(
        functions: List<MTLFunctionHandle>,
        range: NSRange,
    )
}
