// port-lint: source generated/MTLArgumentEncoder.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSRange
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger
import io.github.kotlinmania.objc2foundation.NSUIntegerMax

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlattributestridestatic?language=objc)
 */
const val MTLAttributeStrideStatic: NSUInteger = NSUIntegerMax

/**
 * MTLArgumentEncoder encodes buffer, texture, sampler, and constant data into a buffer.
 *
 * See also [Apple's documentation](https://developer.apple.com/documentation/metal/mtlargumentencoder?language=objc)
 */
interface MTLArgumentEncoder : NSObjectProtocol {
    fun device(): MTLDevice

    fun label(): NSString?

    fun setLabel(label: NSString?)

    fun encodedLength(): NSUInteger

    fun alignment(): NSUInteger

    fun setArgumentBuffer_offset(argument_buffer: MTLBuffer?, offset: NSUInteger)

    fun setArgumentBuffer_startOffset_arrayElement(argument_buffer: MTLBuffer?, start_offset: NSUInteger, array_element: NSUInteger)

    fun setBuffer_offset_atIndex(buffer: MTLBuffer?, offset: NSUInteger, index: NSUInteger)

    fun setBuffers_offsets_withRange(buffers: List<MTLBuffer>, offsets: List<NSUInteger>, range: NSRange)

    fun setTexture_atIndex(texture: MTLTexture?, index: NSUInteger)

    fun setTextures_withRange(textures: List<MTLTexture>, range: NSRange)

    fun setSamplerState_atIndex(sampler: MTLSamplerState?, index: NSUInteger)

    fun setSamplerStates_withRange(samplers: List<MTLSamplerState>, range: NSRange)

    fun constantDataAtIndex(index: NSUInteger): Any

    fun setRenderPipelineState_atIndex(pipeline: MTLRenderPipelineState?, index: NSUInteger)

    fun setRenderPipelineStates_withRange(pipelines: List<MTLRenderPipelineState>, range: NSRange)

    fun setComputePipelineState_atIndex(pipeline: MTLComputePipelineState?, index: NSUInteger)

    fun setComputePipelineStates_withRange(pipelines: List<MTLComputePipelineState>, range: NSRange)

    fun setIndirectCommandBuffer_atIndex(indirect_command_buffer: MTLIndirectCommandBuffer?, index: NSUInteger)

    fun setIndirectCommandBuffers_withRange(buffers: List<MTLIndirectCommandBuffer>, range: NSRange)

    fun setAccelerationStructure_atIndex(acceleration_structure: MTLAccelerationStructure?, index: NSUInteger)

    fun newArgumentEncoderForBufferAtIndex(index: NSUInteger): MTLArgumentEncoder?

    fun setVisibleFunctionTable_atIndex(visible_function_table: MTLVisibleFunctionTable?, index: NSUInteger)

    fun setVisibleFunctionTables_withRange(visible_function_tables: List<MTLVisibleFunctionTable>, range: NSRange)

    fun setIntersectionFunctionTable_atIndex(intersection_function_table: MTLIntersectionFunctionTable?, index: NSUInteger)

    fun setIntersectionFunctionTables_withRange(intersection_function_tables: List<MTLIntersectionFunctionTable>, range: NSRange)
}
