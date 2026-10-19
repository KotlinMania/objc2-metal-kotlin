// port-lint: source generated/MTLIndirectCommandBuffer.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSRange
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * A bitfield of commands that may be performed indirectly.
 */
data class MTLIndirectCommandType(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Draw = MTLIndirectCommandType(1uL shl 0)
        val DrawIndexed = MTLIndirectCommandType(1uL shl 1)
        val DrawPatches = MTLIndirectCommandType(1uL shl 2)
        val DrawIndexedPatches = MTLIndirectCommandType(1uL shl 3)
        val ConcurrentDispatch = MTLIndirectCommandType(1uL shl 5)
        val ConcurrentDispatchThreads = MTLIndirectCommandType(1uL shl 6)
        val DrawMeshThreadgroups = MTLIndirectCommandType(1uL shl 7)
        val DrawMeshThreads = MTLIndirectCommandType(1uL shl 8)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Execution range for an indirect command buffer.
 */
data class MTLIndirectCommandBufferExecutionRange(
    val location: UInt = 0u,
    val length: UInt = 0u,
) {
    companion object {
        const val ENCODING: String = "{?=II}"
        const val ENCODING_REF: String = "^{?=II}"

        fun MTLIndirectCommandBufferExecutionRangeMake(
            location: UInt,
            length: UInt,
        ): MTLIndirectCommandBufferExecutionRange = MTLIndirectCommandBufferExecutionRange(location, length)
    }
}

/**
 * Descriptor for an indirect command buffer.
 */
open class MTLIndirectCommandBufferDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLIndirectCommandBufferDescriptor

    open fun commandTypes(): MTLIndirectCommandType = MTLIndirectCommandType(0uL)

    open fun setCommandTypes(command_types: MTLIndirectCommandType) {}

    open fun inheritPipelineState(): Boolean = false

    open fun setInheritPipelineState(inherit_pipeline_state: Boolean) {}

    open fun inheritBuffers(): Boolean = false

    open fun setInheritBuffers(inherit_buffers: Boolean) {}

    open fun maxVertexBufferBindCount(): NSUInteger = 0uL

    open fun setMaxVertexBufferBindCount(max_vertex_buffer_bind_count: NSUInteger) {}

    open fun maxFragmentBufferBindCount(): NSUInteger = 0uL

    open fun setMaxFragmentBufferBindCount(max_fragment_buffer_bind_count: NSUInteger) {}

    open fun maxKernelBufferBindCount(): NSUInteger = 0uL

    open fun setMaxKernelBufferBindCount(max_kernel_buffer_bind_count: NSUInteger) {}

    open fun maxKernelThreadgroupMemoryBindCount(): NSUInteger = 31uL

    open fun setMaxKernelThreadgroupMemoryBindCount(max_kernel_threadgroup_memory_bind_count: NSUInteger) {}

    open fun maxObjectBufferBindCount(): NSUInteger = 0uL

    open fun setMaxObjectBufferBindCount(max_object_buffer_bind_count: NSUInteger) {}

    open fun maxMeshBufferBindCount(): NSUInteger = 0uL

    open fun setMaxMeshBufferBindCount(max_mesh_buffer_bind_count: NSUInteger) {}

    open fun maxObjectThreadgroupMemoryBindCount(): NSUInteger = 0uL

    open fun setMaxObjectThreadgroupMemoryBindCount(max_object_threadgroup_memory_bind_count: NSUInteger) {}

    open fun supportRayTracing(): Boolean = false

    open fun setSupportRayTracing(support_ray_tracing: Boolean) {}

    open fun supportDynamicAttributeStride(): Boolean = false

    open fun setSupportDynamicAttributeStride(support_dynamic_attribute_stride: Boolean) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLIndirectCommandBufferDescriptor = MTLIndirectCommandBufferDescriptor()

        fun new(): MTLIndirectCommandBufferDescriptor = MTLIndirectCommandBufferDescriptor()
    }
}

/**
 * Protocol for indirect command buffers.
 */
interface MTLIndirectCommandBuffer : MTLResource {
    fun size(): NSUInteger

    fun gpuResourceID(): MTLResourceID

    fun resetWithRange(range: NSRange)

    fun indirectRenderCommandAtIndex(command_index: NSUInteger): MTLIndirectRenderCommand

    fun indirectComputeCommandAtIndex(command_index: NSUInteger): MTLIndirectComputeCommand
}
