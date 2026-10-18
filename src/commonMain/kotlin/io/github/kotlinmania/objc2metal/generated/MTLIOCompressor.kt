// port-lint: source generated/MTLIOCompressor.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSInteger

/**
 * Status of an IO compression operation.
 */
data class MTLIOCompressionStatus(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val Complete = MTLIOCompressionStatus(0L)
        val Error = MTLIOCompressionStatus(1L)

        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}

/**
 * Compression context for Metal IO.
 */
typealias MTLIOCompressionContext = Any?

fun MTLIOCompressionContextDefaultChunkSize(): ULong = 65536uL

fun MTLIOCreateCompressionContext(
    path: String,
    type: MTLIOCompressionMethod,
    chunk_size: ULong,
): MTLIOCompressionContext = null

fun MTLIOCompressionContextAppendData(
    context: MTLIOCompressionContext,
    data: ByteArray,
    size: ULong,
) {}

fun MTLIOFlushAndDestroyCompressionContext(
    context: MTLIOCompressionContext,
): MTLIOCompressionStatus = MTLIOCompressionStatus.Complete
