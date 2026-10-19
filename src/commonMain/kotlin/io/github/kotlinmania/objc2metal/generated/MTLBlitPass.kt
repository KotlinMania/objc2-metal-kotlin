// port-lint: source generated/MTLBlitPass.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlblitpasssamplebufferattachmentdescriptor?language=objc)
 */
open class MTLBlitPassSampleBufferAttachmentDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLBlitPassSampleBufferAttachmentDescriptor

    open fun sampleBuffer(): MTLCounterSampleBuffer? = null

    open fun setSampleBuffer(sample_buffer: MTLCounterSampleBuffer?) {}

    open fun startOfEncoderSampleIndex(): NSUInteger = 0uL

    open fun setStartOfEncoderSampleIndex(start_of_encoder_sample_index: NSUInteger) {}

    open fun endOfEncoderSampleIndex(): NSUInteger = 0uL

    open fun setEndOfEncoderSampleIndex(end_of_encoder_sample_index: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLBlitPassSampleBufferAttachmentDescriptor = MTLBlitPassSampleBufferAttachmentDescriptor()

        fun new(): MTLBlitPassSampleBufferAttachmentDescriptor = MTLBlitPassSampleBufferAttachmentDescriptor()

        fun default_retained(): MTLBlitPassSampleBufferAttachmentDescriptor = new()
    }
}

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlblitpasssamplebufferattachmentdescriptorarray?language=objc)
 */
open class MTLBlitPassSampleBufferAttachmentDescriptorArray :
    NSObject(),
    NSObjectProtocol {
    open fun objectAtIndexedSubscript(attachment_index: NSUInteger): MTLBlitPassSampleBufferAttachmentDescriptor =
        MTLBlitPassSampleBufferAttachmentDescriptor()

    open fun setObject_atIndexedSubscript(
        attachment: MTLBlitPassSampleBufferAttachmentDescriptor?,
        attachment_index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLBlitPassSampleBufferAttachmentDescriptorArray = MTLBlitPassSampleBufferAttachmentDescriptorArray()

        fun new(): MTLBlitPassSampleBufferAttachmentDescriptorArray = MTLBlitPassSampleBufferAttachmentDescriptorArray()
    }
}

/**
 * MTLBlitPassDescriptor represents a collection of attachments to be used to create a concrete blit command encoder
 *
 * See also [Apple's documentation](https://developer.apple.com/documentation/metal/mtlblitpassdescriptor?language=objc)
 */
open class MTLBlitPassDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLBlitPassDescriptor

    open fun sampleBufferAttachments(): MTLBlitPassSampleBufferAttachmentDescriptorArray =
        MTLBlitPassSampleBufferAttachmentDescriptorArray()

    override fun copy(): Any = this

    companion object {
        fun blitPassDescriptor(): MTLBlitPassDescriptor = MTLBlitPassDescriptor()

        fun init(): MTLBlitPassDescriptor = MTLBlitPassDescriptor()

        fun new(): MTLBlitPassDescriptor = MTLBlitPassDescriptor()

        fun default_retained(): MTLBlitPassDescriptor = new()
    }
}
