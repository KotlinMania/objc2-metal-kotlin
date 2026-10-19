// port-lint: source generated/MTLCounters.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSData
import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSRange
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger
import io.github.kotlinmania.objc2foundation.generated.NSErrorDomain

typealias MTLCommonCounter = NSString

val MTLCommonCounterTimestamp: MTLCommonCounter = NSString("MTLCommonCounterTimestamp")
val MTLCommonCounterTessellationInputPatches: MTLCommonCounter = NSString("MTLCommonCounterTessellationInputPatches")
val MTLCommonCounterVertexInvocations: MTLCommonCounter = NSString("MTLCommonCounterVertexInvocations")
val MTLCommonCounterPostTessellationVertexInvocations: MTLCommonCounter = NSString("MTLCommonCounterPostTessellationVertexInvocations")
val MTLCommonCounterClipperInvocations: MTLCommonCounter = NSString("MTLCommonCounterClipperInvocations")
val MTLCommonCounterClipperPrimitivesOut: MTLCommonCounter = NSString("MTLCommonCounterClipperPrimitivesOut")
val MTLCommonCounterFragmentInvocations: MTLCommonCounter = NSString("MTLCommonCounterFragmentInvocations")
val MTLCommonCounterFragmentsPassed: MTLCommonCounter = NSString("MTLCommonCounterFragmentsPassed")
val MTLCommonCounterComputeKernelInvocations: MTLCommonCounter = NSString("MTLCommonCounterComputeKernelInvocations")
val MTLCommonCounterTotalCycles: MTLCommonCounter = NSString("MTLCommonCounterTotalCycles")
val MTLCommonCounterVertexCycles: MTLCommonCounter = NSString("MTLCommonCounterVertexCycles")
val MTLCommonCounterTessellationCycles: MTLCommonCounter = NSString("MTLCommonCounterTessellationCycles")
val MTLCommonCounterPostTessellationVertexCycles: MTLCommonCounter = NSString("MTLCommonCounterPostTessellationVertexCycles")
val MTLCommonCounterFragmentCycles: MTLCommonCounter = NSString("MTLCommonCounterFragmentCycles")
val MTLCommonCounterRenderTargetWriteCycles: MTLCommonCounter = NSString("MTLCommonCounterRenderTargetWriteCycles")

typealias MTLCommonCounterSet = NSString

val MTLCommonCounterSetTimestamp: MTLCommonCounterSet = NSString("MTLCommonCounterSetTimestamp")
val MTLCommonCounterSetStageUtilization: MTLCommonCounterSet = NSString("MTLCommonCounterSetStageUtilization")
val MTLCommonCounterSetStatistic: MTLCommonCounterSet = NSString("MTLCommonCounterSetStatistic")

data class MTLCounterResultTimestamp(
    val timestamp: ULong = 0uL,
) {
    companion object {
        const val ENCODING: String = "{?=Q}"
        const val ENCODING_REF: String = "^{?=Q}"
    }
}

data class MTLCounterResultStageUtilization(
    val totalCycles: ULong = 0uL,
    val vertexCycles: ULong = 0uL,
    val tessellationCycles: ULong = 0uL,
    val postTessellationVertexCycles: ULong = 0uL,
    val fragmentCycles: ULong = 0uL,
    val renderTargetCycles: ULong = 0uL,
) {
    companion object {
        const val ENCODING: String = "{?=QQQQQQ}"
        const val ENCODING_REF: String = "^{?=QQQQQQ}"
    }
}

data class MTLCounterResultStatistic(
    val tessellationInputPatches: ULong = 0uL,
    val vertexInvocations: ULong = 0uL,
    val postTessellationVertexInvocations: ULong = 0uL,
    val clipperInvocations: ULong = 0uL,
    val clipperPrimitivesOut: ULong = 0uL,
    val fragmentInvocations: ULong = 0uL,
    val fragmentsPassed: ULong = 0uL,
    val computeKernelInvocations: ULong = 0uL,
) {
    companion object {
        const val ENCODING: String = "{?=QQQQQQQQ}"
        const val ENCODING_REF: String = "^{?=QQQQQQQQ}"
    }
}

interface MTLCounter : NSObjectProtocol {
    fun name(): NSString
}

interface MTLCounterSet : NSObjectProtocol {
    fun name(): NSString

    fun counters(): NSArray<MTLCounter>
}

open class MTLCounterSampleBufferDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLCounterSampleBufferDescriptor

    open fun counterSet(): MTLCounterSet? = null

    open fun setCounterSet(counter_set: MTLCounterSet?) {}

    open fun label(): NSString = NSString("")

    open fun setLabel(label: NSString) {}

    open fun storageMode(): MTLStorageMode = MTLStorageMode.Shared

    open fun setStorageMode(storage_mode: MTLStorageMode) {}

    open fun sampleCount(): NSUInteger = 0uL

    open fun setSampleCount(sample_count: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLCounterSampleBufferDescriptor = MTLCounterSampleBufferDescriptor()

        fun new(): MTLCounterSampleBufferDescriptor = MTLCounterSampleBufferDescriptor()
    }
}

interface MTLCounterSampleBuffer : NSObjectProtocol {
    fun device(): MTLDevice

    fun label(): NSString

    fun sampleCount(): NSUInteger

    fun resolveCounterRange(range: NSRange): NSData?
}

val MTLCounterErrorDomain: NSErrorDomain = NSString("MTLCounterErrorDomain")

data class MTLCounterSampleBufferError(
    val rawValue: NSInteger = 0L,
) {
    companion object {
        val OutOfMemory = MTLCounterSampleBufferError(0L)
        val Invalid = MTLCounterSampleBufferError(1L)
        val Internal = MTLCounterSampleBufferError(2L)

        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"
    }
}
