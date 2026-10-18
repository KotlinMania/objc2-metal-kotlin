// port-lint: source generated/MTLFunctionStitching.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.bitflags.BitFlags
import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2foundation.NSCopying
import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * Options for creating a stitched library.
 */
data class MTLStitchedLibraryOptions(
    override val rawValue: NSUInteger = 0uL,
) : BitFlags<MTLStitchedLibraryOptions, NSUInteger> {

    override fun create(value: NSUInteger): MTLStitchedLibraryOptions = MTLStitchedLibraryOptions(value)

    companion object {
        val None = MTLStitchedLibraryOptions(0uL)
        val FailOnBinaryArchiveMiss = MTLStitchedLibraryOptions(1uL shl 0)
        val StoreLibraryInMetalPipelinesScript = MTLStitchedLibraryOptions(1uL shl 1)

        const val ENCODING: String = "Q"
        const val ENCODING_REF: String = "^Q"
    }
}

/**
 * An attribute to be applied to the produced stitched function.
 */
interface MTLFunctionStitchingAttribute : NSObjectProtocol

/**
 * Applies always_inline attribute to the stitched function.
 */
open class MTLFunctionStitchingAttributeAlwaysInline :
    NSObject(),
    MTLFunctionStitchingAttribute {

    companion object {
        fun init(): MTLFunctionStitchingAttributeAlwaysInline = MTLFunctionStitchingAttributeAlwaysInline()
        fun new(): MTLFunctionStitchingAttributeAlwaysInline = MTLFunctionStitchingAttributeAlwaysInline()
    }
}

/**
 * A node used in a graph for stitching.
 */
interface MTLFunctionStitchingNode : NSObjectProtocol, NSCopying

/**
 * An indexed input node of the produced stitched function.
 */
open class MTLFunctionStitchingInputNode :
    NSObject(),
    MTLFunctionStitchingNode {

    typealias Result = MTLFunctionStitchingInputNode

    open fun argumentIndex(): NSUInteger = 0uL
    open fun setArgumentIndex(argument_index: NSUInteger) {}

    override fun copy(): Any = this

    companion object {
        fun initWithArgumentIndex(argument: NSUInteger): MTLFunctionStitchingInputNode = MTLFunctionStitchingInputNode()
        fun init(): MTLFunctionStitchingInputNode = MTLFunctionStitchingInputNode()
        fun new(): MTLFunctionStitchingInputNode = MTLFunctionStitchingInputNode()
    }
}

/**
 * A function node that calls the specified function.
 */
open class MTLFunctionStitchingFunctionNode :
    NSObject(),
    MTLFunctionStitchingNode {

    typealias Result = MTLFunctionStitchingFunctionNode

    open fun name(): NSString = NSString("")
    open fun setName(name: NSString) {}

    open fun arguments(): NSArray<MTLFunctionStitchingNode> = NSArray()
    open fun setArguments(arguments: NSArray<MTLFunctionStitchingNode>) {}

    open fun controlDependencies(): NSArray<MTLFunctionStitchingFunctionNode> = NSArray()
    open fun setControlDependencies(control_dependencies: NSArray<MTLFunctionStitchingFunctionNode>) {}

    override fun copy(): Any = this

    companion object {
        fun initWithName_arguments_controlDependencies(
            name: NSString,
            arguments: NSArray<MTLFunctionStitchingNode>,
            control_dependencies: NSArray<MTLFunctionStitchingFunctionNode>,
        ): MTLFunctionStitchingFunctionNode = MTLFunctionStitchingFunctionNode()

        fun init(): MTLFunctionStitchingFunctionNode = MTLFunctionStitchingFunctionNode()
        fun new(): MTLFunctionStitchingFunctionNode = MTLFunctionStitchingFunctionNode()
    }
}

/**
 * A function graph that describes a directed acyclic graph.
 */
open class MTLFunctionStitchingGraph :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLFunctionStitchingGraph

    open fun functionName(): NSString = NSString("")
    open fun setFunctionName(function_name: NSString) {}

    open fun nodes(): NSArray<MTLFunctionStitchingFunctionNode> = NSArray()
    open fun setNodes(nodes: NSArray<MTLFunctionStitchingFunctionNode>) {}

    open fun outputNode(): MTLFunctionStitchingFunctionNode? = null
    open fun setOutputNode(output_node: MTLFunctionStitchingFunctionNode?) {}

    open fun attributes(): NSArray<MTLFunctionStitchingAttribute> = NSArray()
    open fun setAttributes(attributes: NSArray<MTLFunctionStitchingAttribute>) {}

    override fun copy(): Any = this

    companion object {
        fun initWithFunctionName_nodes_outputNode_attributes(
            function_name: NSString,
            nodes: NSArray<MTLFunctionStitchingFunctionNode>,
            output_node: MTLFunctionStitchingFunctionNode?,
            attributes: NSArray<MTLFunctionStitchingAttribute>,
        ): MTLFunctionStitchingGraph = MTLFunctionStitchingGraph()

        fun init(): MTLFunctionStitchingGraph = MTLFunctionStitchingGraph()
        fun new(): MTLFunctionStitchingGraph = MTLFunctionStitchingGraph()
    }
}

/**
 * Descriptor for creating a stitched library.
 */
open class MTLStitchedLibraryDescriptor :
    NSObject(),
    NSCopying,
    NSObjectProtocol {

    typealias Result = MTLStitchedLibraryDescriptor

    open fun functionGraphs(): NSArray<MTLFunctionStitchingGraph> = NSArray()
    open fun setFunctionGraphs(function_graphs: NSArray<MTLFunctionStitchingGraph>) {}

    open fun functions(): NSArray<MTLFunction> = NSArray()
    open fun setFunctions(functions: NSArray<MTLFunction>) {}

    open fun binaryArchives(): NSArray<MTLBinaryArchive> = NSArray()
    open fun setBinaryArchives(binary_archives: NSArray<MTLBinaryArchive>) {}

    open fun options(): MTLStitchedLibraryOptions = MTLStitchedLibraryOptions.None
    open fun setOptions(options: MTLStitchedLibraryOptions) {}

    override fun copy(): Any = this

    companion object {
        fun init(): MTLStitchedLibraryDescriptor = MTLStitchedLibraryDescriptor()
        fun new(): MTLStitchedLibraryDescriptor = MTLStitchedLibraryDescriptor()
    }
}
