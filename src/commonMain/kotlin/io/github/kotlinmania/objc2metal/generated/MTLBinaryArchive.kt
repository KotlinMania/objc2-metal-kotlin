// port-lint: source generated/MTLBinaryArchive.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger
import io.github.kotlinmania.objc2foundation.generated.NSErrorDomain
import io.github.kotlinmania.objc2foundation.generated.NSURL

val MTLBinaryArchiveDomain: NSErrorDomain = NSString("MTLBinaryArchiveDomain")

/**
 * Error codes for MTLBinaryArchive.
 */
data class MTLBinaryArchiveError(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val None = MTLBinaryArchiveError(0uL)
        val InvalidFile = MTLBinaryArchiveError(1uL)
        val UnexpectedElement = MTLBinaryArchiveError(2uL)
        val CompilationFailure = MTLBinaryArchiveError(3uL)
        val InternalError = MTLBinaryArchiveError(4uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * A class used to indicate how an archive should be created.
 */
open class MTLBinaryArchiveDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {
    typealias Result = MTLBinaryArchiveDescriptor

    open fun url(): NSURL? = null

    open fun setUrl(url: NSURL?) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLBinaryArchiveDescriptor = MTLBinaryArchiveDescriptor()

        fun new(): MTLBinaryArchiveDescriptor = MTLBinaryArchiveDescriptor()

        fun default_retained(): MTLBinaryArchiveDescriptor = new()
    }
}

/**
 * A container of pipeline state descriptors and their associated compiled code.
 */
interface MTLBinaryArchive : NSObjectProtocol {
    fun label(): NSString?

    fun setLabel(label: NSString?)

    fun device(): MTLDevice
}
