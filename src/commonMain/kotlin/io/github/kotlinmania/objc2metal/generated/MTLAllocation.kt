// port-lint: source generated/MTLAllocation.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Protocol representing a memory allocation in Metal.
 */
interface MTLAllocation : NSObjectProtocol {
    fun allocatedSize(): NSUInteger
}
