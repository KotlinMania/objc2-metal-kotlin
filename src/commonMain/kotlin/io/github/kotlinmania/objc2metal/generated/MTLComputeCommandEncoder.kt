// port-lint: source generated/MTLComputeCommandEncoder.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSUInteger

data class MTLDispatchThreadgroupsIndirectArguments(
    val threadgroupsPerGrid: UIntArray = UIntArray(3),
) {
    companion object {
        const val ENCODING: String = "{?=[3I]}"
        const val ENCODING_REF: String = "^{?=[3I]}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MTLDispatchThreadgroupsIndirectArguments) return false
        return threadgroupsPerGrid.contentEquals(other.threadgroupsPerGrid)
    }

    override fun hashCode(): Int = threadgroupsPerGrid.contentHashCode()
}

data class MTLStageInRegionIndirectArguments(
    val stageInOrigin: UIntArray = UIntArray(3),
    val stageInSize: UIntArray = UIntArray(3),
) {
    companion object {
        const val ENCODING: String = "{?=[3I][3I]}"
        const val ENCODING_REF: String = "^{?=[3I][3I]}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MTLStageInRegionIndirectArguments) return false
        return stageInOrigin.contentEquals(other.stageInOrigin) &&
            stageInSize.contentEquals(other.stageInSize)
    }

    override fun hashCode(): Int {
        var result = stageInOrigin.contentHashCode()
        result = 31 * result + stageInSize.contentHashCode()
        return result
    }
}

/**
 * A command encoder that writes data parallel compute commands.
 */
interface MTLComputeCommandEncoder : MTLCommandEncoder {
    fun dispatchType(): MTLDispatchType

    fun setComputePipelineState(state: MTLComputePipelineState)

    fun setBuffer(buffer: MTLBuffer?, offset: NSUInteger, index: NSUInteger)

    fun setBufferOffset(offset: NSUInteger, index: NSUInteger)

    fun setTexture(texture: MTLTexture?, index: NSUInteger)

    fun setSamplerState(sampler: Any?, index: NSUInteger)

    fun setThreadgroupMemoryLength(length: NSUInteger, atIndex: NSUInteger)

    fun dispatchThreadgroups(threadgroupsPerGrid: MTLSize, threadsPerThreadgroup: MTLSize)

    fun dispatchThreadgroupsWithIndirectBuffer(
        indirectBuffer: MTLBuffer,
        indirectBufferOffset: NSUInteger,
        threadsPerThreadgroup: MTLSize,
    )

    fun dispatchThreads(threadsPerGrid: MTLSize, threadsPerThreadgroup: MTLSize)

    fun updateFence(fence: Any)

    fun waitForFence(fence: Any)

    fun useResource(resource: MTLResource, usage: MTLResourceUsage)

    fun useHeap(heap: MTLHeap)

    fun memoryBarrier(scope: Any)
}
