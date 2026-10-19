// port-lint: source generated/MTLRasterizationRate.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSObject
import io.github.kotlinmania.objc2foundation.NSObjectProtocol
import io.github.kotlinmania.objc2foundation.NSString
import io.github.kotlinmania.objc2foundation.NSUInteger

open class MTLRasterizationRateSampleArray : NSObject()

open class MTLRasterizationRateLayerDescriptor : NSObject() {
    typealias Result = MTLRasterizationRateLayerDescriptor

    var horizontalSampleStorage: FloatArray = FloatArray(0)
    var verticalSampleStorage: FloatArray = FloatArray(0)
    var maxSampleCount: MTLSize = MTLSize(0uL, 0uL, 0uL)

    open fun sampleCount(): MTLSize = MTLSize(0uL, 0uL, 0uL)
}

open class MTLRasterizationRateLayerArray : NSObject() {
    private val layers = mutableMapOf<NSUInteger, MTLRasterizationRateLayerDescriptor>()

    fun objectAtIndexedSubscript(layerIndex: NSUInteger): MTLRasterizationRateLayerDescriptor? = layers[layerIndex]

    fun setObjectAtIndexedSubscript(
        layer: MTLRasterizationRateLayerDescriptor?,
        layerIndex: NSUInteger,
    ) {
        if (layer != null) {
            layers[layerIndex] = layer
        } else {
            layers.remove(layerIndex)
        }
    }
}

open class MTLRasterizationRateMapDescriptor : NSObject() {
    typealias Result = MTLRasterizationRateMapDescriptor

    var label: NSString? = null
    var screenSize: MTLSize = MTLSize(0uL, 0uL, 0uL)
    val layers: MTLRasterizationRateLayerArray = MTLRasterizationRateLayerArray()

    open fun layerCount(): NSUInteger = 0uL

    companion object {
        fun rasterizationRateMapDescriptorWithScreenSize(
            screenSize: MTLSize,
        ): MTLRasterizationRateMapDescriptor {
            val desc = MTLRasterizationRateMapDescriptor()
            desc.screenSize = screenSize
            return desc
        }

        fun rasterizationRateMapDescriptorWithScreenSize(
            screenSize: MTLSize,
            layer: MTLRasterizationRateLayerDescriptor,
        ): MTLRasterizationRateMapDescriptor {
            val desc = MTLRasterizationRateMapDescriptor()
            desc.screenSize = screenSize
            desc.layers.setObjectAtIndexedSubscript(layer, 0uL)
            return desc
        }
    }
}

interface MTLRasterizationRateMap : NSObjectProtocol {
    fun device(): MTLDevice

    fun label(): NSString?

    fun screenSize(): MTLSize

    fun physicalGranularity(): MTLSize

    fun layerCount(): NSUInteger
}
