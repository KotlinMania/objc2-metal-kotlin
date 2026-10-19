// port-lint: source generated/MTLArgument.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * The data type for an input to a function or argument buffer.
 */
data class MTLDataType(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val None = MTLDataType(0uL)
        val Struct = MTLDataType(1uL)
        val Array = MTLDataType(2uL)
        val Float = MTLDataType(3uL)
        val Float2 = MTLDataType(4uL)
        val Float3 = MTLDataType(5uL)
        val Float4 = MTLDataType(6uL)
        val Float2x2 = MTLDataType(7uL)
        val Float2x3 = MTLDataType(8uL)
        val Float2x4 = MTLDataType(9uL)
        val Float3x2 = MTLDataType(10uL)
        val Float3x3 = MTLDataType(11uL)
        val Float3x4 = MTLDataType(12uL)
        val Float4x2 = MTLDataType(13uL)
        val Float4x3 = MTLDataType(14uL)
        val Float4x4 = MTLDataType(15uL)
        val Half = MTLDataType(16uL)
        val Half2 = MTLDataType(17uL)
        val Half3 = MTLDataType(18uL)
        val Half4 = MTLDataType(19uL)
        val Half2x2 = MTLDataType(20uL)
        val Half2x3 = MTLDataType(21uL)
        val Half2x4 = MTLDataType(22uL)
        val Half3x2 = MTLDataType(23uL)
        val Half3x3 = MTLDataType(24uL)
        val Half3x4 = MTLDataType(25uL)
        val Half4x2 = MTLDataType(26uL)
        val Half4x3 = MTLDataType(27uL)
        val Half4x4 = MTLDataType(28uL)
        val Int = MTLDataType(29uL)
        val Int2 = MTLDataType(30uL)
        val Int3 = MTLDataType(31uL)
        val Int4 = MTLDataType(32uL)
        val UInt = MTLDataType(33uL)
        val UInt2 = MTLDataType(34uL)
        val UInt3 = MTLDataType(35uL)
        val UInt4 = MTLDataType(36uL)
        val Short = MTLDataType(37uL)
        val Short2 = MTLDataType(38uL)
        val Short3 = MTLDataType(39uL)
        val Short4 = MTLDataType(40uL)
        val UShort = MTLDataType(41uL)
        val UShort2 = MTLDataType(42uL)
        val UShort3 = MTLDataType(43uL)
        val UShort4 = MTLDataType(44uL)
        val Char = MTLDataType(45uL)
        val Char2 = MTLDataType(46uL)
        val Char3 = MTLDataType(47uL)
        val Char4 = MTLDataType(48uL)
        val UChar = MTLDataType(49uL)
        val UChar2 = MTLDataType(50uL)
        val UChar3 = MTLDataType(51uL)
        val UChar4 = MTLDataType(52uL)
        val Bool = MTLDataType(53uL)
        val Bool2 = MTLDataType(54uL)
        val Bool3 = MTLDataType(55uL)
        val Bool4 = MTLDataType(56uL)
        val Texture = MTLDataType(58uL)
        val Sampler = MTLDataType(59uL)
        val Pointer = MTLDataType(60uL)
        val R8Unorm = MTLDataType(62uL)
        val R8Snorm = MTLDataType(63uL)
        val R16Unorm = MTLDataType(64uL)
        val R16Snorm = MTLDataType(65uL)
        val RG8Unorm = MTLDataType(66uL)
        val RG8Snorm = MTLDataType(67uL)
        val RG16Unorm = MTLDataType(68uL)
        val RG16Snorm = MTLDataType(69uL)
        val RGBA8Unorm = MTLDataType(70uL)
        val RGBA8Unorm_sRGB = MTLDataType(71uL)
        val RGBA8Snorm = MTLDataType(72uL)
        val RGBA16Unorm = MTLDataType(73uL)
        val RGBA16Snorm = MTLDataType(74uL)
        val RGB10A2Unorm = MTLDataType(75uL)
        val RG11B10Float = MTLDataType(76uL)
        val RGB9E5Float = MTLDataType(77uL)
        val RenderPipeline = MTLDataType(78uL)
        val ComputePipeline = MTLDataType(79uL)
        val IndirectCommandBuffer = MTLDataType(80uL)
        val Long = MTLDataType(81uL)
        val Long2 = MTLDataType(82uL)
        val Long3 = MTLDataType(83uL)
        val Long4 = MTLDataType(84uL)
        val ULong = MTLDataType(85uL)
        val ULong2 = MTLDataType(86uL)
        val ULong3 = MTLDataType(87uL)
        val ULong4 = MTLDataType(88uL)
        val VisibleFunctionTable = MTLDataType(115uL)
        val IntersectionFunctionTable = MTLDataType(116uL)
        val PrimitiveAccelerationStructure = MTLDataType(117uL)
        val InstanceAccelerationStructure = MTLDataType(118uL)
        val BFloat = MTLDataType(121uL)
        val BFloat2 = MTLDataType(122uL)
        val BFloat3 = MTLDataType(123uL)
        val BFloat4 = MTLDataType(124uL)
    }
}

/**
 * The type of a resource binding.
 */
data class MTLBindingType(
    val rawValue: NSInteger,
) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val Buffer = MTLBindingType(0L)
        val ThreadgroupMemory = MTLBindingType(1L)
        val Texture = MTLBindingType(2L)
        val Sampler = MTLBindingType(3L)
        val ImageblockData = MTLBindingType(16L)
        val Imageblock = MTLBindingType(17L)
        val VisibleFunctionTable = MTLBindingType(24L)
        val PrimitiveAccelerationStructure = MTLBindingType(25L)
        val InstanceAccelerationStructure = MTLBindingType(26L)
        val IntersectionFunctionTable = MTLBindingType(27L)
        val ObjectPayload = MTLBindingType(34L)
    }
}

/**
 * The type for an input to a MTLRenderPipelineState or a MTLComputePipelineState.
 */
data class MTLArgumentType(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Buffer = MTLArgumentType(0uL)
        val ThreadgroupMemory = MTLArgumentType(1uL)
        val Texture = MTLArgumentType(2uL)
        val Sampler = MTLArgumentType(3uL)
        val ImageblockData = MTLArgumentType(16uL)
        val Imageblock = MTLArgumentType(17uL)
        val VisibleFunctionTable = MTLArgumentType(24uL)
        val PrimitiveAccelerationStructure = MTLArgumentType(25uL)
        val InstanceAccelerationStructure = MTLArgumentType(26uL)
        val IntersectionFunctionTable = MTLArgumentType(27uL)
    }
}

data class MTLBindingAccess(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val ReadOnly = MTLBindingAccess(0uL)
        val ReadWrite = MTLBindingAccess(1uL)
        val WriteOnly = MTLBindingAccess(2uL)
        val MTLArgumentAccessReadOnly = ReadOnly
        val MTLArgumentAccessReadWrite = ReadWrite
        val MTLArgumentAccessWriteOnly = WriteOnly
    }
}

typealias MTLArgumentAccess = MTLBindingAccess

open class MTLType : NSObject() {
    open fun dataType(): MTLDataType = MTLDataType.None
}

open class MTLStructMember : NSObject() {
    open fun name(): NSString = NSString("")

    open fun offset(): NSUInteger = 0uL

    open fun dataType(): MTLDataType = MTLDataType.None

    open fun structType(): MTLStructType? = null

    open fun arrayType(): MTLArrayType? = null

    open fun textureReferenceType(): MTLTextureReferenceType? = null

    open fun pointerType(): MTLPointerType? = null

    open fun argumentIndex(): NSUInteger = 0uL
}

open class MTLStructType : MTLType() {
    open fun members(): NSArray<MTLStructMember> = NSArray()

    open fun memberByName(name: NSString): MTLStructMember? = null
}

open class MTLArrayType : MTLType() {
    open fun elementType(): MTLDataType = MTLDataType.None

    open fun arrayLength(): NSUInteger = 0uL

    open fun stride(): NSUInteger = 0uL

    open fun elementStructType(): MTLStructType? = null

    open fun elementArrayType(): MTLArrayType? = null
}

open class MTLTextureReferenceType : MTLType() {
    open fun textureDataType(): MTLDataType = MTLDataType.None

    open fun textureType(): NSUInteger = 0uL

    open fun access(): MTLBindingAccess = MTLBindingAccess.ReadOnly

    open fun isDepthTexture(): Boolean = false
}

open class MTLPointerType : MTLType() {
    open fun elementType(): MTLDataType = MTLDataType.None

    open fun access(): MTLBindingAccess = MTLBindingAccess.ReadOnly

    open fun alignment(): NSUInteger = 0uL

    open fun dataSize(): NSUInteger = 0uL

    open fun elementIsArgumentBuffer(): Boolean = false

    open fun elementStructType(): MTLStructType? = null

    open fun elementArrayType(): MTLArrayType? = null
}

open class MTLArgument : NSObject() {
    open fun name(): NSString = NSString("")

    open fun type(): MTLArgumentType = MTLArgumentType.Buffer

    open fun access(): MTLArgumentAccess = MTLArgumentAccess.ReadOnly

    open fun index(): NSUInteger = 0uL

    open fun isActive(): Boolean = true

    open fun bufferAlignment(): NSUInteger = 0uL

    open fun bufferDataSize(): NSUInteger = 0uL

    open fun bufferDataType(): MTLDataType = MTLDataType.None

    open fun bufferStructType(): MTLStructType? = null

    open fun bufferPointerType(): MTLPointerType? = null

    open fun threadgroupMemoryAlignment(): NSUInteger = 0uL

    open fun threadgroupMemoryDataSize(): NSUInteger = 0uL

    open fun textureType(): NSUInteger = 0uL

    open fun textureDataType(): MTLDataType = MTLDataType.None

    open fun isDepthTexture(): Boolean = false

    open fun arrayLength(): NSUInteger = 0uL
}

interface MTLBinding : NSObjectProtocol {
    fun name(): NSString

    fun type(): MTLBindingType

    fun access(): MTLBindingAccess

    fun index(): NSUInteger

    fun isUsed(): Boolean

    fun argument(): Boolean
}
