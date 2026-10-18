// port-lint: source generated/MTLDrawable.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * The presented callback function protocol.
 */
typealias MTLDrawablePresentedHandler = (MTLDrawable) -> Unit

/**
 * All "drawable" objects (such as those coming from CAMetalLayer) are expected to conform to this protocol.
 */
interface MTLDrawable : NSObjectProtocol {
    fun present()

    fun presentAtTime(presentation_time: Double)

    fun presentAfterMinimumDuration(duration: Double)

    fun addPresentedHandler(block: MTLDrawablePresentedHandler)

    fun presentedTime(): Double

    fun drawableID(): NSUInteger
}
