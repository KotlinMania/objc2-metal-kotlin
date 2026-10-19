// port-lint: source generated/MTLFunctionHandle.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString

/**
 * Handle to a function in a pipeline state.
 */
interface MTLFunctionHandle : NSObjectProtocol {
    fun functionType(): MTLFunctionType = MTLFunctionType.Vertex

    fun name(): NSString

    fun device(): MTLDevice
}
