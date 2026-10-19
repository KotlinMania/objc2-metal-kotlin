// port-lint: source generated/MTLResourceStateCommandEncoder.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Type of mapping operation for sparse texture.
 */
data class MTLSparseTextureMappingMode(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val Map = MTLSparseTextureMappingMode(0uL)
        val Unmap = MTLSparseTextureMappingMode(1uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * Structure describing indirect mapping region.
 */
data class MTLMapIndirectArguments(
    val regionOriginX: UInt = 0u,
    val regionOriginY: UInt = 0u,
    val regionOriginZ: UInt = 0u,
    val regionSizeWidth: UInt = 0u,
    val regionSizeHeight: UInt = 0u,
    val regionSizeDepth: UInt = 0u,
    val mipMapLevel: UInt = 0u,
    val sliceId: UInt = 0u,
) {
    companion object {
        const val ENCODING: String = "{?=IIIIIIII}"
        const val ENCODING_REF: String = "^{?=IIIIIIII}"
    }
}

/**
 * Command encoder for resource state operations.
 */
interface MTLResourceStateCommandEncoder : MTLCommandEncoder {
    fun updateTextureMappings_mode_regions_mipLevels_slices_numRegions(
        texture: MTLTexture,
        mode: MTLSparseTextureMappingMode,
        regions: List<MTLRegion>,
        mip_levels: List<NSUInteger>,
        slices: List<NSUInteger>,
        num_regions: NSUInteger,
    )
}
