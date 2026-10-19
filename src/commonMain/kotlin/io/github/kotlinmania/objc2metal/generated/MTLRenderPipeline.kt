// port-lint: source generated/MTLRenderPipeline.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Blend factor applied to source and destination blend operations.
 */
data class MTLBlendFactor(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Zero = MTLBlendFactor(0uL)
        val One = MTLBlendFactor(1uL)
        val SourceColor = MTLBlendFactor(2uL)
        val OneMinusSourceColor = MTLBlendFactor(3uL)
        val SourceAlpha = MTLBlendFactor(4uL)
        val OneMinusSourceAlpha = MTLBlendFactor(5uL)
        val DestinationColor = MTLBlendFactor(6uL)
        val OneMinusDestinationColor = MTLBlendFactor(7uL)
        val DestinationAlpha = MTLBlendFactor(8uL)
        val OneMinusDestinationAlpha = MTLBlendFactor(9uL)
        val SourceAlphaSaturated = MTLBlendFactor(10uL)
        val BlendColor = MTLBlendFactor(11uL)
        val OneMinusBlendColor = MTLBlendFactor(12uL)
        val BlendAlpha = MTLBlendFactor(13uL)
        val OneMinusBlendAlpha = MTLBlendFactor(14uL)
        val Source1Color = MTLBlendFactor(15uL)
        val OneMinusSource1Color = MTLBlendFactor(16uL)
        val Source1Alpha = MTLBlendFactor(17uL)
        val OneMinusSource1Alpha = MTLBlendFactor(18uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Blend operation applied to blend factors.
 */
data class MTLBlendOperation(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Add = MTLBlendOperation(0uL)
        val Subtract = MTLBlendOperation(1uL)
        val ReverseSubtract = MTLBlendOperation(2uL)
        val Min = MTLBlendOperation(3uL)
        val Max = MTLBlendOperation(4uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Color write mask options.
 */
data class MTLColorWriteMask(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val None = MTLColorWriteMask(0uL)
        val Red = MTLColorWriteMask(1uL shl 3)
        val Green = MTLColorWriteMask(1uL shl 2)
        val Blue = MTLColorWriteMask(1uL shl 1)
        val Alpha = MTLColorWriteMask(1uL shl 0)
        val All = MTLColorWriteMask(0xfuL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Primitive topology classes.
 */
data class MTLPrimitiveTopologyClass(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Unspecified = MTLPrimitiveTopologyClass(0uL)
        val Point = MTLPrimitiveTopologyClass(1uL)
        val Line = MTLPrimitiveTopologyClass(2uL)
        val Triangle = MTLPrimitiveTopologyClass(3uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Tessellation partition modes.
 */
data class MTLTessellationPartitionMode(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Pow2 = MTLTessellationPartitionMode(0uL)
        val Integer = MTLTessellationPartitionMode(1uL)
        val FractionalOdd = MTLTessellationPartitionMode(2uL)
        val FractionalEven = MTLTessellationPartitionMode(3uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Tessellation factor step functions.
 */
data class MTLTessellationFactorStepFunction(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Constant = MTLTessellationFactorStepFunction(0uL)
        val PerPatch = MTLTessellationFactorStepFunction(1uL)
        val PerInstance = MTLTessellationFactorStepFunction(2uL)
        val PerPatchAndPerInstance = MTLTessellationFactorStepFunction(3uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Tessellation factor formats.
 */
data class MTLTessellationFactorFormat(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Half = MTLTessellationFactorFormat(0uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Tessellation control point index types.
 */
data class MTLTessellationControlPointIndexType(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val None = MTLTessellationControlPointIndexType(0uL)
        val UInt16 = MTLTessellationControlPointIndexType(1uL)
        val UInt32 = MTLTessellationControlPointIndexType(2uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Color attachment descriptor for a render pipeline.
 */
open class MTLRenderPipelineColorAttachmentDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLRenderPipelineColorAttachmentDescriptor

    open fun pixelFormat(): MTLPixelFormat = MTLPixelFormat.Invalid

    open fun setPixelFormat(pixel_format: MTLPixelFormat) {}

    open fun isBlendingEnabled(): Boolean = false

    open fun setBlendingEnabled(blending_enabled: Boolean) {}

    open fun sourceRGBBlendFactor(): MTLBlendFactor = MTLBlendFactor.One

    open fun setSourceRGBBlendFactor(source_rgb_blend_factor: MTLBlendFactor) {}

    open fun destinationRGBBlendFactor(): MTLBlendFactor = MTLBlendFactor.Zero

    open fun setDestinationRGBBlendFactor(destination_rgb_blend_factor: MTLBlendFactor) {}

    open fun rgbBlendOperation(): MTLBlendOperation = MTLBlendOperation.Add

    open fun setRgbBlendOperation(rgb_blend_operation: MTLBlendOperation) {}

    open fun sourceAlphaBlendFactor(): MTLBlendFactor = MTLBlendFactor.One

    open fun setSourceAlphaBlendFactor(source_alpha_blend_factor: MTLBlendFactor) {}

    open fun destinationAlphaBlendFactor(): MTLBlendFactor = MTLBlendFactor.Zero

    open fun setDestinationAlphaBlendFactor(destination_alpha_blend_factor: MTLBlendFactor) {}

    open fun alphaBlendOperation(): MTLBlendOperation = MTLBlendOperation.Add

    open fun setAlphaBlendOperation(alpha_blend_operation: MTLBlendOperation) {}

    open fun writeMask(): MTLColorWriteMask = MTLColorWriteMask.All

    open fun setWriteMask(write_mask: MTLColorWriteMask) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLRenderPipelineColorAttachmentDescriptor =
            MTLRenderPipelineColorAttachmentDescriptor()

        fun new(): MTLRenderPipelineColorAttachmentDescriptor =
            MTLRenderPipelineColorAttachmentDescriptor()
    }
}

/**
 * Reflection information for a render pipeline.
 */
open class MTLRenderPipelineReflection :
    NSObject(),
    NSObjectProtocol {
    open fun vertexBindings(): NSArray<MTLBinding> = NSArray()

    open fun fragmentBindings(): NSArray<MTLBinding> = NSArray()

    open fun tileBindings(): NSArray<MTLBinding> = NSArray()

    open fun objectBindings(): NSArray<MTLBinding> = NSArray()

    open fun meshBindings(): NSArray<MTLBinding> = NSArray()

    open fun vertexArguments(): NSArray<MTLArgument>? = null

    open fun fragmentArguments(): NSArray<MTLArgument>? = null

    open fun tileArguments(): NSArray<MTLArgument>? = null

    companion object {
        fun init(): MTLRenderPipelineReflection = MTLRenderPipelineReflection()

        fun new(): MTLRenderPipelineReflection = MTLRenderPipelineReflection()
    }
}

/**
 * Array of render pipeline color attachment descriptors.
 */
open class MTLRenderPipelineColorAttachmentDescriptorArray :
    NSObject(),
    NSObjectProtocol {
    open fun objectAtIndexedSubscript(attachment_index: NSUInteger): MTLRenderPipelineColorAttachmentDescriptor =
        MTLRenderPipelineColorAttachmentDescriptor()

    open fun setObject_atIndexedSubscript(
        attachment: MTLRenderPipelineColorAttachmentDescriptor?,
        attachment_index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLRenderPipelineColorAttachmentDescriptorArray =
            MTLRenderPipelineColorAttachmentDescriptorArray()

        fun new(): MTLRenderPipelineColorAttachmentDescriptorArray =
            MTLRenderPipelineColorAttachmentDescriptorArray()
    }
}

/**
 * Descriptor used to configure a render pipeline state.
 */
open class MTLRenderPipelineDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLRenderPipelineDescriptor

    open fun label(): NSString? = null

    open fun setLabel(label: NSString?) {}

    open fun vertexFunction(): MTLFunction? = null

    open fun setVertexFunction(vertex_function: MTLFunction?) {}

    open fun fragmentFunction(): MTLFunction? = null

    open fun setFragmentFunction(fragment_function: MTLFunction?) {}

    open fun vertexDescriptor(): MTLVertexDescriptor? = null

    open fun setVertexDescriptor(vertex_descriptor: MTLVertexDescriptor?) {}

    open fun sampleCount(): NSUInteger = 1uL

    open fun setSampleCount(sample_count: NSUInteger) {}

    open fun rasterSampleCount(): NSUInteger = 1uL

    open fun setRasterSampleCount(raster_sample_count: NSUInteger) {}

    open fun isAlphaToCoverageEnabled(): Boolean = false

    open fun setAlphaToCoverageEnabled(alpha_to_coverage_enabled: Boolean) {}

    open fun isAlphaToOneEnabled(): Boolean = false

    open fun setAlphaToOneEnabled(alpha_to_one_enabled: Boolean) {}

    open fun isRasterizationEnabled(): Boolean = true

    open fun setRasterizationEnabled(rasterization_enabled: Boolean) {}

    open fun maxVertexAmplificationCount(): NSUInteger = 1uL

    open fun setMaxVertexAmplificationCount(max_vertex_amplification_count: NSUInteger) {}

    open fun colorAttachments(): MTLRenderPipelineColorAttachmentDescriptorArray =
        MTLRenderPipelineColorAttachmentDescriptorArray()

    open fun depthAttachmentPixelFormat(): MTLPixelFormat = MTLPixelFormat.Invalid

    open fun setDepthAttachmentPixelFormat(depth_attachment_pixel_format: MTLPixelFormat) {}

    open fun stencilAttachmentPixelFormat(): MTLPixelFormat = MTLPixelFormat.Invalid

    open fun setStencilAttachmentPixelFormat(stencil_attachment_pixel_format: MTLPixelFormat) {}

    open fun inputPrimitiveTopology(): MTLPrimitiveTopologyClass =
        MTLPrimitiveTopologyClass.Unspecified

    open fun setInputPrimitiveTopology(input_primitive_topology: MTLPrimitiveTopologyClass) {}

    open fun tessellationPartitionMode(): MTLTessellationPartitionMode =
        MTLTessellationPartitionMode.Pow2

    open fun setTessellationPartitionMode(
        tessellation_partition_mode: MTLTessellationPartitionMode,
    ) {}

    open fun maxTessellationFactor(): NSUInteger = 16uL

    open fun setMaxTessellationFactor(max_tessellation_factor: NSUInteger) {}

    open fun isTessellationFactorScaleEnabled(): Boolean = false

    open fun setTessellationFactorScaleEnabled(tessellation_factor_scale_enabled: Boolean) {}

    open fun tessellationFactorFormat(): MTLTessellationFactorFormat =
        MTLTessellationFactorFormat.Half

    open fun setTessellationFactorFormat(
        tessellation_factor_format: MTLTessellationFactorFormat,
    ) {}

    open fun tessellationControlPointIndexType(): MTLTessellationControlPointIndexType =
        MTLTessellationControlPointIndexType.None

    open fun setTessellationControlPointIndexType(
        tessellation_control_point_index_type: MTLTessellationControlPointIndexType,
    ) {}

    open fun tessellationFactorStepFunction(): MTLTessellationFactorStepFunction =
        MTLTessellationFactorStepFunction.Constant

    open fun setTessellationFactorStepFunction(
        tessellation_factor_step_function: MTLTessellationFactorStepFunction,
    ) {}

    open fun tessellationOutputWindingOrder(): MTLWinding = MTLWinding.Clockwise

    open fun setTessellationOutputWindingOrder(tessellation_output_winding_order: MTLWinding) {}

    open fun vertexBuffers(): MTLPipelineBufferDescriptorArray = MTLPipelineBufferDescriptorArray()

    open fun fragmentBuffers(): MTLPipelineBufferDescriptorArray = MTLPipelineBufferDescriptorArray()

    open fun supportIndirectCommandBuffers(): Boolean = false

    open fun setSupportIndirectCommandBuffers(support_indirect_command_buffers: Boolean) {}

    open fun binaryArchives(): NSArray<MTLBinaryArchive>? = null

    open fun setBinaryArchives(binary_archives: NSArray<MTLBinaryArchive>?) {}

    open fun vertexPreloadedLibraries(): NSArray<MTLDynamicLibrary> = NSArray()

    open fun setVertexPreloadedLibraries(
        vertex_preloaded_libraries: NSArray<MTLDynamicLibrary>,
    ) {}

    open fun fragmentPreloadedLibraries(): NSArray<MTLDynamicLibrary> = NSArray()

    open fun setFragmentPreloadedLibraries(
        fragment_preloaded_libraries: NSArray<MTLDynamicLibrary>,
    ) {}

    open fun vertexLinkedFunctions(): MTLLinkedFunctions = MTLLinkedFunctions()

    open fun setVertexLinkedFunctions(vertex_linked_functions: MTLLinkedFunctions?) {}

    open fun fragmentLinkedFunctions(): MTLLinkedFunctions = MTLLinkedFunctions()

    open fun setFragmentLinkedFunctions(fragment_linked_functions: MTLLinkedFunctions?) {}

    open fun supportAddingVertexBinaryFunctions(): Boolean = false

    open fun setSupportAddingVertexBinaryFunctions(
        support_adding_vertex_binary_functions: Boolean,
    ) {}

    open fun supportAddingFragmentBinaryFunctions(): Boolean = false

    open fun setSupportAddingFragmentBinaryFunctions(
        support_adding_fragment_binary_functions: Boolean,
    ) {}

    open fun maxVertexCallStackDepth(): NSUInteger = 1uL

    open fun setMaxVertexCallStackDepth(max_vertex_call_stack_depth: NSUInteger) {}

    open fun maxFragmentCallStackDepth(): NSUInteger = 1uL

    open fun setMaxFragmentCallStackDepth(max_fragment_call_stack_depth: NSUInteger) {}

    open fun reset() {}

    open fun shaderValidation(): MTLShaderValidation = MTLShaderValidation.Default

    open fun setShaderValidation(shader_validation: MTLShaderValidation) {}

    override fun copy(): Any = this

    companion object {
        fun default_retained(): MTLRenderPipelineDescriptor = new()

        fun init(): MTLRenderPipelineDescriptor = MTLRenderPipelineDescriptor()

        fun new(): MTLRenderPipelineDescriptor = MTLRenderPipelineDescriptor()
    }
}

/**
 * Descriptor for additional binary functions in render pipeline states.
 */
open class MTLRenderPipelineFunctionsDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLRenderPipelineFunctionsDescriptor

    open fun vertexAdditionalBinaryFunctions(): NSArray<MTLFunction>? = null

    open fun setVertexAdditionalBinaryFunctions(
        vertex_additional_binary_functions: NSArray<MTLFunction>?,
    ) {}

    open fun fragmentAdditionalBinaryFunctions(): NSArray<MTLFunction>? = null

    open fun setFragmentAdditionalBinaryFunctions(
        fragment_additional_binary_functions: NSArray<MTLFunction>?,
    ) {}

    open fun tileAdditionalBinaryFunctions(): NSArray<MTLFunction>? = null

    open fun setTileAdditionalBinaryFunctions(
        tile_additional_binary_functions: NSArray<MTLFunction>?,
    ) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLRenderPipelineFunctionsDescriptor = MTLRenderPipelineFunctionsDescriptor()

        fun new(): MTLRenderPipelineFunctionsDescriptor = MTLRenderPipelineFunctionsDescriptor()
    }
}

/**
 * Protocol representing a compiled render pipeline state.
 */
interface MTLRenderPipelineState : NSObjectProtocol {
    fun label(): NSString? = null

    fun device(): MTLDevice

    fun maxTotalThreadsPerThreadgroup(): NSUInteger = 0uL

    fun threadgroupSizeMatchesTileSize(): Boolean = false

    fun imageblockSampleLength(): NSUInteger = 0uL

    fun imageblockMemoryLengthForDimensions(imageblock_dimensions: MTLSize): NSUInteger = 0uL

    fun supportIndirectCommandBuffers(): Boolean = false

    fun maxTotalThreadsPerObjectThreadgroup(): NSUInteger = 0uL

    fun maxTotalThreadsPerMeshThreadgroup(): NSUInteger = 0uL

    fun objectThreadExecutionWidth(): NSUInteger = 0uL

    fun meshThreadExecutionWidth(): NSUInteger = 0uL

    fun maxTotalThreadgroupsPerMeshGrid(): NSUInteger = 0uL

    fun gpuResourceID(): MTLResourceID = MTLResourceID()

    fun functionHandleWithFunction_stage(
        function: MTLFunction,
        stage: MTLRenderStages,
    ): MTLFunctionHandle? = null

    fun newVisibleFunctionTableWithDescriptor_stage(
        descriptor: MTLVisibleFunctionTableDescriptor,
        stage: MTLRenderStages,
    ): MTLVisibleFunctionTable? = null

    fun newIntersectionFunctionTableWithDescriptor_stage(
        descriptor: MTLIntersectionFunctionTableDescriptor,
        stage: MTLRenderStages,
    ): MTLIntersectionFunctionTable? = null

    fun newRenderPipelineStateWithAdditionalBinaryFunctions_error(
        additional_binary_functions: MTLRenderPipelineFunctionsDescriptor,
    ): MTLRenderPipelineState? = null

    fun shaderValidation(): MTLShaderValidation = MTLShaderValidation.Default
}

/**
 * Tile render pipeline color attachment descriptor.
 */
open class MTLTileRenderPipelineColorAttachmentDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLTileRenderPipelineColorAttachmentDescriptor

    open fun pixelFormat(): MTLPixelFormat = MTLPixelFormat.Invalid

    open fun setPixelFormat(pixel_format: MTLPixelFormat) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLTileRenderPipelineColorAttachmentDescriptor =
            MTLTileRenderPipelineColorAttachmentDescriptor()

        fun new(): MTLTileRenderPipelineColorAttachmentDescriptor =
            MTLTileRenderPipelineColorAttachmentDescriptor()
    }
}

/**
 * Array of tile render pipeline color attachment descriptors.
 */
open class MTLTileRenderPipelineColorAttachmentDescriptorArray :
    NSObject(),
    NSObjectProtocol {
    open fun objectAtIndexedSubscript(attachment_index: NSUInteger): MTLTileRenderPipelineColorAttachmentDescriptor =
        MTLTileRenderPipelineColorAttachmentDescriptor()

    open fun setObject_atIndexedSubscript(
        attachment: MTLTileRenderPipelineColorAttachmentDescriptor,
        attachment_index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLTileRenderPipelineColorAttachmentDescriptorArray =
            MTLTileRenderPipelineColorAttachmentDescriptorArray()

        fun new(): MTLTileRenderPipelineColorAttachmentDescriptorArray =
            MTLTileRenderPipelineColorAttachmentDescriptorArray()
    }
}

/**
 * Descriptor used to configure a tile render pipeline state.
 */
open class MTLTileRenderPipelineDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLTileRenderPipelineDescriptor

    open fun label(): NSString? = null

    open fun setLabel(label: NSString?) {}

    open fun tileFunction(): MTLFunction? = null

    open fun setTileFunction(tile_function: MTLFunction) {}

    open fun rasterSampleCount(): NSUInteger = 1uL

    open fun setRasterSampleCount(raster_sample_count: NSUInteger) {}

    open fun colorAttachments(): MTLTileRenderPipelineColorAttachmentDescriptorArray =
        MTLTileRenderPipelineColorAttachmentDescriptorArray()

    open fun threadgroupSizeMatchesTileSize(): Boolean = false

    open fun setThreadgroupSizeMatchesTileSize(threadgroup_size_matches_tile_size: Boolean) {}

    open fun tileBuffers(): MTLPipelineBufferDescriptorArray = MTLPipelineBufferDescriptorArray()

    open fun maxTotalThreadsPerThreadgroup(): NSUInteger = 0uL

    open fun setMaxTotalThreadsPerThreadgroup(max_total_threads_per_threadgroup: NSUInteger) {}

    open fun binaryArchives(): NSArray<MTLBinaryArchive>? = null

    open fun setBinaryArchives(binary_archives: NSArray<MTLBinaryArchive>?) {}

    open fun preloadedLibraries(): NSArray<MTLDynamicLibrary> = NSArray()

    open fun setPreloadedLibraries(preloaded_libraries: NSArray<MTLDynamicLibrary>) {}

    open fun linkedFunctions(): MTLLinkedFunctions = MTLLinkedFunctions()

    open fun setLinkedFunctions(linked_functions: MTLLinkedFunctions?) {}

    open fun supportAddingBinaryFunctions(): Boolean = false

    open fun setSupportAddingBinaryFunctions(support_adding_binary_functions: Boolean) {}

    open fun maxCallStackDepth(): NSUInteger = 1uL

    open fun setMaxCallStackDepth(max_call_stack_depth: NSUInteger) {}

    open fun reset() {}

    open fun shaderValidation(): MTLShaderValidation = MTLShaderValidation.Default

    open fun setShaderValidation(shader_validation: MTLShaderValidation) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLTileRenderPipelineDescriptor = MTLTileRenderPipelineDescriptor()

        fun new(): MTLTileRenderPipelineDescriptor = MTLTileRenderPipelineDescriptor()
    }
}

/**
 * Descriptor used to configure a mesh render pipeline state.
 */
open class MTLMeshRenderPipelineDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLMeshRenderPipelineDescriptor

    open fun label(): NSString? = null

    open fun setLabel(label: NSString?) {}

    open fun objectFunction(): MTLFunction? = null

    open fun setObjectFunction(object_function: MTLFunction?) {}

    open fun meshFunction(): MTLFunction? = null

    open fun setMeshFunction(mesh_function: MTLFunction?) {}

    open fun fragmentFunction(): MTLFunction? = null

    open fun setFragmentFunction(fragment_function: MTLFunction?) {}

    open fun maxTotalThreadsPerObjectThreadgroup(): NSUInteger = 0uL

    open fun setMaxTotalThreadsPerObjectThreadgroup(
        max_total_threads_per_object_threadgroup: NSUInteger,
    ) {}

    open fun maxTotalThreadsPerMeshThreadgroup(): NSUInteger = 0uL

    open fun setMaxTotalThreadsPerMeshThreadgroup(
        max_total_threads_per_mesh_threadgroup: NSUInteger,
    ) {}

    open fun objectThreadgroupSizeIsMultipleOfThreadExecutionWidth(): Boolean = false

    open fun setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth(
        object_threadgroup_size_is_multiple_of_thread_execution_width: Boolean,
    ) {}

    open fun meshThreadgroupSizeIsMultipleOfThreadExecutionWidth(): Boolean = false

    open fun setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth(
        mesh_threadgroup_size_is_multiple_of_thread_execution_width: Boolean,
    ) {}

    open fun payloadMemoryLength(): NSUInteger = 0uL

    open fun setPayloadMemoryLength(payload_memory_length: NSUInteger) {}

    open fun maxTotalThreadgroupsPerMeshGrid(): NSUInteger = 0uL

    open fun setMaxTotalThreadgroupsPerMeshGrid(max_total_threadgroups_per_mesh_grid: NSUInteger) {}

    open fun objectBuffers(): MTLPipelineBufferDescriptorArray = MTLPipelineBufferDescriptorArray()

    open fun meshBuffers(): MTLPipelineBufferDescriptorArray = MTLPipelineBufferDescriptorArray()

    open fun fragmentBuffers(): MTLPipelineBufferDescriptorArray = MTLPipelineBufferDescriptorArray()

    open fun rasterSampleCount(): NSUInteger = 1uL

    open fun setRasterSampleCount(raster_sample_count: NSUInteger) {}

    open fun isAlphaToCoverageEnabled(): Boolean = false

    open fun setAlphaToCoverageEnabled(alpha_to_coverage_enabled: Boolean) {}

    open fun isAlphaToOneEnabled(): Boolean = false

    open fun setAlphaToOneEnabled(alpha_to_one_enabled: Boolean) {}

    open fun isRasterizationEnabled(): Boolean = true

    open fun setRasterizationEnabled(rasterization_enabled: Boolean) {}

    open fun maxVertexAmplificationCount(): NSUInteger = 1uL

    open fun setMaxVertexAmplificationCount(max_vertex_amplification_count: NSUInteger) {}

    open fun colorAttachments(): MTLRenderPipelineColorAttachmentDescriptorArray =
        MTLRenderPipelineColorAttachmentDescriptorArray()

    open fun depthAttachmentPixelFormat(): MTLPixelFormat = MTLPixelFormat.Invalid

    open fun setDepthAttachmentPixelFormat(depth_attachment_pixel_format: MTLPixelFormat) {}

    open fun stencilAttachmentPixelFormat(): MTLPixelFormat = MTLPixelFormat.Invalid

    open fun setStencilAttachmentPixelFormat(stencil_attachment_pixel_format: MTLPixelFormat) {}

    open fun supportIndirectCommandBuffers(): Boolean = false

    open fun setSupportIndirectCommandBuffers(support_indirect_command_buffers: Boolean) {}

    open fun binaryArchives(): NSArray<MTLBinaryArchive>? = null

    open fun setBinaryArchives(binary_archives: NSArray<MTLBinaryArchive>?) {}

    open fun objectLinkedFunctions(): MTLLinkedFunctions = MTLLinkedFunctions()

    open fun setObjectLinkedFunctions(object_linked_functions: MTLLinkedFunctions?) {}

    open fun meshLinkedFunctions(): MTLLinkedFunctions = MTLLinkedFunctions()

    open fun setMeshLinkedFunctions(mesh_linked_functions: MTLLinkedFunctions?) {}

    open fun fragmentLinkedFunctions(): MTLLinkedFunctions = MTLLinkedFunctions()

    open fun setFragmentLinkedFunctions(fragment_linked_functions: MTLLinkedFunctions?) {}

    open fun reset() {}

    open fun shaderValidation(): MTLShaderValidation = MTLShaderValidation.Default

    open fun setShaderValidation(shader_validation: MTLShaderValidation) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLMeshRenderPipelineDescriptor = MTLMeshRenderPipelineDescriptor()

        fun new(): MTLMeshRenderPipelineDescriptor = MTLMeshRenderPipelineDescriptor()
    }
}
