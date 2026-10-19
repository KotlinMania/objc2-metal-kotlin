// port-lint: source generated/MTLFunctionConstantValues.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSRange
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

open class MTLFunctionConstantValues : NSObject() {
    typealias Result = MTLFunctionConstantValues

    open fun setConstantValue(value: Any, type: MTLDataType, atIndex: NSUInteger) {}

    open fun setConstantValues(values: Any, type: MTLDataType, withRange: NSRange) {}

    open fun setConstantValue(value: Any, type: MTLDataType, withName: NSString) {}

    open fun reset() {}

    companion object {
        fun defaultRetained(): MTLFunctionConstantValues = MTLFunctionConstantValues()
    }
}
