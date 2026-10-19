// port-lint: source generated/MTLCaptureManager.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.generated.NSURL

/**
 * Capture error codes.
 */
data class MTLCaptureError(
    val rawValue: Long,
) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val NotSupported = MTLCaptureError(1L)
        val AlreadyCapturing = MTLCaptureError(2L)
        val InvalidDescriptor = MTLCaptureError(3L)
    }
}

/**
 * The destination where you want the GPU trace to be captured to.
 */
data class MTLCaptureDestination(
    val rawValue: Long,
) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val DeveloperTools = MTLCaptureDestination(1L)
        val GPUTraceDocument = MTLCaptureDestination(2L)
    }
}

/**
 * Descriptor for configuring GPU captures.
 */
open class MTLCaptureDescriptor : NSObject() {
    typealias Result = MTLCaptureDescriptor

    var destination: MTLCaptureDestination = MTLCaptureDestination.DeveloperTools
    var outputURL: NSURL? = null
    var captureObject: Any? = null

    companion object {
        fun defaultRetained(): MTLCaptureDescriptor = MTLCaptureDescriptor()
    }

    fun defaultRetained(): MTLCaptureDescriptor = MTLCaptureDescriptor()
}

/**
 * Central manager for GPU capture sessions.
 */
open class MTLCaptureManager : NSObject() {
    companion object {
        val shared = MTLCaptureManager()
    }
}
