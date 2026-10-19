// port-lint: source generated/MTLComputePass.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlcomputepasssamplebufferattachmentdescriptor?language=objc)
 */
open class MTLComputePassSampleBufferAttachmentDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLComputePassSampleBufferAttachmentDescriptor

    open fun sampleBuffer(): MTLCounterSampleBuffer? = null

    open fun setSampleBuffer(sample_buffer: MTLCounterSampleBuffer?) {}

    open fun startOfEncoderSampleIndex(): NSUInteger = 0uL

    open fun setStartOfEncoderSampleIndex(start_of_encoder_sample_index: NSUInteger) {}

    open fun endOfEncoderSampleIndex(): NSUInteger = 0uL

    open fun setEndOfEncoderSampleIndex(end_of_encoder_sample_index: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLComputePassSampleBufferAttachmentDescriptor = MTLComputePassSampleBufferAttachmentDescriptor()

        fun new(): MTLComputePassSampleBufferAttachmentDescriptor = MTLComputePassSampleBufferAttachmentDescriptor()

        fun default_retained(): MTLComputePassSampleBufferAttachmentDescriptor = new()
    }
}

/**
 * [Apple's documentation](https://developer.apple.com/documentation/metal/mtlcomputepasssamplebufferattachmentdescriptorarray?language=objc)
 */
open class MTLComputePassSampleBufferAttachmentDescriptorArray :
    NSObject(),
    NSObjectProtocol {
    open fun objectAtIndexedSubscript(attachment_index: NSUInteger): MTLComputePassSampleBufferAttachmentDescriptor =
        MTLComputePassSampleBufferAttachmentDescriptor()

    open fun setObject_atIndexedSubscript(
        attachment: MTLComputePassSampleBufferAttachmentDescriptor?,
        attachment_index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLComputePassSampleBufferAttachmentDescriptorArray = MTLComputePassSampleBufferAttachmentDescriptorArray()

        fun new(): MTLComputePassSampleBufferAttachmentDescriptorArray = MTLComputePassSampleBufferAttachmentDescriptorArray()
    }
}

/**
 * MTLComputePassDescriptor represents a collection of attachments to be used to create a concrete compute command encoder
 *
 * See also [Apple's documentation](https://developer.apple.com/documentation/metal/mtlcomputepassdescriptor?language=objc)
 */
open class MTLComputePassDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLComputePassDescriptor

    open fun dispatchType(): MTLDispatchType = MTLDispatchType.Serial

    open fun setDispatchType(dispatch_type: MTLDispatchType) {}

    open fun sampleBufferAttachments(): MTLComputePassSampleBufferAttachmentDescriptorArray =
        MTLComputePassSampleBufferAttachmentDescriptorArray()

    override fun copy(): Any = this

    companion object {
        fun computePassDescriptor(): MTLComputePassDescriptor = MTLComputePassDescriptor()

        fun init(): MTLComputePassDescriptor = MTLComputePassDescriptor()

        fun new(): MTLComputePassDescriptor = MTLComputePassDescriptor()

        fun default_retained(): MTLComputePassDescriptor = new()
    }
}
