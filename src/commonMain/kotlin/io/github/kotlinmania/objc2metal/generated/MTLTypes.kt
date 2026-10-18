// port-lint: source generated/MTLTypes.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Identify a pixel in an image.
 */
data class MTLOrigin(
    val x: NSUInteger = 0uL,
    val y: NSUInteger = 0uL,
    val z: NSUInteger = 0uL,
) {
    companion object {
        const val ENCODING: String = "{?=QQQ}"
        const val ENCODING_REF: String = "^{?=QQQ}"

        fun make(x: NSUInteger, y: NSUInteger, z: NSUInteger): MTLOrigin =
            MTLOrigin(x, y, z)
    }
}

/**
 * A set of dimensions to declare the size of an object.
 */
data class MTLSize(
    val width: NSUInteger = 0uL,
    val height: NSUInteger = 0uL,
    val depth: NSUInteger = 0uL,
) {
    companion object {
        const val ENCODING: String = "{?=QQQ}"
        const val ENCODING_REF: String = "^{?=QQQ}"

        fun make(width: NSUInteger, height: NSUInteger, depth: NSUInteger): MTLSize =
            MTLSize(width, height, depth)
    }
}

/**
 * Identify a region in an image or texture.
 */
data class MTLRegion(
    val origin: MTLOrigin = MTLOrigin(),
    val size: MTLSize = MTLSize(),
) {
    companion object {
        const val ENCODING: String = "{?={?=QQQ}{?=QQQ}}"
        const val ENCODING_REF: String = "^{?={?=QQQ}{?=QQQ}}"

        fun make1D(x: NSUInteger, width: NSUInteger): MTLRegion =
            MTLRegion(MTLOrigin(x, 0uL, 0uL), MTLSize(width, 1uL, 1uL))

        fun make2D(x: NSUInteger, y: NSUInteger, width: NSUInteger, height: NSUInteger): MTLRegion =
            MTLRegion(MTLOrigin(x, y, 0uL), MTLSize(width, height, 1uL))

        fun make3D(
            x: NSUInteger,
            y: NSUInteger,
            z: NSUInteger,
            width: NSUInteger,
            height: NSUInteger,
            depth: NSUInteger,
        ): MTLRegion =
            MTLRegion(MTLOrigin(x, y, z), MTLSize(width, height, depth))
    }
}

/**
 * Identify a sample within a pixel.
 */
data class MTLSamplePosition(
    val x: Float = 0.0f,
    val y: Float = 0.0f,
) {
    companion object {
        const val ENCODING: String = "{?=ff}"
        const val ENCODING_REF: String = "^{?=ff}"

        fun make(x: Float, y: Float): MTLSamplePosition =
            MTLSamplePosition(x, y)
    }
}

/**
 * A floating point coordinate in an abstract 2D space.
 */
typealias MTLCoordinate2D = MTLSamplePosition

/**
 * Handle of the GPU resource suitable for storing in an Argument Buffer.
 */
data class MTLResourceID(
    val impl: ULong = 0uL,
) {
    companion object {
        const val ENCODING: String = "{MTLResourceID=Q}"
        const val ENCODING_REF: String = "^{MTLResourceID=Q}"
    }
}
