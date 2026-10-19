// port-lint: source generated/MTLResourceStatePass.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlresourcestatepasssamplebufferattachmentdescriptor?language=objc)
 */
open class MTLResourceStatePassSampleBufferAttachmentDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLResourceStatePassSampleBufferAttachmentDescriptor

    open fun sampleBuffer(): MTLCounterSampleBuffer? = null

    open fun setSampleBuffer(sample_buffer: MTLCounterSampleBuffer?) {}

    open fun startOfEncoderSampleIndex(): NSUInteger = 0uL

    open fun setStartOfEncoderSampleIndex(start_of_encoder_sample_index: NSUInteger) {}

    open fun endOfEncoderSampleIndex(): NSUInteger = 0uL

    open fun setEndOfEncoderSampleIndex(end_of_encoder_sample_index: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLResourceStatePassSampleBufferAttachmentDescriptor = MTLResourceStatePassSampleBufferAttachmentDescriptor()

        fun new(): MTLResourceStatePassSampleBufferAttachmentDescriptor = MTLResourceStatePassSampleBufferAttachmentDescriptor()

        fun default_retained(): MTLResourceStatePassSampleBufferAttachmentDescriptor = new()
    }
}

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlresourcestatepasssamplebufferattachmentdescriptorarray?language=objc)
 */
open class MTLResourceStatePassSampleBufferAttachmentDescriptorArray :
    NSObject(),
    NSObjectProtocol {
    open fun objectAtIndexedSubscript(attachment_index: NSUInteger): MTLResourceStatePassSampleBufferAttachmentDescriptor =
        MTLResourceStatePassSampleBufferAttachmentDescriptor()

    open fun setObject_atIndexedSubscript(
        attachment: MTLResourceStatePassSampleBufferAttachmentDescriptor?,
        attachment_index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLResourceStatePassSampleBufferAttachmentDescriptorArray = MTLResourceStatePassSampleBufferAttachmentDescriptorArray()

        fun new(): MTLResourceStatePassSampleBufferAttachmentDescriptorArray = MTLResourceStatePassSampleBufferAttachmentDescriptorArray()
    }
}

/**
 * MTLResourceStatePassDescriptor represents a collection of attachments to be used to create a concrete resourceState command encoder
 *
 * See also [Apple's documentation](https://developer.apple.com/documentation/metal/mtlresourcestatepassdescriptor?language=objc)
 */
open class MTLResourceStatePassDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLResourceStatePassDescriptor

    open fun sampleBufferAttachments(): MTLResourceStatePassSampleBufferAttachmentDescriptorArray =
        MTLResourceStatePassSampleBufferAttachmentDescriptorArray()

    override fun copy(): Any = this

    companion object {
        fun resourceStatePassDescriptor(): MTLResourceStatePassDescriptor = MTLResourceStatePassDescriptor()

        fun init(): MTLResourceStatePassDescriptor = MTLResourceStatePassDescriptor()

        fun new(): MTLResourceStatePassDescriptor = MTLResourceStatePassDescriptor()

        fun default_retained(): MTLResourceStatePassDescriptor = new()
    }
}
