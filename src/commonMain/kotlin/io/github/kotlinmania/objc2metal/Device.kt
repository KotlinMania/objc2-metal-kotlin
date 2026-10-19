// port-lint: source device.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2foundation.NSArray
import io.github.kotlinmania.objc2metal.generated.MTLCreateSystemDefaultDevice
import io.github.kotlinmania.objc2metal.generated.MTLDevice

/**
 * Returns all Metal devices in the system.
 *
 * On macOS and macCatalyst, this API will not cause the system to switch
 * devices and leaves the decision about which GPU to use up to the
 * application based on whatever criteria it deems appropriate.
 *
 * On iOS, tvOS and visionOS, this API returns an array containing the same
 * device that MTLCreateSystemDefaultDevice would have returned, or an empty
 * array if it would have failed.
 */
fun MTLCopyAllDevices(): NSArray<MTLDevice> {
    val device = MTLCreateSystemDefaultDevice()
    return if (device != null) {
        NSArray.fromSlice(listOf(device))
    } else {
        NSArray()
    }
}
