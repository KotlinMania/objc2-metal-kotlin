// port-lint: tests tests/null_error_handling.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2metal.generated.MTLCreateSystemDefaultDevice
import kotlin.test.Test
import kotlin.test.assertTrue

class NullErrorHandlingTest {
    @Test
    fun test() {
        val device = MTLCreateSystemDefaultDevice() ?: return
        assertTrue(device.name().rawString.isNotEmpty())
    }
}
