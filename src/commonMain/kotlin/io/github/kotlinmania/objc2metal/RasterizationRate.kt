// port-lint: source rasterization_rate.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2foundation.NSUInteger
import io.github.kotlinmania.objc2metal.generated.MTLRasterizationRateLayerDescriptor
import io.github.kotlinmania.objc2metal.generated.MTLRasterizationRateMapDescriptor
import io.github.kotlinmania.objc2metal.generated.MTLSize

fun rasterizationRateMapDescriptorWithScreenSize(
    screenSize: MTLSize,
    layerCount: NSUInteger,
    layers: List<MTLRasterizationRateLayerDescriptor>,
): MTLRasterizationRateMapDescriptor {
    val desc = MTLRasterizationRateMapDescriptor()
    desc.screenSize = screenSize
    for (i in 0 until layerCount.toInt()) {
        if (i < layers.size) {
            desc.layers.setObjectAtIndexedSubscript(layers[i], i.toULong())
        }
    }
    return desc
}
