// port-lint: source generated/MTLVertexDescriptor.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Specifies how the vertex attribute data is laid out in memory.
 */
data class MTLVertexFormat(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Invalid = MTLVertexFormat(0uL)
        val UChar2 = MTLVertexFormat(1uL)
        val UChar3 = MTLVertexFormat(2uL)
        val UChar4 = MTLVertexFormat(3uL)
        val Char2 = MTLVertexFormat(4uL)
        val Char3 = MTLVertexFormat(5uL)
        val Char4 = MTLVertexFormat(6uL)
        val UChar2Normalized = MTLVertexFormat(7uL)
        val UChar3Normalized = MTLVertexFormat(8uL)
        val UChar4Normalized = MTLVertexFormat(9uL)
        val Char2Normalized = MTLVertexFormat(10uL)
        val Char3Normalized = MTLVertexFormat(11uL)
        val Char4Normalized = MTLVertexFormat(12uL)
        val UShort2 = MTLVertexFormat(13uL)
        val UShort3 = MTLVertexFormat(14uL)
        val UShort4 = MTLVertexFormat(15uL)
        val Short2 = MTLVertexFormat(16uL)
        val Short3 = MTLVertexFormat(17uL)
        val Short4 = MTLVertexFormat(18uL)
        val UShort2Normalized = MTLVertexFormat(19uL)
        val UShort3Normalized = MTLVertexFormat(20uL)
        val UShort4Normalized = MTLVertexFormat(21uL)
        val Short2Normalized = MTLVertexFormat(22uL)
        val Short3Normalized = MTLVertexFormat(23uL)
        val Short4Normalized = MTLVertexFormat(24uL)
        val Half2 = MTLVertexFormat(25uL)
        val Half3 = MTLVertexFormat(26uL)
        val Half4 = MTLVertexFormat(27uL)
        val Float = MTLVertexFormat(28uL)
        val Float2 = MTLVertexFormat(29uL)
        val Float3 = MTLVertexFormat(30uL)
        val Float4 = MTLVertexFormat(31uL)
        val Int = MTLVertexFormat(32uL)
        val Int2 = MTLVertexFormat(33uL)
        val Int3 = MTLVertexFormat(34uL)
        val Int4 = MTLVertexFormat(35uL)
        val UInt = MTLVertexFormat(36uL)
        val UInt2 = MTLVertexFormat(37uL)
        val UInt3 = MTLVertexFormat(38uL)
        val UInt4 = MTLVertexFormat(39uL)
        val Int1010102Normalized = MTLVertexFormat(40uL)
        val UInt1010102Normalized = MTLVertexFormat(41uL)
        val UChar4Normalized_BGRA = MTLVertexFormat(42uL)
        val UChar = MTLVertexFormat(45uL)
        val Char = MTLVertexFormat(46uL)
        val UCharNormalized = MTLVertexFormat(47uL)
        val CharNormalized = MTLVertexFormat(48uL)
        val UShort = MTLVertexFormat(49uL)
        val Short = MTLVertexFormat(50uL)
        val UShortNormalized = MTLVertexFormat(51uL)
        val ShortNormalized = MTLVertexFormat(52uL)
        val Half = MTLVertexFormat(53uL)
        val FloatRG11B10 = MTLVertexFormat(54uL)
        val FloatRGB9E5 = MTLVertexFormat(55uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Frequency of fetching vertex data.
 */
data class MTLVertexStepFunction(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Constant = MTLVertexStepFunction(0uL)
        val PerVertex = MTLVertexStepFunction(1uL)
        val PerInstance = MTLVertexStepFunction(2uL)
        val PerPatch = MTLVertexStepFunction(3uL)
        val PerPatchControlPoint = MTLVertexStepFunction(4uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

val MTLBufferLayoutStrideDynamic: NSUInteger = ULong.MAX_VALUE

/**
 * Layout descriptor for a vertex buffer.
 */
open class MTLVertexBufferLayoutDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLVertexBufferLayoutDescriptor

    open fun stride(): NSUInteger = 0uL
    open fun setStride(stride: NSUInteger) {}

    open fun stepFunction(): MTLVertexStepFunction = MTLVertexStepFunction.PerVertex
    open fun setStepFunction(step_function: MTLVertexStepFunction) {}

    open fun stepRate(): NSUInteger = 1uL
    open fun setStepRate(step_rate: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLVertexBufferLayoutDescriptor = MTLVertexBufferLayoutDescriptor()
        fun new(): MTLVertexBufferLayoutDescriptor = MTLVertexBufferLayoutDescriptor()
        fun default_retained(): MTLVertexBufferLayoutDescriptor = new()
    }
}

/**
 * Array of vertex buffer layout descriptors.
 */
open class MTLVertexBufferLayoutDescriptorArray :
    NSObject(),
    NSObjectProtocol {

    open fun objectAtIndexedSubscript(index: NSUInteger): MTLVertexBufferLayoutDescriptor =
        MTLVertexBufferLayoutDescriptor()

    open fun setObject_atIndexedSubscript(
        buffer_desc: MTLVertexBufferLayoutDescriptor?,
        index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLVertexBufferLayoutDescriptorArray = MTLVertexBufferLayoutDescriptorArray()
        fun new(): MTLVertexBufferLayoutDescriptorArray = MTLVertexBufferLayoutDescriptorArray()
    }
}

/**
 * Attribute descriptor for vertex attributes.
 */
open class MTLVertexAttributeDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLVertexAttributeDescriptor

    open fun format(): MTLVertexFormat = MTLVertexFormat.Invalid
    open fun setFormat(format: MTLVertexFormat) {}

    open fun offset(): NSUInteger = 0uL
    open fun setOffset(offset: NSUInteger) {}

    open fun bufferIndex(): NSUInteger = 0uL
    open fun setBufferIndex(buffer_index: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLVertexAttributeDescriptor = MTLVertexAttributeDescriptor()
        fun new(): MTLVertexAttributeDescriptor = MTLVertexAttributeDescriptor()
        fun default_retained(): MTLVertexAttributeDescriptor = new()
    }
}

/**
 * Array of vertex attribute descriptors.
 */
open class MTLVertexAttributeDescriptorArray :
    NSObject(),
    NSObjectProtocol {

    open fun objectAtIndexedSubscript(index: NSUInteger): MTLVertexAttributeDescriptor =
        MTLVertexAttributeDescriptor()

    open fun setObject_atIndexedSubscript(
        attribute_desc: MTLVertexAttributeDescriptor?,
        index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLVertexAttributeDescriptorArray = MTLVertexAttributeDescriptorArray()
        fun new(): MTLVertexAttributeDescriptorArray = MTLVertexAttributeDescriptorArray()
    }
}

/**
 * Descriptor for vertex configuration.
 */
open class MTLVertexDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLVertexDescriptor

    open fun layouts(): MTLVertexBufferLayoutDescriptorArray = MTLVertexBufferLayoutDescriptorArray()
    open fun attributes(): MTLVertexAttributeDescriptorArray = MTLVertexAttributeDescriptorArray()
    open fun reset() {}

    override fun copy(): Any = this

    companion object {
        fun vertexDescriptor(): MTLVertexDescriptor = MTLVertexDescriptor()
        fun init(): MTLVertexDescriptor = MTLVertexDescriptor()
        fun new(): MTLVertexDescriptor = MTLVertexDescriptor()
    }
}
