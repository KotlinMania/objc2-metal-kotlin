// port-lint: source generated/MTLRenderCommandEncoder.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Geometric primitive types for drawing commands.
 */
data class MTLPrimitiveType(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Point = MTLPrimitiveType(0uL)
        val Line = MTLPrimitiveType(1uL)
        val LineStrip = MTLPrimitiveType(2uL)
        val Triangle = MTLPrimitiveType(3uL)
        val TriangleStrip = MTLPrimitiveType(4uL)
    }
}

/**
 * Visibility result modes for occlusion testing.
 */
data class MTLVisibilityResultMode(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Disabled = MTLVisibilityResultMode(0uL)
        val Boolean = MTLVisibilityResultMode(1uL)
        val Counting = MTLVisibilityResultMode(2uL)
    }
}

/**
 * A rectangle for the scissor fragment test.
 */
data class MTLScissorRect(
    val x: NSUInteger = 0uL,
    val y: NSUInteger = 0uL,
    val width: NSUInteger = 0uL,
    val height: NSUInteger = 0uL,
) {
    companion object {
        const val ENCODING: String = "{?=QQQQ}"
        const val ENCODING_REF: String = "^{?=QQQQ}"
    }
}

/**
 * A 3D viewport.
 */
data class MTLViewport(
    val originX: Double = 0.0,
    val originY: Double = 0.0,
    val width: Double = 0.0,
    val height: Double = 0.0,
    val znear: Double = 0.0,
    val zfar: Double = 0.0,
) {
    companion object {
        const val ENCODING: String = "{?=dddddd}"
        const val ENCODING_REF: String = "^{?=dddddd}"
    }
}

/**
 * Modes for culling primitives.
 */
data class MTLCullMode(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val None = MTLCullMode(0uL)
        val Front = MTLCullMode(1uL)
        val Back = MTLCullMode(2uL)
    }
}

/**
 * Winding order for front-facing primitives.
 */
data class MTLWinding(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Clockwise = MTLWinding(0uL)
        val CounterClockwise = MTLWinding(1uL)
    }
}

/**
 * Modes for depth clipping.
 */
data class MTLDepthClipMode(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Clip = MTLDepthClipMode(0uL)
        val Clamp = MTLDepthClipMode(1uL)
    }
}

/**
 * Options for filling triangles.
 */
data class MTLTriangleFillMode(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Fill = MTLTriangleFillMode(0uL)
        val Lines = MTLTriangleFillMode(1uL)
    }
}

/**
 * Indirect arguments for drawPrimitives.
 */
data class MTLDrawPrimitivesIndirectArguments(
    val vertexCount: UInt = 0u,
    val instanceCount: UInt = 0u,
    val vertexStart: UInt = 0u,
    val baseInstance: UInt = 0u,
) {
    companion object {
        const val ENCODING: String = "{?=IIII}"
        const val ENCODING_REF: String = "^{?=IIII}"
    }
}

/**
 * Indirect arguments for drawIndexedPrimitives.
 */
data class MTLDrawIndexedPrimitivesIndirectArguments(
    val indexCount: UInt = 0u,
    val instanceCount: UInt = 0u,
    val indexStart: UInt = 0u,
    val baseVertex: Int = 0,
    val baseInstance: UInt = 0u,
) {
    companion object {
        const val ENCODING: String = "{?=IIIiI}"
        const val ENCODING_REF: String = "^{?=IIIiI}"
    }
}

/**
 * Vertex amplification view mapping.
 */
data class MTLVertexAmplificationViewMapping(
    val viewportArrayIndexOffset: UInt = 0u,
    val renderTargetArrayIndexOffset: UInt = 0u,
) {
    companion object {
        const val ENCODING: String = "{?=II}"
        const val ENCODING_REF: String = "^{?=II}"
    }
}

/**
 * Indirect arguments for drawPatches.
 */
data class MTLDrawPatchIndirectArguments(
    val patchCount: UInt = 0u,
    val instanceCount: UInt = 0u,
    val patchStart: UInt = 0u,
    val baseInstance: UInt = 0u,
) {
    companion object {
        const val ENCODING: String = "{?=IIII}"
        const val ENCODING_REF: String = "^{?=IIII}"
    }
}

/**
 * Quad tessellation factors.
 */
data class MTLQuadTessellationFactorsHalf(
    val edgeTessellationFactor: List<UShort> = emptyList(),
    val insideTessellationFactor: List<UShort> = emptyList(),
) {
    companion object {
        const val ENCODING: String = "{?=[4S][2S]}"
        const val ENCODING_REF: String = "^{?=[4S][2S]}"
    }
}

/**
 * Triangle tessellation factors.
 */
data class MTLTriangleTessellationFactorsHalf(
    val edgeTessellationFactor: List<UShort> = emptyList(),
    val insideTessellationFactor: UShort = 0u,
) {
    companion object {
        const val ENCODING: String = "{?=[3S]S}"
        const val ENCODING_REF: String = "^{?=[3S]S}"
    }
}

/**
 * Render stages options.
 */
data class MTLRenderStages(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * An encoder that encodes graphics rendering commands.
 */
interface MTLRenderCommandEncoder : MTLCommandEncoder {
    fun setViewport(viewport: MTLViewport)
    fun setViewports(viewports: List<MTLViewport>)
    fun setCullMode(cullMode: MTLCullMode)
    fun setFrontFacingWinding(frontFacingWinding: MTLWinding)
    fun setScissorRect(rect: MTLScissorRect)
    fun setScissorRects(scissorRects: List<MTLScissorRect>)
}
