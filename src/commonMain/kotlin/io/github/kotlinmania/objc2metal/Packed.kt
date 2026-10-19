// port-lint: source packed.rs
package io.github.kotlinmania.objc2metal

/**
 * Packed vector of three 32-bit floats.
 */
data class MTLPackedFloat3(
    val x: Float = 0.0f,
    val y: Float = 0.0f,
    val z: Float = 0.0f,
) {
    companion object {
        const val ENCODING: String = "{_MTLPackedFloat3=(?={?=fff}[3f])}"
        const val ENCODING_REF: String = "^{_MTLPackedFloat3=(?={?=fff}[3f])}"
    }
}
