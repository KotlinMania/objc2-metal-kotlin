// port-lint: source generated/MTLStageInputOutputDescriptor.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Format of an attribute in a stage input-output descriptor.
 */
data class MTLAttributeFormat(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Invalid = MTLAttributeFormat(0uL)
        val UChar2 = MTLAttributeFormat(1uL)
        val UChar3 = MTLAttributeFormat(2uL)
        val UChar4 = MTLAttributeFormat(3uL)
        val Char2 = MTLAttributeFormat(4uL)
        val Char3 = MTLAttributeFormat(5uL)
        val Char4 = MTLAttributeFormat(6uL)
        val UChar2Normalized = MTLAttributeFormat(7uL)
        val UChar3Normalized = MTLAttributeFormat(8uL)
        val UChar4Normalized = MTLAttributeFormat(9uL)
        val Char2Normalized = MTLAttributeFormat(10uL)
        val Char3Normalized = MTLAttributeFormat(11uL)
        val Char4Normalized = MTLAttributeFormat(12uL)
        val UShort2 = MTLAttributeFormat(13uL)
        val UShort3 = MTLAttributeFormat(14uL)
        val UShort4 = MTLAttributeFormat(15uL)
        val Short2 = MTLAttributeFormat(16uL)
        val Short3 = MTLAttributeFormat(17uL)
        val Short4 = MTLAttributeFormat(18uL)
        val UShort2Normalized = MTLAttributeFormat(19uL)
        val UShort3Normalized = MTLAttributeFormat(20uL)
        val UShort4Normalized = MTLAttributeFormat(21uL)
        val Short2Normalized = MTLAttributeFormat(22uL)
        val Short3Normalized = MTLAttributeFormat(23uL)
        val Short4Normalized = MTLAttributeFormat(24uL)
        val Half2 = MTLAttributeFormat(25uL)
        val Half3 = MTLAttributeFormat(26uL)
        val Half4 = MTLAttributeFormat(27uL)
        val Float = MTLAttributeFormat(28uL)
        val Float2 = MTLAttributeFormat(29uL)
        val Float3 = MTLAttributeFormat(30uL)
        val Float4 = MTLAttributeFormat(31uL)
        val Int = MTLAttributeFormat(32uL)
        val Int2 = MTLAttributeFormat(33uL)
        val Int3 = MTLAttributeFormat(34uL)
        val Int4 = MTLAttributeFormat(35uL)
        val UInt = MTLAttributeFormat(36uL)
        val UInt2 = MTLAttributeFormat(37uL)
        val UInt3 = MTLAttributeFormat(38uL)
        val UInt4 = MTLAttributeFormat(39uL)
        val Int1010102Normalized = MTLAttributeFormat(40uL)
        val UInt1010102Normalized = MTLAttributeFormat(41uL)
        val UChar4Normalized_BGRA = MTLAttributeFormat(42uL)
        val UChar = MTLAttributeFormat(45uL)
        val Char = MTLAttributeFormat(46uL)
        val UCharNormalized = MTLAttributeFormat(47uL)
        val CharNormalized = MTLAttributeFormat(48uL)
        val UShort = MTLAttributeFormat(49uL)
        val Short = MTLAttributeFormat(50uL)
        val UShortNormalized = MTLAttributeFormat(51uL)
        val ShortNormalized = MTLAttributeFormat(52uL)
        val Half = MTLAttributeFormat(53uL)
        val FloatRG11B10 = MTLAttributeFormat(54uL)
        val FloatRGB9E5 = MTLAttributeFormat(55uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Type of index used for indexed draw primitives.
 */
data class MTLIndexType(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val UInt16 = MTLIndexType(0uL)
        val UInt32 = MTLIndexType(1uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Step function for stage input attributes.
 */
data class MTLStepFunction(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Constant = MTLStepFunction(0uL)
        val PerVertex = MTLStepFunction(1uL)
        val PerInstance = MTLStepFunction(2uL)
        val PerPatch = MTLStepFunction(3uL)
        val PerPatchControlPoint = MTLStepFunction(4uL)
        val ThreadPositionInGridX = MTLStepFunction(5uL)
        val ThreadPositionInGridY = MTLStepFunction(6uL)
        val ThreadPositionInGridXIndexed = MTLStepFunction(7uL)
        val ThreadPositionInGridYIndexed = MTLStepFunction(8uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Layout descriptor for a stage input buffer.
 */
open class MTLBufferLayoutDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLBufferLayoutDescriptor

    open fun stride(): NSUInteger = 0uL
    open fun setStride(stride: NSUInteger) {}

    open fun stepFunction(): MTLStepFunction = MTLStepFunction.Constant
    open fun setStepFunction(step_function: MTLStepFunction) {}

    open fun stepRate(): NSUInteger = 1uL
    open fun setStepRate(step_rate: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLBufferLayoutDescriptor = MTLBufferLayoutDescriptor()
        fun new(): MTLBufferLayoutDescriptor = MTLBufferLayoutDescriptor()
        fun default_retained(): MTLBufferLayoutDescriptor = new()
    }
}

/**
 * Array of buffer layout descriptors.
 */
open class MTLBufferLayoutDescriptorArray :
    NSObject(),
    NSObjectProtocol {

    open fun objectAtIndexedSubscript(index: NSUInteger): MTLBufferLayoutDescriptor =
        MTLBufferLayoutDescriptor()

    open fun setObject_atIndexedSubscript(
        buffer_desc: MTLBufferLayoutDescriptor?,
        index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLBufferLayoutDescriptorArray = MTLBufferLayoutDescriptorArray()
        fun new(): MTLBufferLayoutDescriptorArray = MTLBufferLayoutDescriptorArray()
    }
}

/**
 * Attribute descriptor for a stage input-output attribute.
 */
open class MTLAttributeDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLAttributeDescriptor

    open fun format(): MTLAttributeFormat = MTLAttributeFormat.Invalid
    open fun setFormat(format: MTLAttributeFormat) {}

    open fun offset(): NSUInteger = 0uL
    open fun setOffset(offset: NSUInteger) {}

    open fun bufferIndex(): NSUInteger = 0uL
    open fun setBufferIndex(buffer_index: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLAttributeDescriptor = MTLAttributeDescriptor()
        fun new(): MTLAttributeDescriptor = MTLAttributeDescriptor()
        fun default_retained(): MTLAttributeDescriptor = new()
    }
}

/**
 * Array of attribute descriptors.
 */
open class MTLAttributeDescriptorArray :
    NSObject(),
    NSObjectProtocol {

    open fun objectAtIndexedSubscript(index: NSUInteger): MTLAttributeDescriptor =
        MTLAttributeDescriptor()

    open fun setObject_atIndexedSubscript(
        attribute_desc: MTLAttributeDescriptor?,
        index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLAttributeDescriptorArray = MTLAttributeDescriptorArray()
        fun new(): MTLAttributeDescriptorArray = MTLAttributeDescriptorArray()
    }
}

/**
 * Descriptor for stage input and output attributes and layouts.
 */
open class MTLStageInputOutputDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLStageInputOutputDescriptor

    open fun layouts(): MTLBufferLayoutDescriptorArray = MTLBufferLayoutDescriptorArray()
    open fun attributes(): MTLAttributeDescriptorArray = MTLAttributeDescriptorArray()

    open fun indexType(): MTLIndexType = MTLIndexType.UInt16
    open fun setIndexType(index_type: MTLIndexType) {}

    open fun indexBufferIndex(): NSUInteger = 0uL
    open fun setIndexBufferIndex(index_buffer_index: NSUInteger) {}

    open fun reset() {}

    override fun copy(): Any = this

    companion object {
        fun stageInputOutputDescriptor(): MTLStageInputOutputDescriptor = MTLStageInputOutputDescriptor()
        fun init(): MTLStageInputOutputDescriptor = MTLStageInputOutputDescriptor()
        fun new(): MTLStageInputOutputDescriptor = MTLStageInputOutputDescriptor()
    }
}
