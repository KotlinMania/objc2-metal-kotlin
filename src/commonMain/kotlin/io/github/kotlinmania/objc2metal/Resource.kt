// port-lint: source resource.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2foundation.NSUInteger

const val MTLResourceCPUCacheModeShift: NSUInteger = 0uL
const val MTLResourceCPUCacheModeMask: NSUInteger = 0xFuL shl MTLResourceCPUCacheModeShift.toInt()

const val MTLResourceStorageModeShift: NSUInteger = 4uL
const val MTLResourceStorageModeMask: NSUInteger = 0xFuL shl MTLResourceStorageModeShift.toInt()

const val MTLResourceHazardTrackingModeShift: NSUInteger = 8uL
const val MTLResourceHazardTrackingModeMask: NSUInteger = 0x3uL shl MTLResourceHazardTrackingModeShift.toInt()
