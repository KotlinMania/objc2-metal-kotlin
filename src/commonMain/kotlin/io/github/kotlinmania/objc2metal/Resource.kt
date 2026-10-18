// port-lint: source resource.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2foundation.NSUInteger

const val MTLResourceCPUCacheModeShift: NSUInteger = 0uL
const val MTLResourceCPUCacheModeMask: NSUInteger = 0xFuL

const val MTLResourceStorageModeShift: NSUInteger = 4uL
const val MTLResourceStorageModeMask: NSUInteger = 0xF0uL

const val MTLResourceHazardTrackingModeShift: NSUInteger = 8uL
const val MTLResourceHazardTrackingModeMask: NSUInteger = 0x300uL
