// port-lint: source generated/MTLFence.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString

interface MTLFence : NSObjectProtocol {
    fun device(): MTLDevice

    fun label(): NSString?

    fun setLabel(label: NSString?)
}
