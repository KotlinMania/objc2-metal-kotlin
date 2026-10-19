// port-lint: source generated/MTLAccelerationStructure.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Options for acceleration structure usage.
 */
data class MTLAccelerationStructureUsage(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val None = MTLAccelerationStructureUsage(0uL)
        val Refit = MTLAccelerationStructureUsage(1uL shl 0)
        val PreferFastBuild = MTLAccelerationStructureUsage(1uL shl 1)
        val ExtendedLimits = MTLAccelerationStructureUsage(1uL shl 2)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Options for acceleration structure instances.
 */
data class MTLAccelerationStructureInstanceOptions(
    val rawValue: UInt = 0u,
) {
    companion object {
        val None = MTLAccelerationStructureInstanceOptions(0u)
        val DisableTriangleCulling = MTLAccelerationStructureInstanceOptions(1u shl 0)
        val TriangleFrontFacingWindingCounterClockwise = MTLAccelerationStructureInstanceOptions(1u shl 1)
        val Opaque = MTLAccelerationStructureInstanceOptions(1u shl 2)
        val NonOpaque = MTLAccelerationStructureInstanceOptions(1u shl 3)
        const val ENCODING: String = "I"
        const val ENCODING_REF: String = "^I"
    }
}

/**
 * Matrix layout for transformation matrices.
 */
data class MTLMatrixLayout(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val ColumnMajor = MTLMatrixLayout(0L)
        val RowMajor = MTLMatrixLayout(1L)
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * Motion border modes.
 */
data class MTLMotionBorderMode(
    val rawValue: UInt = 0u,
) {
    companion object {
        val Clamp = MTLMotionBorderMode(0u)
        val Vanish = MTLMotionBorderMode(1u)
        const val ENCODING: String = "I"
        const val ENCODING_REF: String = "^I"
    }
}

/**
 * Curve types.
 */
data class MTLCurveType(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val Round = MTLCurveType(0L)
        val Flat = MTLCurveType(1L)
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * Basis function for curves.
 */
data class MTLCurveBasis(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val BSpline = MTLCurveBasis(0L)
        val CatmullRom = MTLCurveBasis(1L)
        val Linear = MTLCurveBasis(2L)
        val Bezier = MTLCurveBasis(3L)
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * Type of curve end caps.
 */
data class MTLCurveEndCaps(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val None = MTLCurveEndCaps(0L)
        val Disk = MTLCurveEndCaps(1L)
        val Sphere = MTLCurveEndCaps(2L)
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * Default instance descriptor for acceleration structures.
 */
data class MTLAccelerationStructureInstanceDescriptor(
    val transformationMatrix: MTLPackedFloat4x3 = MTLPackedFloat4x3(),
    val options: MTLAccelerationStructureInstanceOptions = MTLAccelerationStructureInstanceOptions(),
    val mask: UInt = 0u,
    val intersectionFunctionTableOffset: UInt = 0u,
    val accelerationStructureIndex: UInt = 0u,
) {
    companion object {
        const val ENCODING: String = "{?=I}"
        const val ENCODING_REF: String = "^{?=I}"
    }
}

/**
 * User-ID instance descriptor for acceleration structures.
 */
data class MTLAccelerationStructureUserIDInstanceDescriptor(
    val transformationMatrix: MTLPackedFloat4x3 = MTLPackedFloat4x3(),
    val options: MTLAccelerationStructureInstanceOptions = MTLAccelerationStructureInstanceOptions(),
    val mask: UInt = 0u,
    val intersectionFunctionTableOffset: UInt = 0u,
    val accelerationStructureIndex: UInt = 0u,
    val userID: UInt = 0u,
) {
    companion object {
        const val ENCODING: String = "{?=I}"
        const val ENCODING_REF: String = "^{?=I}"
    }
}

/**
 * Types of acceleration structure instance descriptors.
 */
data class MTLAccelerationStructureInstanceDescriptorType(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Default = MTLAccelerationStructureInstanceDescriptorType(0uL)
        val UserID = MTLAccelerationStructureInstanceDescriptorType(1uL)
        val Motion = MTLAccelerationStructureInstanceDescriptorType(2uL)
        val Indirect = MTLAccelerationStructureInstanceDescriptorType(3uL)
        val IndirectMotion = MTLAccelerationStructureInstanceDescriptorType(4uL)
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Motion instance descriptor for acceleration structures.
 */
data class MTLAccelerationStructureMotionInstanceDescriptor(
    val options: MTLAccelerationStructureInstanceOptions = MTLAccelerationStructureInstanceOptions(),
    val mask: UInt = 0u,
    val intersectionFunctionTableOffset: UInt = 0u,
    val accelerationStructureIndex: UInt = 0u,
    val userID: UInt = 0u,
    val motionTransformsStartIndex: UInt = 0u,
    val motionTransformsCount: UInt = 0u,
    val motionStartBorderMode: MTLMotionBorderMode = MTLMotionBorderMode.Clamp,
    val motionEndBorderMode: MTLMotionBorderMode = MTLMotionBorderMode.Clamp,
    val motionStartTime: Float = 0.0f,
    val motionEndTime: Float = 0.0f,
) {
    companion object {
        const val ENCODING: String = "{?=I}"
        const val ENCODING_REF: String = "^{?=I}"
    }
}

/**
 * Indirect acceleration structure instance descriptor.
 */
data class MTLIndirectAccelerationStructureInstanceDescriptor(
    val transformationMatrix: MTLPackedFloat4x3 = MTLPackedFloat4x3(),
    val options: MTLAccelerationStructureInstanceOptions = MTLAccelerationStructureInstanceOptions(),
    val mask: UInt = 0u,
    val intersectionFunctionTableOffset: UInt = 0u,
    val userID: UInt = 0u,
    val accelerationStructureID: MTLResourceID = MTLResourceID(),
) {
    companion object {
        const val ENCODING: String = "{?=I}"
        const val ENCODING_REF: String = "^{?=I}"
    }
}

/**
 * Indirect motion acceleration structure instance descriptor.
 */
data class MTLIndirectAccelerationStructureMotionInstanceDescriptor(
    val options: MTLAccelerationStructureInstanceOptions = MTLAccelerationStructureInstanceOptions(),
    val mask: UInt = 0u,
    val intersectionFunctionTableOffset: UInt = 0u,
    val userID: UInt = 0u,
    val accelerationStructureID: MTLResourceID = MTLResourceID(),
    val motionTransformsStartIndex: UInt = 0u,
    val motionTransformsCount: UInt = 0u,
    val motionStartBorderMode: MTLMotionBorderMode = MTLMotionBorderMode.Clamp,
    val motionEndBorderMode: MTLMotionBorderMode = MTLMotionBorderMode.Clamp,
    val motionStartTime: Float = 0.0f,
    val motionEndTime: Float = 0.0f,
) {
    companion object {
        const val ENCODING: String = "{?=I}"
        const val ENCODING_REF: String = "^{?=I}"
    }
}

/**
 * Transform types for motion blur.
 */
data class MTLTransformType(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val PackedFloat4x3 = MTLTransformType(0L)
        val Component = MTLTransformType(1L)
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * Base class for acceleration structure descriptors.
 */
open class MTLAccelerationStructureDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLAccelerationStructureDescriptor

    open fun usage(): MTLAccelerationStructureUsage = MTLAccelerationStructureUsage.None

    open fun setUsage(usage: MTLAccelerationStructureUsage) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLAccelerationStructureDescriptor = MTLAccelerationStructureDescriptor()

        fun new(): MTLAccelerationStructureDescriptor = MTLAccelerationStructureDescriptor()
    }
}

/**
 * Base class for all geometry descriptors.
 */
open class MTLAccelerationStructureGeometryDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLAccelerationStructureGeometryDescriptor

    open fun intersectionFunctionTableOffset(): NSUInteger = 0uL

    open fun setIntersectionFunctionTableOffset(intersection_function_table_offset: NSUInteger) {}

    open fun opaque(): Boolean = true

    open fun setOpaque(opaque: Boolean) {}

    open fun allowDuplicateIntersectionFunctionInvocation(): Boolean = true

    open fun setAllowDuplicateIntersectionFunctionInvocation(
        allow_duplicate_intersection_function_invocation: Boolean,
    ) {}

    open fun label(): NSString? = null

    open fun setLabel(label: NSString?) {}

    open fun primitiveDataBuffer(): MTLBuffer? = null

    open fun setPrimitiveDataBuffer(primitive_data_buffer: MTLBuffer?) {}

    open fun primitiveDataBufferOffset(): NSUInteger = 0uL

    open fun setPrimitiveDataBufferOffset(primitive_data_buffer_offset: NSUInteger) {}

    open fun primitiveDataStride(): NSUInteger = 0uL

    open fun setPrimitiveDataStride(primitive_data_stride: NSUInteger) {}

    open fun primitiveDataElementSize(): NSUInteger = 0uL

    open fun setPrimitiveDataElementSize(primitive_data_element_size: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLAccelerationStructureGeometryDescriptor = MTLAccelerationStructureGeometryDescriptor()

        fun new(): MTLAccelerationStructureGeometryDescriptor = MTLAccelerationStructureGeometryDescriptor()
    }
}

/**
 * Descriptor for a primitive acceleration structure.
 */
open class MTLPrimitiveAccelerationStructureDescriptor :
    MTLAccelerationStructureDescriptor(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLPrimitiveAccelerationStructureDescriptor

    open fun geometryDescriptors(): NSArray<MTLAccelerationStructureGeometryDescriptor>? = null

    open fun setGeometryDescriptors(
        geometry_descriptors: NSArray<MTLAccelerationStructureGeometryDescriptor>?,
    ) {}

    open fun motionStartBorderMode(): MTLMotionBorderMode = MTLMotionBorderMode.Clamp

    open fun setMotionStartBorderMode(motion_start_border_mode: MTLMotionBorderMode) {}

    open fun motionEndBorderMode(): MTLMotionBorderMode = MTLMotionBorderMode.Clamp

    open fun setMotionEndBorderMode(motion_end_border_mode: MTLMotionBorderMode) {}

    open fun motionStartTime(): Float = 0.0f

    open fun setMotionStartTime(motion_start_time: Float) {}

    open fun motionEndTime(): Float = 1.0f

    open fun setMotionEndTime(motion_end_time: Float) {}

    open fun motionKeyframeCount(): NSUInteger = 1uL

    open fun setMotionKeyframeCount(motion_keyframe_count: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun descriptor(): MTLPrimitiveAccelerationStructureDescriptor =
            MTLPrimitiveAccelerationStructureDescriptor()

        fun init(): MTLPrimitiveAccelerationStructureDescriptor =
            MTLPrimitiveAccelerationStructureDescriptor()

        fun new(): MTLPrimitiveAccelerationStructureDescriptor =
            MTLPrimitiveAccelerationStructureDescriptor()
    }
}

/**
 * Descriptor for triangle geometry.
 */
open class MTLAccelerationStructureTriangleGeometryDescriptor :
    MTLAccelerationStructureGeometryDescriptor(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLAccelerationStructureTriangleGeometryDescriptor

    open fun vertexBuffer(): MTLBuffer? = null

    open fun setVertexBuffer(vertex_buffer: MTLBuffer?) {}

    open fun vertexBufferOffset(): NSUInteger = 0uL

    open fun setVertexBufferOffset(vertex_buffer_offset: NSUInteger) {}

    open fun vertexFormat(): MTLAttributeFormat = MTLAttributeFormat.Float3

    open fun setVertexFormat(vertex_format: MTLAttributeFormat) {}

    open fun vertexStride(): NSUInteger = 0uL

    open fun setVertexStride(vertex_stride: NSUInteger) {}

    open fun indexBuffer(): MTLBuffer? = null

    open fun setIndexBuffer(index_buffer: MTLBuffer?) {}

    open fun indexBufferOffset(): NSUInteger = 0uL

    open fun setIndexBufferOffset(index_buffer_offset: NSUInteger) {}

    open fun indexType(): MTLIndexType = MTLIndexType.UInt32

    open fun setIndexType(index_type: MTLIndexType) {}

    open fun triangleCount(): NSUInteger = 0uL

    open fun setTriangleCount(triangle_count: NSUInteger) {}

    open fun transformationMatrixBuffer(): MTLBuffer? = null

    open fun setTransformationMatrixBuffer(transformation_matrix_buffer: MTLBuffer?) {}

    open fun transformationMatrixBufferOffset(): NSUInteger = 0uL

    open fun setTransformationMatrixBufferOffset(transformation_matrix_buffer_offset: NSUInteger) {}

    open fun transformationMatrixLayout(): MTLMatrixLayout = MTLMatrixLayout.ColumnMajor

    open fun setTransformationMatrixLayout(transformation_matrix_layout: MTLMatrixLayout) {}

    override fun copy(): Any = this

    companion object {
        fun descriptor(): MTLAccelerationStructureTriangleGeometryDescriptor =
            MTLAccelerationStructureTriangleGeometryDescriptor()

        fun init(): MTLAccelerationStructureTriangleGeometryDescriptor =
            MTLAccelerationStructureTriangleGeometryDescriptor()

        fun new(): MTLAccelerationStructureTriangleGeometryDescriptor =
            MTLAccelerationStructureTriangleGeometryDescriptor()
    }
}

/**
 * Descriptor for bounding box geometry.
 */
open class MTLAccelerationStructureBoundingBoxGeometryDescriptor :
    MTLAccelerationStructureGeometryDescriptor(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLAccelerationStructureBoundingBoxGeometryDescriptor

    open fun boundingBoxBuffer(): MTLBuffer? = null

    open fun setBoundingBoxBuffer(bounding_box_buffer: MTLBuffer?) {}

    open fun boundingBoxBufferOffset(): NSUInteger = 0uL

    open fun setBoundingBoxBufferOffset(bounding_box_buffer_offset: NSUInteger) {}

    open fun boundingBoxStride(): NSUInteger = 24uL

    open fun setBoundingBoxStride(bounding_box_stride: NSUInteger) {}

    open fun boundingBoxCount(): NSUInteger = 0uL

    open fun setBoundingBoxCount(bounding_box_count: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun descriptor(): MTLAccelerationStructureBoundingBoxGeometryDescriptor =
            MTLAccelerationStructureBoundingBoxGeometryDescriptor()

        fun init(): MTLAccelerationStructureBoundingBoxGeometryDescriptor =
            MTLAccelerationStructureBoundingBoxGeometryDescriptor()

        fun new(): MTLAccelerationStructureBoundingBoxGeometryDescriptor =
            MTLAccelerationStructureBoundingBoxGeometryDescriptor()
    }
}

/**
 * Motion keyframe data.
 */
open class MTLMotionKeyframeData :
    NSObject(),
    NSObjectProtocol {
    open fun buffer(): MTLBuffer? = null

    open fun setBuffer(buffer: MTLBuffer?) {}

    open fun offset(): NSUInteger = 0uL

    open fun setOffset(offset: NSUInteger) {}

    companion object {
        fun data(): MTLMotionKeyframeData = MTLMotionKeyframeData()

        fun init(): MTLMotionKeyframeData = MTLMotionKeyframeData()

        fun new(): MTLMotionKeyframeData = MTLMotionKeyframeData()
    }
}

/**
 * Descriptor for motion triangle geometry.
 */
open class MTLAccelerationStructureMotionTriangleGeometryDescriptor :
    MTLAccelerationStructureGeometryDescriptor(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLAccelerationStructureMotionTriangleGeometryDescriptor

    open fun vertexBuffers(): NSArray<MTLMotionKeyframeData> = NSArray()

    open fun setVertexBuffers(vertex_buffers: NSArray<MTLMotionKeyframeData>) {}

    open fun vertexFormat(): MTLAttributeFormat = MTLAttributeFormat.Float3

    open fun setVertexFormat(vertex_format: MTLAttributeFormat) {}

    open fun vertexStride(): NSUInteger = 0uL

    open fun setVertexStride(vertex_stride: NSUInteger) {}

    open fun indexBuffer(): MTLBuffer? = null

    open fun setIndexBuffer(index_buffer: MTLBuffer?) {}

    open fun indexBufferOffset(): NSUInteger = 0uL

    open fun setIndexBufferOffset(index_buffer_offset: NSUInteger) {}

    open fun indexType(): MTLIndexType = MTLIndexType.UInt32

    open fun setIndexType(index_type: MTLIndexType) {}

    open fun triangleCount(): NSUInteger = 0uL

    open fun setTriangleCount(triangle_count: NSUInteger) {}

    open fun transformationMatrixBuffer(): MTLBuffer? = null

    open fun setTransformationMatrixBuffer(transformation_matrix_buffer: MTLBuffer?) {}

    open fun transformationMatrixBufferOffset(): NSUInteger = 0uL

    open fun setTransformationMatrixBufferOffset(transformation_matrix_buffer_offset: NSUInteger) {}

    open fun transformationMatrixLayout(): MTLMatrixLayout = MTLMatrixLayout.ColumnMajor

    open fun setTransformationMatrixLayout(transformation_matrix_layout: MTLMatrixLayout) {}

    override fun copy(): Any = this

    companion object {
        fun descriptor(): MTLAccelerationStructureMotionTriangleGeometryDescriptor =
            MTLAccelerationStructureMotionTriangleGeometryDescriptor()

        fun init(): MTLAccelerationStructureMotionTriangleGeometryDescriptor =
            MTLAccelerationStructureMotionTriangleGeometryDescriptor()

        fun new(): MTLAccelerationStructureMotionTriangleGeometryDescriptor =
            MTLAccelerationStructureMotionTriangleGeometryDescriptor()
    }
}

/**
 * Descriptor for motion bounding box geometry.
 */
open class MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor :
    MTLAccelerationStructureGeometryDescriptor(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor

    open fun boundingBoxBuffers(): NSArray<MTLMotionKeyframeData> = NSArray()

    open fun setBoundingBoxBuffers(bounding_box_buffers: NSArray<MTLMotionKeyframeData>) {}

    open fun boundingBoxStride(): NSUInteger = 24uL

    open fun setBoundingBoxStride(bounding_box_stride: NSUInteger) {}

    open fun boundingBoxCount(): NSUInteger = 0uL

    open fun setBoundingBoxCount(bounding_box_count: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun descriptor(): MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor =
            MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor()

        fun init(): MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor =
            MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor()

        fun new(): MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor =
            MTLAccelerationStructureMotionBoundingBoxGeometryDescriptor()
    }
}

/**
 * Descriptor for curve geometry.
 */
open class MTLAccelerationStructureCurveGeometryDescriptor :
    MTLAccelerationStructureGeometryDescriptor(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLAccelerationStructureCurveGeometryDescriptor

    open fun controlPointBuffer(): MTLBuffer? = null

    open fun setControlPointBuffer(control_point_buffer: MTLBuffer?) {}

    open fun controlPointBufferOffset(): NSUInteger = 0uL

    open fun setControlPointBufferOffset(control_point_buffer_offset: NSUInteger) {}

    open fun controlPointCount(): NSUInteger = 0uL

    open fun setControlPointCount(control_point_count: NSUInteger) {}

    open fun controlPointStride(): NSUInteger = 0uL

    open fun setControlPointStride(control_point_stride: NSUInteger) {}

    open fun controlPointFormat(): MTLAttributeFormat = MTLAttributeFormat.Float3

    open fun setControlPointFormat(control_point_format: MTLAttributeFormat) {}

    open fun radiusBuffer(): MTLBuffer? = null

    open fun setRadiusBuffer(radius_buffer: MTLBuffer?) {}

    open fun radiusBufferOffset(): NSUInteger = 0uL

    open fun setRadiusBufferOffset(radius_buffer_offset: NSUInteger) {}

    open fun radiusFormat(): MTLAttributeFormat = MTLAttributeFormat.Float

    open fun setRadiusFormat(radius_format: MTLAttributeFormat) {}

    open fun radiusStride(): NSUInteger = 0uL

    open fun setRadiusStride(radius_stride: NSUInteger) {}

    open fun indexBuffer(): MTLBuffer? = null

    open fun setIndexBuffer(index_buffer: MTLBuffer?) {}

    open fun indexBufferOffset(): NSUInteger = 0uL

    open fun setIndexBufferOffset(index_buffer_offset: NSUInteger) {}

    open fun indexType(): MTLIndexType = MTLIndexType.UInt32

    open fun setIndexType(index_type: MTLIndexType) {}

    open fun segmentCount(): NSUInteger = 0uL

    open fun setSegmentCount(segment_count: NSUInteger) {}

    open fun segmentControlPointCount(): NSUInteger = 2uL

    open fun setSegmentControlPointCount(segment_control_point_count: NSUInteger) {}

    open fun curveType(): MTLCurveType = MTLCurveType.Round

    open fun setCurveType(curve_type: MTLCurveType) {}

    open fun curveBasis(): MTLCurveBasis = MTLCurveBasis.BSpline

    open fun setCurveBasis(curve_basis: MTLCurveBasis) {}

    open fun curveEndCaps(): MTLCurveEndCaps = MTLCurveEndCaps.None

    open fun setCurveEndCaps(curve_end_caps: MTLCurveEndCaps) {}

    override fun copy(): Any = this

    companion object {
        fun descriptor(): MTLAccelerationStructureCurveGeometryDescriptor =
            MTLAccelerationStructureCurveGeometryDescriptor()

        fun init(): MTLAccelerationStructureCurveGeometryDescriptor =
            MTLAccelerationStructureCurveGeometryDescriptor()

        fun new(): MTLAccelerationStructureCurveGeometryDescriptor =
            MTLAccelerationStructureCurveGeometryDescriptor()
    }
}

/**
 * Descriptor for motion curve geometry.
 */
open class MTLAccelerationStructureMotionCurveGeometryDescriptor :
    MTLAccelerationStructureGeometryDescriptor(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLAccelerationStructureMotionCurveGeometryDescriptor

    open fun controlPointBuffers(): NSArray<MTLMotionKeyframeData> = NSArray()

    open fun setControlPointBuffers(control_point_buffers: NSArray<MTLMotionKeyframeData>) {}

    open fun controlPointCount(): NSUInteger = 0uL

    open fun setControlPointCount(control_point_count: NSUInteger) {}

    open fun controlPointStride(): NSUInteger = 0uL

    open fun setControlPointStride(control_point_stride: NSUInteger) {}

    open fun controlPointFormat(): MTLAttributeFormat = MTLAttributeFormat.Float3

    open fun setControlPointFormat(control_point_format: MTLAttributeFormat) {}

    open fun radiusBuffers(): NSArray<MTLMotionKeyframeData> = NSArray()

    open fun setRadiusBuffers(radius_buffers: NSArray<MTLMotionKeyframeData>) {}

    open fun radiusFormat(): MTLAttributeFormat = MTLAttributeFormat.Float

    open fun setRadiusFormat(radius_format: MTLAttributeFormat) {}

    open fun radiusStride(): NSUInteger = 4uL

    open fun setRadiusStride(radius_stride: NSUInteger) {}

    open fun indexBuffer(): MTLBuffer? = null

    open fun setIndexBuffer(index_buffer: MTLBuffer?) {}

    open fun indexBufferOffset(): NSUInteger = 0uL

    open fun setIndexBufferOffset(index_buffer_offset: NSUInteger) {}

    open fun indexType(): MTLIndexType = MTLIndexType.UInt32

    open fun setIndexType(index_type: MTLIndexType) {}

    open fun segmentCount(): NSUInteger = 0uL

    open fun setSegmentCount(segment_count: NSUInteger) {}

    open fun segmentControlPointCount(): NSUInteger = 2uL

    open fun setSegmentControlPointCount(segment_control_point_count: NSUInteger) {}

    open fun curveType(): MTLCurveType = MTLCurveType.Round

    open fun setCurveType(curve_type: MTLCurveType) {}

    open fun curveBasis(): MTLCurveBasis = MTLCurveBasis.BSpline

    open fun setCurveBasis(curve_basis: MTLCurveBasis) {}

    open fun curveEndCaps(): MTLCurveEndCaps = MTLCurveEndCaps.None

    open fun setCurveEndCaps(curve_end_caps: MTLCurveEndCaps) {}

    override fun copy(): Any = this

    companion object {
        fun descriptor(): MTLAccelerationStructureMotionCurveGeometryDescriptor =
            MTLAccelerationStructureMotionCurveGeometryDescriptor()

        fun init(): MTLAccelerationStructureMotionCurveGeometryDescriptor =
            MTLAccelerationStructureMotionCurveGeometryDescriptor()

        fun new(): MTLAccelerationStructureMotionCurveGeometryDescriptor =
            MTLAccelerationStructureMotionCurveGeometryDescriptor()
    }
}

/**
 * Descriptor for an instance acceleration structure.
 */
open class MTLInstanceAccelerationStructureDescriptor :
    MTLAccelerationStructureDescriptor(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLInstanceAccelerationStructureDescriptor

    open fun instanceDescriptorBuffer(): MTLBuffer? = null

    open fun setInstanceDescriptorBuffer(instance_descriptor_buffer: MTLBuffer?) {}

    open fun instanceDescriptorBufferOffset(): NSUInteger = 0uL

    open fun setInstanceDescriptorBufferOffset(instance_descriptor_buffer_offset: NSUInteger) {}

    open fun instanceDescriptorStride(): NSUInteger = 0uL

    open fun setInstanceDescriptorStride(instance_descriptor_stride: NSUInteger) {}

    open fun instanceCount(): NSUInteger = 0uL

    open fun setInstanceCount(instance_count: NSUInteger) {}

    open fun instancedAccelerationStructures(): NSArray<MTLAccelerationStructure>? = null

    open fun setInstancedAccelerationStructures(
        instanced_acceleration_structures: NSArray<MTLAccelerationStructure>?,
    ) {}

    open fun instanceDescriptorType(): MTLAccelerationStructureInstanceDescriptorType =
        MTLAccelerationStructureInstanceDescriptorType.Default

    open fun setInstanceDescriptorType(
        instance_descriptor_type: MTLAccelerationStructureInstanceDescriptorType,
    ) {}

    open fun motionTransformBuffer(): MTLBuffer? = null

    open fun setMotionTransformBuffer(motion_transform_buffer: MTLBuffer?) {}

    open fun motionTransformBufferOffset(): NSUInteger = 0uL

    open fun setMotionTransformBufferOffset(motion_transform_buffer_offset: NSUInteger) {}

    open fun motionTransformCount(): NSUInteger = 0uL

    open fun setMotionTransformCount(motion_transform_count: NSUInteger) {}

    open fun instanceTransformationMatrixLayout(): MTLMatrixLayout = MTLMatrixLayout.ColumnMajor

    open fun setInstanceTransformationMatrixLayout(
        instance_transformation_matrix_layout: MTLMatrixLayout,
    ) {}

    open fun motionTransformType(): MTLTransformType = MTLTransformType.PackedFloat4x3

    open fun setMotionTransformType(motion_transform_type: MTLTransformType) {}

    open fun motionTransformStride(): NSUInteger = 0uL

    open fun setMotionTransformStride(motion_transform_stride: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun descriptor(): MTLInstanceAccelerationStructureDescriptor =
            MTLInstanceAccelerationStructureDescriptor()

        fun init(): MTLInstanceAccelerationStructureDescriptor =
            MTLInstanceAccelerationStructureDescriptor()

        fun new(): MTLInstanceAccelerationStructureDescriptor =
            MTLInstanceAccelerationStructureDescriptor()
    }
}

/**
 * Descriptor for an indirect instance acceleration structure.
 */
open class MTLIndirectInstanceAccelerationStructureDescriptor :
    MTLAccelerationStructureDescriptor(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLIndirectInstanceAccelerationStructureDescriptor

    open fun instanceDescriptorBuffer(): MTLBuffer? = null

    open fun setInstanceDescriptorBuffer(instance_descriptor_buffer: MTLBuffer?) {}

    open fun instanceDescriptorBufferOffset(): NSUInteger = 0uL

    open fun setInstanceDescriptorBufferOffset(instance_descriptor_buffer_offset: NSUInteger) {}

    open fun instanceDescriptorStride(): NSUInteger = 0uL

    open fun setInstanceDescriptorStride(instance_descriptor_stride: NSUInteger) {}

    open fun maxInstanceCount(): NSUInteger = 0uL

    open fun setMaxInstanceCount(max_instance_count: NSUInteger) {}

    open fun instanceCountBuffer(): MTLBuffer? = null

    open fun setInstanceCountBuffer(instance_count_buffer: MTLBuffer?) {}

    open fun instanceCountBufferOffset(): NSUInteger = 0uL

    open fun setInstanceCountBufferOffset(instance_count_buffer_offset: NSUInteger) {}

    open fun instanceDescriptorType(): MTLAccelerationStructureInstanceDescriptorType =
        MTLAccelerationStructureInstanceDescriptorType.Indirect

    open fun setInstanceDescriptorType(
        instance_descriptor_type: MTLAccelerationStructureInstanceDescriptorType,
    ) {}

    open fun motionTransformBuffer(): MTLBuffer? = null

    open fun setMotionTransformBuffer(motion_transform_buffer: MTLBuffer?) {}

    open fun motionTransformBufferOffset(): NSUInteger = 0uL

    open fun setMotionTransformBufferOffset(motion_transform_buffer_offset: NSUInteger) {}

    open fun maxMotionTransformCount(): NSUInteger = 0uL

    open fun setMaxMotionTransformCount(max_motion_transform_count: NSUInteger) {}

    open fun motionTransformCountBuffer(): MTLBuffer? = null

    open fun setMotionTransformCountBuffer(motion_transform_count_buffer: MTLBuffer?) {}

    open fun motionTransformCountBufferOffset(): NSUInteger = 0uL

    open fun setMotionTransformCountBufferOffset(motion_transform_count_buffer_offset: NSUInteger) {}

    open fun instanceTransformationMatrixLayout(): MTLMatrixLayout = MTLMatrixLayout.ColumnMajor

    open fun setInstanceTransformationMatrixLayout(
        instance_transformation_matrix_layout: MTLMatrixLayout,
    ) {}

    open fun motionTransformType(): MTLTransformType = MTLTransformType.PackedFloat4x3

    open fun setMotionTransformType(motion_transform_type: MTLTransformType) {}

    open fun motionTransformStride(): NSUInteger = 0uL

    open fun setMotionTransformStride(motion_transform_stride: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun descriptor(): MTLIndirectInstanceAccelerationStructureDescriptor =
            MTLIndirectInstanceAccelerationStructureDescriptor()

        fun init(): MTLIndirectInstanceAccelerationStructureDescriptor =
            MTLIndirectInstanceAccelerationStructureDescriptor()

        fun new(): MTLIndirectInstanceAccelerationStructureDescriptor =
            MTLIndirectInstanceAccelerationStructureDescriptor()
    }
}

/**
 * Protocol for acceleration structure resources.
 */
interface MTLAccelerationStructure : MTLResource {
    fun size(): NSUInteger = 0uL

    fun gpuResourceID(): MTLResourceID = MTLResourceID()
}
