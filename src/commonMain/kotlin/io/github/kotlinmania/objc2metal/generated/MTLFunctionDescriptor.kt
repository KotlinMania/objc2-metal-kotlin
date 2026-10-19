// port-lint: source generated/MTLFunctionDescriptor.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Options for MTLFunction.
 */
data class MTLFunctionOptions(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val None = MTLFunctionOptions(0uL)
        val CompileToBinary = MTLFunctionOptions(1uL shl 0)
        val StoreFunctionInMetalPipelinesScript = MTLFunctionOptions(1uL shl 1)
        val StoreFunctionInMetalScript = MTLFunctionOptions(1uL shl 1)
        val FailOnBinaryArchiveMiss = MTLFunctionOptions(1uL shl 2)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Descriptor for creating an MTLFunction.
 */
open class MTLFunctionDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLFunctionDescriptor

    open fun name(): NSString? = null

    open fun setName(name: NSString?) {}

    open fun specializedName(): NSString? = null

    open fun setSpecializedName(specialized_name: NSString?) {}

    open fun constantValues(): MTLFunctionConstantValues? = null

    open fun setConstantValues(constant_values: MTLFunctionConstantValues?) {}

    open fun options(): MTLFunctionOptions = MTLFunctionOptions.None

    open fun setOptions(options: MTLFunctionOptions) {}

    open fun binaryArchives(): NSArray<MTLBinaryArchive>? = null

    open fun setBinaryArchives(binary_archives: NSArray<MTLBinaryArchive>?) {}

    override fun copy(): Any = this

    companion object {
        fun functionDescriptor(): MTLFunctionDescriptor = MTLFunctionDescriptor()

        fun init(): MTLFunctionDescriptor = MTLFunctionDescriptor()

        fun new(): MTLFunctionDescriptor = MTLFunctionDescriptor()

        fun default_retained(): MTLFunctionDescriptor = new()
    }
}

/**
 * Descriptor for creating an intersection function.
 */
open class MTLIntersectionFunctionDescriptor : MTLFunctionDescriptor() {
    typealias Result = MTLIntersectionFunctionDescriptor

    companion object {
        fun init(): MTLIntersectionFunctionDescriptor = MTLIntersectionFunctionDescriptor()

        fun new(): MTLIntersectionFunctionDescriptor = MTLIntersectionFunctionDescriptor()
    }
}
