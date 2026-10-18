// port-lint: source generated/MTLIntersectionFunctionTable.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.bitflags.BitFlags
import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSRange
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Signature defining what data is provided to an intersection function.
 */
data class MTLIntersectionFunctionSignature(
    override val rawValue: NSUInteger = 0uL,
) : BitFlags<MTLIntersectionFunctionSignature, NSUInteger> {

    override fun create(value: NSUInteger): MTLIntersectionFunctionSignature = MTLIntersectionFunctionSignature(value)

    companion object {
        val None = MTLIntersectionFunctionSignature(0uL)
        val Instancing = MTLIntersectionFunctionSignature(1uL shl 0)
        val TriangleData = MTLIntersectionFunctionSignature(1uL shl 1)
        val WorldSpaceData = MTLIntersectionFunctionSignature(1uL shl 2)
        val InstanceMotion = MTLIntersectionFunctionSignature(1uL shl 3)
        val PrimitiveMotion = MTLIntersectionFunctionSignature(1uL shl 4)
        val ExtendedLimits = MTLIntersectionFunctionSignature(1uL shl 5)
        val MaxLevels = MTLIntersectionFunctionSignature(1uL shl 6)
        val CurveData = MTLIntersectionFunctionSignature(1uL shl 7)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Descriptor for creating an intersection function table.
 */
open class MTLIntersectionFunctionTableDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLIntersectionFunctionTableDescriptor

    open fun functionCount(): NSUInteger = 0uL
    open fun setFunctionCount(function_count: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun intersectionFunctionTableDescriptor(): MTLIntersectionFunctionTableDescriptor =
            MTLIntersectionFunctionTableDescriptor()

        fun init(): MTLIntersectionFunctionTableDescriptor = MTLIntersectionFunctionTableDescriptor()
        fun new(): MTLIntersectionFunctionTableDescriptor = MTLIntersectionFunctionTableDescriptor()
        fun default_retained(): MTLIntersectionFunctionTableDescriptor = new()
    }
}

/**
 * An intersection function table resource.
 */
interface MTLIntersectionFunctionTable : MTLResource {
    fun setBuffer_offset_atIndex(
        buffer: MTLBuffer?,
        offset: NSUInteger,
        index: NSUInteger,
    )

    fun setBuffers_offsets_withRange(
        buffers: List<MTLBuffer>,
        offsets: List<NSUInteger>,
        range: NSRange,
    )

    fun gpuResourceID(): MTLResourceID

    fun setFunction_atIndex(
        function: MTLFunctionHandle?,
        index: NSUInteger,
    )

    fun setFunctions_withRange(
        functions: List<MTLFunctionHandle>,
        range: NSRange,
    )

    fun setOpaqueTriangleIntersectionFunctionWithSignature_atIndex(
        signature: MTLIntersectionFunctionSignature,
        index: NSUInteger,
    )

    fun setOpaqueTriangleIntersectionFunctionWithSignature_withRange(
        signature: MTLIntersectionFunctionSignature,
        range: NSRange,
    )

    fun setOpaqueCurveIntersectionFunctionWithSignature_atIndex(
        signature: MTLIntersectionFunctionSignature,
        index: NSUInteger,
    )

    fun setOpaqueCurveIntersectionFunctionWithSignature_withRange(
        signature: MTLIntersectionFunctionSignature,
        range: NSRange,
    )

    fun setVisibleFunctionTable_atBufferIndex(
        function_table: MTLVisibleFunctionTable?,
        buffer_index: NSUInteger,
    )

    fun setVisibleFunctionTables_withBufferRange(
        function_tables: List<MTLVisibleFunctionTable>,
        buffer_range: NSRange,
    )
}
