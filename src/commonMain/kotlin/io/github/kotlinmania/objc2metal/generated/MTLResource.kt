// port-lint: source generated/MTLResource.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger
import io.github.kotlinmania.objc2metal.MTLResourceCPUCacheModeShift
import io.github.kotlinmania.objc2metal.MTLResourceHazardTrackingModeShift
import io.github.kotlinmania.objc2metal.MTLResourceStorageModeShift

/**
 * Options for setPurgeable call.
 */
data class MTLPurgeableState(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val KeepCurrent = MTLPurgeableState(1uL)
        val NonVolatile = MTLPurgeableState(2uL)
        val Volatile = MTLPurgeableState(3uL)
        val Empty = MTLPurgeableState(4uL)
    }
}

/**
 * Describes what CPU cache mode is used for the CPU's mapping of a resource.
 */
data class MTLCPUCacheMode(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val DefaultCache = MTLCPUCacheMode(0uL)
        val WriteCombined = MTLCPUCacheMode(1uL)
    }
}

/**
 * Describes location and CPU mapping of a resource.
 */
data class MTLStorageMode(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Shared = MTLStorageMode(0uL)
        val Managed = MTLStorageMode(1uL)
        val Private = MTLStorageMode(2uL)
        val Memoryless = MTLStorageMode(3uL)
    }
}

/**
 * Describes how hazard tracking is performed.
 */
data class MTLHazardTrackingMode(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Default = MTLHazardTrackingMode(0uL)
        val Untracked = MTLHazardTrackingMode(1uL)
        val Tracked = MTLHazardTrackingMode(2uL)
    }
}

/**
 * Resource options packed bitflags.
 */
data class MTLResourceOptions(
    val rawValue: NSUInteger,
) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val CPUCacheModeDefaultCache = MTLResourceOptions(MTLCPUCacheMode.DefaultCache.rawValue shl MTLResourceCPUCacheModeShift.toInt())
        val CPUCacheModeWriteCombined = MTLResourceOptions(MTLCPUCacheMode.WriteCombined.rawValue shl MTLResourceCPUCacheModeShift.toInt())
        val StorageModeShared = MTLResourceOptions(MTLStorageMode.Shared.rawValue shl MTLResourceStorageModeShift.toInt())
        val StorageModeManaged = MTLResourceOptions(MTLStorageMode.Managed.rawValue shl MTLResourceStorageModeShift.toInt())
        val StorageModePrivate = MTLResourceOptions(MTLStorageMode.Private.rawValue shl MTLResourceStorageModeShift.toInt())
        val StorageModeMemoryless = MTLResourceOptions(MTLStorageMode.Memoryless.rawValue shl MTLResourceStorageModeShift.toInt())
        val HazardTrackingModeDefault = MTLResourceOptions(MTLHazardTrackingMode.Default.rawValue shl MTLResourceHazardTrackingModeShift.toInt())
        val HazardTrackingModeUntracked = MTLResourceOptions(MTLHazardTrackingMode.Untracked.rawValue shl MTLResourceHazardTrackingModeShift.toInt())
        val HazardTrackingModeTracked = MTLResourceOptions(MTLHazardTrackingMode.Tracked.rawValue shl MTLResourceHazardTrackingModeShift.toInt())

        val OptionCPUCacheModeDefault = CPUCacheModeDefaultCache
        val OptionCPUCacheModeWriteCombined = CPUCacheModeWriteCombined
    }
}

/**
 * Common APIs available for MTLBuffer and MTLTexture instances.
 */
interface MTLResource : MTLAllocation {
    fun label(): NSString?

    fun setLabel(label: NSString?)

    fun device(): MTLDevice

    fun cpuCacheMode(): MTLCPUCacheMode

    fun storageMode(): MTLStorageMode

    fun hazardTrackingMode(): MTLHazardTrackingMode

    fun resourceOptions(): MTLResourceOptions

    fun setPurgeableState(state: MTLPurgeableState): MTLPurgeableState

    fun heap(): MTLHeap?

    fun heapOffset(): NSUInteger

    fun makeAliasable()

    fun isAliasable(): Boolean
}
