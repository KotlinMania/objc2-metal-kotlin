// port-lint: source generated/MTLComputePipeline.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

open class MTLComputePipelineReflection : NSObject()

open class MTLComputePipelineDescriptor : NSObject() {
    typealias Result = MTLComputePipelineDescriptor

    var label: NSString? = null
    var computeFunction: Any? = null
    var threadGroupSizeIsMultipleOfThreadExecutionWidth: Boolean = false
    var maxTotalThreadsPerThreadgroup: NSUInteger = 0uL
    var stageInputDescriptor: Any? = null
    var buffers: Any? = null
    var supportIndirectCommandBuffers: Boolean = false

    companion object {
        fun defaultRetained(): MTLComputePipelineDescriptor = MTLComputePipelineDescriptor()
    }
}

interface MTLComputePipelineState : NSObjectProtocol {
    fun label(): NSString?
    fun device(): MTLDevice
    fun maxTotalThreadsPerThreadgroup(): NSUInteger
    fun threadExecutionWidth(): NSUInteger
    fun staticThreadgroupMemoryLength(): NSUInteger
    fun supportIndirectCommandBuffers(): Boolean
}
