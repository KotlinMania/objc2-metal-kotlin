// port-lint: source generated/MTLAccelerationStructureCommandEncoder.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Controls the acceleration structure refit operation.
 */
data class MTLAccelerationStructureRefitOptions(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val VertexData = MTLAccelerationStructureRefitOptions(1uL shl 0)
        val PerPrimitiveData = MTLAccelerationStructureRefitOptions(1uL shl 1)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Attachment descriptor for sample buffer in acceleration structure pass.
 */
open class MTLAccelerationStructurePassSampleBufferAttachmentDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLAccelerationStructurePassSampleBufferAttachmentDescriptor

    open fun startOfEncoderSampleIndex(): NSUInteger = 0uL

    open fun setStartOfEncoderSampleIndex(start_of_encoder_sample_index: NSUInteger) {}

    open fun endOfEncoderSampleIndex(): NSUInteger = 0uL

    open fun setEndOfEncoderSampleIndex(end_of_encoder_sample_index: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLAccelerationStructurePassSampleBufferAttachmentDescriptor =
            MTLAccelerationStructurePassSampleBufferAttachmentDescriptor()

        fun new(): MTLAccelerationStructurePassSampleBufferAttachmentDescriptor =
            MTLAccelerationStructurePassSampleBufferAttachmentDescriptor()
    }
}

/**
 * Array of sample buffer attachment descriptors for acceleration structure pass.
 */
open class MTLAccelerationStructurePassSampleBufferAttachmentDescriptorArray :
    NSObject(),
    NSObjectProtocol {
    open fun objectAtIndexedSubscript(attachment_index: NSUInteger): MTLAccelerationStructurePassSampleBufferAttachmentDescriptor =
        MTLAccelerationStructurePassSampleBufferAttachmentDescriptor()

    open fun setObject_atIndexedSubscript(
        attachment: MTLAccelerationStructurePassSampleBufferAttachmentDescriptor?,
        attachment_index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLAccelerationStructurePassSampleBufferAttachmentDescriptorArray =
            MTLAccelerationStructurePassSampleBufferAttachmentDescriptorArray()

        fun new(): MTLAccelerationStructurePassSampleBufferAttachmentDescriptorArray =
            MTLAccelerationStructurePassSampleBufferAttachmentDescriptorArray()
    }
}

/**
 * Descriptor for an acceleration structure pass.
 */
open class MTLAccelerationStructurePassDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLAccelerationStructurePassDescriptor

    open fun sampleBufferAttachments(): MTLAccelerationStructurePassSampleBufferAttachmentDescriptorArray =
        MTLAccelerationStructurePassSampleBufferAttachmentDescriptorArray()

    override fun copy(): Any = this

    companion object {
        fun accelerationStructurePassDescriptor(): MTLAccelerationStructurePassDescriptor =
            MTLAccelerationStructurePassDescriptor()

        fun init(): MTLAccelerationStructurePassDescriptor = MTLAccelerationStructurePassDescriptor()

        fun new(): MTLAccelerationStructurePassDescriptor = MTLAccelerationStructurePassDescriptor()
    }
}

/**
 * Command encoder for acceleration structure builds and refits.
 */
interface MTLAccelerationStructureCommandEncoder : MTLCommandEncoder
