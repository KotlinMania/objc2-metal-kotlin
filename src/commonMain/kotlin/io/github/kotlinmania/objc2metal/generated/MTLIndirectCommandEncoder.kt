// port-lint: source generated/MTLIndirectCommandEncoder.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlindirectrendercommand?language=objc)
 */
interface MTLIndirectRenderCommand : NSObjectProtocol {
    fun setRenderPipelineState(pipeline_state: MTLRenderPipelineState)

    fun setVertexBuffer_offset_atIndex(
        buffer: MTLBuffer,
        offset: NSUInteger,
        index: NSUInteger,
    )

    fun setFragmentBuffer_offset_atIndex(
        buffer: MTLBuffer,
        offset: NSUInteger,
        index: NSUInteger,
    )

    fun setVertexBuffer_offset_attributeStride_atIndex(
        buffer: MTLBuffer,
        offset: NSUInteger,
        stride: NSUInteger,
        index: NSUInteger,
    )

    fun drawPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_instanceCount_baseInstance_tessellationFactorBuffer_tessellationFactorBufferOffset_tessellationFactorBufferInstanceStride(
        number_of_patch_control_points: NSUInteger,
        patch_start: NSUInteger,
        patch_count: NSUInteger,
        patch_index_buffer: MTLBuffer?,
        patch_index_buffer_offset: NSUInteger,
        instance_count: NSUInteger,
        base_instance: NSUInteger,
        buffer: MTLBuffer,
        offset: NSUInteger,
        instance_stride: NSUInteger,
    )

    fun drawIndexedPatches_patchStart_patchCount_patchIndexBuffer_patchIndexBufferOffset_controlPointIndexBuffer_controlPointIndexBufferOffset_instanceCount_baseInstance_tessellationFactorBuffer_tessellationFactorBufferOffset_tessellationFactorBufferInstanceStride(
        number_of_patch_control_points: NSUInteger,
        patch_start: NSUInteger,
        patch_count: NSUInteger,
        patch_index_buffer: MTLBuffer?,
        patch_index_buffer_offset: NSUInteger,
        control_point_index_buffer: MTLBuffer,
        control_point_index_buffer_offset: NSUInteger,
        instance_count: NSUInteger,
        base_instance: NSUInteger,
        buffer: MTLBuffer,
        offset: NSUInteger,
        instance_stride: NSUInteger,
    )

    fun drawPrimitives_vertexStart_vertexCount_instanceCount_baseInstance(
        primitive_type: MTLPrimitiveType,
        vertex_start: NSUInteger,
        vertex_count: NSUInteger,
        instance_count: NSUInteger,
        base_instance: NSUInteger,
    )

    fun drawIndexedPrimitives_indexCount_indexType_indexBuffer_indexBufferOffset_instanceCount_baseVertex_baseInstance(
        primitive_type: MTLPrimitiveType,
        index_count: NSUInteger,
        index_type: MTLIndexType,
        index_buffer: MTLBuffer,
        index_buffer_offset: NSUInteger,
        instance_count: NSUInteger,
        base_vertex: NSInteger,
        base_instance: NSUInteger,
    )

    fun setObjectThreadgroupMemoryLength_atIndex(
        length: NSUInteger,
        index: NSUInteger,
    )

    fun setObjectBuffer_offset_atIndex(
        buffer: MTLBuffer,
        offset: NSUInteger,
        index: NSUInteger,
    )

    fun setMeshBuffer_offset_atIndex(
        buffer: MTLBuffer,
        offset: NSUInteger,
        index: NSUInteger,
    )

    fun drawMeshThreadgroups_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup(
        threadgroups_per_grid: MTLSize,
        threads_per_object_threadgroup: MTLSize,
        threads_per_mesh_threadgroup: MTLSize,
    )

    fun drawMeshThreads_threadsPerObjectThreadgroup_threadsPerMeshThreadgroup(
        threads_per_grid: MTLSize,
        threads_per_object_threadgroup: MTLSize,
        threads_per_mesh_threadgroup: MTLSize,
    )

    fun setBarrier()

    fun clearBarrier()

    fun reset()
}

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlindirectcomputecommand?language=objc)
 */
interface MTLIndirectComputeCommand : NSObjectProtocol {
    fun setComputePipelineState(pipeline_state: MTLComputePipelineState)

    fun setKernelBuffer_offset_atIndex(
        buffer: MTLBuffer,
        offset: NSUInteger,
        index: NSUInteger,
    )

    fun setKernelBuffer_offset_attributeStride_atIndex(
        buffer: MTLBuffer,
        offset: NSUInteger,
        stride: NSUInteger,
        index: NSUInteger,
    )

    fun concurrentDispatchThreadgroups_threadsPerThreadgroup(
        threadgroups_per_grid: MTLSize,
        threads_per_threadgroup: MTLSize,
    )

    fun concurrentDispatchThreads_threadsPerThreadgroup(
        threads_per_grid: MTLSize,
        threads_per_threadgroup: MTLSize,
    )

    fun setBarrier()

    fun clearBarrier()

    fun setImageblockWidth_height(width: NSUInteger, height: NSUInteger)

    fun reset()

    fun setThreadgroupMemoryLength_atIndex(length: NSUInteger, index: NSUInteger)

    fun setStageInRegion(region: MTLRegion)
}
