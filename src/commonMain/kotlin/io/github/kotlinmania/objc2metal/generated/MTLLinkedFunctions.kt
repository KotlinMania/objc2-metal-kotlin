// port-lint: source generated/MTLLinkedFunctions.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSDictionary
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString

/**
 * A class to set functions to be linked.
 */
open class MTLLinkedFunctions :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLLinkedFunctions

    open fun functions(): NSArray<MTLFunction>? = null

    open fun setFunctions(functions: NSArray<MTLFunction>?) {}

    open fun binaryFunctions(): NSArray<MTLFunction>? = null

    open fun setBinaryFunctions(binary_functions: NSArray<MTLFunction>?) {}

    open fun groups(): NSDictionary<NSString, NSArray<MTLFunction>>? = null

    open fun setGroups(groups: NSDictionary<NSString, NSArray<MTLFunction>>?) {}

    open fun privateFunctions(): NSArray<MTLFunction>? = null

    open fun setPrivateFunctions(private_functions: NSArray<MTLFunction>?) {}

    override fun copy(): Any = this

    companion object {
        fun linkedFunctions(): MTLLinkedFunctions = MTLLinkedFunctions()

        fun init(): MTLLinkedFunctions = MTLLinkedFunctions()

        fun new(): MTLLinkedFunctions = MTLLinkedFunctions()

        fun default_retained(): MTLLinkedFunctions = new()
    }
}
