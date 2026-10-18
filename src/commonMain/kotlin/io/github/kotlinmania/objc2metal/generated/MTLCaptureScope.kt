// port-lint: source generated/MTLCaptureScope.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString

/**
 * Protocol representing a capture scope.
 */
interface MTLCaptureScope : NSObjectProtocol {
    fun beginScope()
    fun endScope()
    fun label(): NSString?
    fun setLabel(label: NSString?)
    fun device(): MTLDevice
    fun commandQueue(): MTLCommandQueue?
}
