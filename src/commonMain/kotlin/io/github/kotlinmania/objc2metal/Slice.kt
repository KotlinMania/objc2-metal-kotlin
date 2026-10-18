// port-lint: source slice.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2metal.generated.MTLRenderCommandEncoder
import io.github.kotlinmania.objc2metal.generated.MTLViewport

internal fun <T> sliceToPtrCount(slice: List<T>): Pair<List<T>, Int> =
    Pair(slice, slice.size)

interface MTLRenderCommandEncoderSliceExt : MTLRenderCommandEncoder {
    fun setViewports(viewports: Array<MTLViewport>) {
        setViewports(viewports.toList())
    }
}
