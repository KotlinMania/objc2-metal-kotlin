// port-lint: source generated/MTLPipeline.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Mutability of a buffer.
 */
data class MTLMutability(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Default = MTLMutability(0uL)
        val Mutable = MTLMutability(1uL)
        val Immutable = MTLMutability(2uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Shader validation setting.
 */
data class MTLShaderValidation(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val Default = MTLShaderValidation(0L)
        val Enabled = MTLShaderValidation(1L)
        val Disabled = MTLShaderValidation(2L)

        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * Descriptor for a pipeline buffer.
 */
open class MTLPipelineBufferDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLPipelineBufferDescriptor

    open fun mutability(): MTLMutability = MTLMutability.Default
    open fun setMutability(mutability: MTLMutability) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLPipelineBufferDescriptor = MTLPipelineBufferDescriptor()
        fun new(): MTLPipelineBufferDescriptor = MTLPipelineBufferDescriptor()
    }
}

/**
 * Array of pipeline buffer descriptors.
 */
open class MTLPipelineBufferDescriptorArray :
    NSObject(),
    NSObjectProtocol {

    open fun objectAtIndexedSubscript(buffer_index: NSUInteger): MTLPipelineBufferDescriptor =
        MTLPipelineBufferDescriptor()

    open fun setObject_atIndexedSubscript(
        buffer: MTLPipelineBufferDescriptor?,
        buffer_index: NSUInteger,
    ) {}

    companion object {
        fun init(): MTLPipelineBufferDescriptorArray = MTLPipelineBufferDescriptorArray()
        fun new(): MTLPipelineBufferDescriptorArray = MTLPipelineBufferDescriptorArray()
    }
}
