// port-lint: source generated/MTLResidencySet.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

open class MTLResidencySetDescriptor : NSObject() {
    typealias Result = MTLResidencySetDescriptor

    var label: NSString? = null
    var initialCapacity: NSUInteger = 0uL
}

interface MTLResidencySet : NSObjectProtocol {
    fun device(): MTLDevice

    fun label(): NSString?

    fun allocatedSize(): ULong

    fun requestResidency()

    fun endResidency()

    fun addAllocation(allocation: MTLAllocation)

    fun removeAllocation(allocation: MTLAllocation)

    fun removeAllAllocations()

    fun containsAllocation(anAllocation: MTLAllocation): Boolean

    fun allAllocations(): NSArray<MTLAllocation>

    fun allocationCount(): NSUInteger

    fun commit()
}
