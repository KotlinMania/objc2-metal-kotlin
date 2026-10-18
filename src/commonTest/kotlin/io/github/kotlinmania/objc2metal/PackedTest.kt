// port-lint: tests packed.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2metal.generated.MTLPackedFloat4x3
import kotlin.test.Test
import kotlin.test.assertEquals

class PackedTest {
    @Test
    fun testPackedFloat() {
        assertEquals(
            "{_MTLPackedFloat4x3=[4{_MTLPackedFloat3=(?={?=fff}[3f])}]}",
            MTLPackedFloat4x3.ENCODING,
        )
    }
}
