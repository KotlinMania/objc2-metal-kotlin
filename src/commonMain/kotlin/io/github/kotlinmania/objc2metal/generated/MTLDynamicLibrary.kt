// port-lint: source generated/MTLDynamicLibrary.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger
import io.github.kotlinmania.objc2foundation.generated.NSErrorDomain

val MTLDynamicLibraryDomain: NSErrorDomain = NSString("MTLDynamicLibraryDomain")

/**
 * Error codes for MTLDynamicLibrary.
 */
data class MTLDynamicLibraryError(
    val rawValue: NSUInteger = 0uL,
) {
    companion object {
        val None = MTLDynamicLibraryError(0uL)
        val InvalidFile = MTLDynamicLibraryError(1uL)
        val CompilationFailure = MTLDynamicLibraryError(2uL)
        val UnresolvedInstallName = MTLDynamicLibraryError(3uL)
        val DependencyLoadFailure = MTLDynamicLibraryError(4uL)
        val Unsupported = MTLDynamicLibraryError(5uL)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * A container for the binary representation of code compiled for a MTLDevice.
 */
interface MTLDynamicLibrary : NSObjectProtocol {
    fun label(): NSString?

    fun setLabel(label: NSString?)

    fun device(): MTLDevice

    fun installName(): NSString
}
