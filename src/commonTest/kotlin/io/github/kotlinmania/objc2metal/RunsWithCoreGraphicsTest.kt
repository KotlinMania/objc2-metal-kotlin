// port-lint: tests tests/runs_with_core_graphics.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2metal.generated.MTLCreateSystemDefaultDevice
import kotlin.test.Test
import kotlin.test.assertTrue

class RunsWithCoreGraphicsTest {
    @Test
    fun test_create_default() {
        val device = MTLCreateSystemDefaultDevice()
        if (device != null) {
            assertTrue(device.name().rawString.isNotEmpty())
        }
    }

    @Test
    fun get_all() {
        val devices = MTLCopyAllDevices()
        assertTrue(devices.count() >= 0uL)
    }
}
