// port-lint: source generated/MTLLibrary.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2foundation.NSDictionary
import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

typealias MTLAutoreleasedArgument = Any

data class MTLPatchType(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val None = MTLPatchType(0uL)
        val Triangle = MTLPatchType(1uL)
        val Quad = MTLPatchType(2uL)
    }
}

data class MTLFunctionType(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Vertex = MTLFunctionType(1uL)
        val Fragment = MTLFunctionType(2uL)
        val Kernel = MTLFunctionType(3uL)
        val Visible = MTLFunctionType(5uL)
        val Intersection = MTLFunctionType(6uL)
        val Mesh = MTLFunctionType(7uL)
        val Object = MTLFunctionType(8uL)
    }
}

data class MTLLanguageVersion(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Version1_0 = MTLLanguageVersion(1uL shl 16)
        val Version1_1 = MTLLanguageVersion((1uL shl 16) + 1uL)
        val Version1_2 = MTLLanguageVersion((1uL shl 16) + 2uL)
        val Version2_0 = MTLLanguageVersion(2uL shl 16)
        val Version2_1 = MTLLanguageVersion((2uL shl 16) + 1uL)
        val Version2_2 = MTLLanguageVersion((2uL shl 16) + 2uL)
        val Version2_3 = MTLLanguageVersion((2uL shl 16) + 3uL)
        val Version2_4 = MTLLanguageVersion((2uL shl 16) + 4uL)
        val Version3_0 = MTLLanguageVersion(3uL shl 16)
        val Version3_1 = MTLLanguageVersion((3uL shl 16) + 1uL)
        val Version3_2 = MTLLanguageVersion((3uL shl 16) + 2uL)
    }
}

data class MTLLibraryType(val rawValue: NSInteger) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val Executable = MTLLibraryType(0L)
        val Dynamic = MTLLibraryType(1L)
    }
}

data class MTLLibraryOptimizationLevel(val rawValue: NSInteger) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val Default = MTLLibraryOptimizationLevel(0L)
        val Size = MTLLibraryOptimizationLevel(1L)
    }
}

data class MTLCompileSymbolVisibility(val rawValue: NSInteger) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val Default = MTLCompileSymbolVisibility(0L)
        val Hidden = MTLCompileSymbolVisibility(1L)
    }
}

data class MTLMathMode(val rawValue: NSInteger) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val Safe = MTLMathMode(0L)
        val Relaxed = MTLMathMode(1L)
        val Fast = MTLMathMode(2L)
    }
}

data class MTLMathFloatingPointFunctions(val rawValue: NSInteger) {
    companion object {
        const val ENCODING: String = "q"
        const val ENCODING_REF: String = "^q"

        val Fast = MTLMathFloatingPointFunctions(0L)
        val Precise = MTLMathFloatingPointFunctions(1L)
    }
}

data class MTLLibraryError(val rawValue: NSUInteger) {
    companion object {
        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"

        val Unsupported = MTLLibraryError(1uL)
        val Internal = MTLLibraryError(2uL)
        val CompileFailure = MTLLibraryError(3uL)
        val CompileWarning = MTLLibraryError(4uL)
        val FunctionNotFound = MTLLibraryError(5uL)
        val FileNotFound = MTLLibraryError(6uL)
    }
}

open class MTLVertexAttribute : NSObject() {
    open fun name(): NSString = NSString("")
    open fun attributeIndex(): NSUInteger = 0uL
    open fun attributeType(): MTLDataType = MTLDataType.None
    open fun isActive(): Boolean = true
    open fun isPatchData(): Boolean = false
    open fun isPatchControlPointData(): Boolean = false
}

open class MTLFunctionConstant : NSObject() {
    open fun name(): NSString = NSString("")
    open fun type(): MTLDataType = MTLDataType.None
    open fun index(): NSUInteger = 0uL
    open fun required(): Boolean = true
}

open class MTLCompileOptions : NSObject() {
    typealias Result = MTLCompileOptions

    var preprocessorMacros: NSDictionary<NSString, NSObject>? = null
    var fastMathEnabled: Boolean = false
    var languageVersion: MTLLanguageVersion = MTLLanguageVersion.Version3_0
    var libraryType: MTLLibraryType = MTLLibraryType.Executable
    var installName: NSString? = null
    var libraries: NSArray<Any>? = null
    var preserveInvariance: Boolean = false
    var optimizationLevel: MTLLibraryOptimizationLevel = MTLLibraryOptimizationLevel.Default
    var compileSymbolVisibility: MTLCompileSymbolVisibility = MTLCompileSymbolVisibility.Default
    var allowReferencingUndefinedSymbols: Boolean = false
    var maxTotalThreadsPerThreadgroup: NSUInteger = 0uL
    var mathMode: MTLMathMode = MTLMathMode.Safe
    var mathFloatingPointFunctions: MTLMathFloatingPointFunctions = MTLMathFloatingPointFunctions.Fast

    companion object {
        fun defaultRetained(): MTLCompileOptions = MTLCompileOptions()
    }
}

interface MTLFunction : NSObjectProtocol {
    fun label(): NSString?
    fun setLabel(label: NSString?)
    fun device(): MTLDevice
    fun functionType(): MTLFunctionType
    fun patchType(): MTLPatchType
    fun patchControlPointCount(): NSInteger
    fun vertexAttributes(): NSArray<MTLVertexAttribute>?
    fun stageInputAttributes(): NSArray<MTLVertexAttribute>?
    fun name(): NSString
    fun functionConstantsDictionary(): NSDictionary<NSString, MTLFunctionConstant>
}

interface MTLLibrary : NSObjectProtocol {
    fun label(): NSString?
    fun setLabel(label: NSString?)
    fun device(): MTLDevice
    fun newFunctionWithName(functionName: NSString): MTLFunction?
    fun newFunctionWithName(name: NSString, constantValues: MTLFunctionConstantValues): MTLFunction?
    fun functionNames(): NSArray<NSString>
    fun type(): MTLLibraryType
    fun installName(): NSString?
}
