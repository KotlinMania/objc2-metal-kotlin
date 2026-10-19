// port-lint: source types.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2metal.generated.MTLResourceID

/**
 * Get the underlying data of the ID.
 */
fun MTLResourceID.toRaw(): ULong = impl

/**
 * Construct a MTLResourceID from a raw ID.
 */
fun MTLResourceID.Companion.fromRaw(id: ULong): MTLResourceID = MTLResourceID(id)
