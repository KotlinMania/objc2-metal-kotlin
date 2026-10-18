// port-lint: source generated/MTLAccelerationStructureTypes.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2metal.MTLPackedFloat3

/**
 * A packed quaternion representing a rotation in 3D space.
 */
data class MTLPackedFloatQuaternion(
    val x: Float = 0.0f,
    val y: Float = 0.0f,
    val z: Float = 0.0f,
    val w: Float = 0.0f,
) {
    companion object {
        const val ENCODING: String = "{MTLPackedFloatQuaternion=ffff}"
        const val ENCODING_REF: String = "^{MTLPackedFloatQuaternion=ffff}"

        fun make(x: Float, y: Float, z: Float, w: Float): MTLPackedFloatQuaternion =
            MTLPackedFloatQuaternion(x, y, z, w)
    }
}

/**
 * A 4x3 matrix of packed 3D float vectors.
 */
data class MTLPackedFloat4x3(
    val columns: List<MTLPackedFloat3> = listOf(
        MTLPackedFloat3(),
        MTLPackedFloat3(),
        MTLPackedFloat3(),
        MTLPackedFloat3(),
    ),
) {
    companion object {
        const val ENCODING: String = "{_MTLPackedFloat4x3=[4{_MTLPackedFloat3=(?={?=fff}[3f])}]}"
        const val ENCODING_REF: String = "^{_MTLPackedFloat4x3=[4{_MTLPackedFloat3=(?={?=fff}[3f])}]}"
    }
}

/**
 * An axis aligned bounding box with a min and max point.
 */
data class MTLAxisAlignedBoundingBox(
    val min: MTLPackedFloat3 = MTLPackedFloat3(),
    val max: MTLPackedFloat3 = MTLPackedFloat3(),
) {
    companion object {
        const val ENCODING: String = "{_MTLAxisAlignedBoundingBox={_MTLPackedFloat3=(?={?=fff}[3f])}{_MTLPackedFloat3=(?={?=fff}[3f])}}"
        const val ENCODING_REF: String = "^{_MTLAxisAlignedBoundingBox={_MTLPackedFloat3=(?={?=fff}[3f])}{_MTLPackedFloat3=(?={?=fff}[3f])}}"
    }
}

/**
 * A transformation represented by individual components.
 */
data class MTLComponentTransform(
    val scale: MTLPackedFloat3 = MTLPackedFloat3(),
    val shear: MTLPackedFloat3 = MTLPackedFloat3(),
    val pivot: MTLPackedFloat3 = MTLPackedFloat3(),
    val rotation: MTLPackedFloatQuaternion = MTLPackedFloatQuaternion(),
    val translation: MTLPackedFloat3 = MTLPackedFloat3(),
) {
    companion object {
        const val ENCODING: String = "{?={_MTLPackedFloat3=(?={?=fff}[3f])}{_MTLPackedFloat3=(?={?=fff}[3f])}{_MTLPackedFloat3=(?={?=fff}[3f])}{MTLPackedFloatQuaternion=ffff}{_MTLPackedFloat3=(?={?=fff}[3f])}}"
        const val ENCODING_REF: String = "^{?={_MTLPackedFloat3=(?={?=fff}[3f])}{_MTLPackedFloat3=(?={?=fff}[3f])}{_MTLPackedFloat3=(?={?=fff}[3f])}{MTLPackedFloatQuaternion=ffff}{_MTLPackedFloat3=(?={?=fff}[3f])}}"
    }
}
