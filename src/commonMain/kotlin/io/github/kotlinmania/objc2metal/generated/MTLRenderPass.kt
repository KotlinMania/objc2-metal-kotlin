// port-lint: source generated/MTLRenderPass.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * An RGBA float color.
 */
data class MTLClearColor(
    val red: Double = 0.0,
    val green: Double = 0.0,
    val blue: Double = 0.0,
    val alpha: Double = 0.0,
) {
    companion object {
        const val ENCODING: String = "{?=dddd}"
        const val ENCODING_REF: String = "^{?=dddd}"
    }
}

/**
 * Options for loadAction property.
 */
data class MTLLoadAction(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val DontCare = MTLLoadAction(0uL)
        val Load = MTLLoadAction(1uL)
        val Clear = MTLLoadAction(2uL)
    }
}

/**
 * Options for storeAction property.
 */
data class MTLStoreAction(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val DontCare = MTLStoreAction(0uL)
        val Store = MTLStoreAction(1uL)
        val MultisampleResolve = MTLStoreAction(2uL)
        val StoreAndMultisampleResolve = MTLStoreAction(3uL)
        val Unknown = MTLStoreAction(4uL)
        val CustomSampleDepthStore = MTLStoreAction(5uL)
    }
}

/**
 * Options for storeActionOptions property.
 */
data class MTLStoreActionOptions(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val None = MTLStoreActionOptions(0uL)
        val CustomSamplePositions = MTLStoreActionOptions(1uL shl 0)
    }
}

/**
 * Controls the MSAA depth resolve operation.
 */
data class MTLMultisampleDepthResolveFilter(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Sample0 = MTLMultisampleDepthResolveFilter(0uL)
        val Min = MTLMultisampleDepthResolveFilter(1uL)
        val Max = MTLMultisampleDepthResolveFilter(2uL)
    }
}

/**
 * Controls the MSAA stencil resolve operation.
 */
data class MTLMultisampleStencilResolveFilter(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Sample0 = MTLMultisampleStencilResolveFilter(0uL)
        val DepthResolvedSample = MTLMultisampleStencilResolveFilter(1uL)
    }
}

open class MTLRenderPassAttachmentDescriptor : NSObject() {
    typealias Result = MTLRenderPassAttachmentDescriptor

    var texture: MTLTexture? = null
    var level: NSUInteger = 0uL
    var slice: NSUInteger = 0uL
    var depthPlane: NSUInteger = 0uL
    var resolveTexture: MTLTexture? = null
    var resolveLevel: NSUInteger = 0uL
    var resolveSlice: NSUInteger = 0uL
    var resolveDepthPlane: NSUInteger = 0uL
    var loadAction: MTLLoadAction = MTLLoadAction.DontCare
    var storeAction: MTLStoreAction = MTLStoreAction.DontCare
    var storeActionOptions: MTLStoreActionOptions = MTLStoreActionOptions.None
}

open class MTLRenderPassColorAttachmentDescriptor : MTLRenderPassAttachmentDescriptor() {
    typealias Result = MTLRenderPassColorAttachmentDescriptor

    var clearColor: MTLClearColor = MTLClearColor()

    companion object {
        fun defaultRetained(): MTLRenderPassColorAttachmentDescriptor =
            MTLRenderPassColorAttachmentDescriptor()
    }
}

open class MTLRenderPassDepthAttachmentDescriptor : MTLRenderPassAttachmentDescriptor() {
    typealias Result = MTLRenderPassDepthAttachmentDescriptor

    var clearDepth: Double = 1.0
    var depthResolveFilter: MTLMultisampleDepthResolveFilter =
        MTLMultisampleDepthResolveFilter.Sample0
}

open class MTLRenderPassStencilAttachmentDescriptor : MTLRenderPassAttachmentDescriptor() {
    typealias Result = MTLRenderPassStencilAttachmentDescriptor

    var clearStencil: UInt = 0u
    var stencilResolveFilter: MTLMultisampleStencilResolveFilter =
        MTLMultisampleStencilResolveFilter.Sample0
}

open class MTLRenderPassColorAttachmentDescriptorArray : NSObject() {
    private val attachments = mutableMapOf<NSUInteger, MTLRenderPassColorAttachmentDescriptor>()

    fun objectAtIndexedSubscript(attachmentIndex: NSUInteger): MTLRenderPassColorAttachmentDescriptor {
        return attachments.getOrPut(attachmentIndex) { MTLRenderPassColorAttachmentDescriptor() }
    }

    fun setObjectAtIndexedSubscript(
        attachment: MTLRenderPassColorAttachmentDescriptor?,
        attachmentIndex: NSUInteger,
    ) {
        if (attachment != null) {
            attachments[attachmentIndex] = attachment
        } else {
            attachments.remove(attachmentIndex)
        }
    }
}

open class MTLRenderPassSampleBufferAttachmentDescriptor : NSObject() {
    typealias Result = MTLRenderPassSampleBufferAttachmentDescriptor

    var sampleBuffer: Any? = null
    var startOfVertexSampleIndex: NSUInteger = 0uL
    var endOfVertexSampleIndex: NSUInteger = 0uL
    var startOfFragmentSampleIndex: NSUInteger = 0uL
    var endOfFragmentSampleIndex: NSUInteger = 0uL
}

open class MTLRenderPassSampleBufferAttachmentDescriptorArray : NSObject() {
    private val attachments =
        mutableMapOf<NSUInteger, MTLRenderPassSampleBufferAttachmentDescriptor>()

    fun objectAtIndexedSubscript(
        attachmentIndex: NSUInteger,
    ): MTLRenderPassSampleBufferAttachmentDescriptor {
        return attachments.getOrPut(attachmentIndex) {
            MTLRenderPassSampleBufferAttachmentDescriptor()
        }
    }

    fun setObjectAtIndexedSubscript(
        attachment: MTLRenderPassSampleBufferAttachmentDescriptor?,
        attachmentIndex: NSUInteger,
    ) {
        if (attachment != null) {
            attachments[attachmentIndex] = attachment
        } else {
            attachments.remove(attachmentIndex)
        }
    }
}

open class MTLRenderPassDescriptor : NSObject() {
    typealias Result = MTLRenderPassDescriptor

    val colorAttachments: MTLRenderPassColorAttachmentDescriptorArray =
        MTLRenderPassColorAttachmentDescriptorArray()
    var depthAttachment: MTLRenderPassDepthAttachmentDescriptor =
        MTLRenderPassDepthAttachmentDescriptor()
    var stencilAttachment: MTLRenderPassStencilAttachmentDescriptor =
        MTLRenderPassStencilAttachmentDescriptor()
    var visibilityResultBuffer: MTLBuffer? = null
    var renderTargetArrayLength: NSUInteger = 0uL
    var imageblockSampleLength: NSUInteger = 0uL
    var threadgroupMemoryLength: NSUInteger = 0uL
    var tileWidth: NSUInteger = 0uL
    var tileHeight: NSUInteger = 0uL
    var defaultRasterSampleCount: NSUInteger = 1uL
    var renderTargetWidth: NSUInteger = 0uL
    var renderTargetHeight: NSUInteger = 0uL
    val sampleBufferAttachments: MTLRenderPassSampleBufferAttachmentDescriptorArray =
        MTLRenderPassSampleBufferAttachmentDescriptorArray()

    companion object {
        fun renderPassDescriptor(): MTLRenderPassDescriptor = MTLRenderPassDescriptor()
    }
}
