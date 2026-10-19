// port-lint: source texture.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2metal.generated.MTLTextureSwizzle
import io.github.kotlinmania.objc2metal.generated.MTLTextureSwizzleChannels

val MTLTextureSwizzleChannelsDefault: MTLTextureSwizzleChannels =
    MTLTextureSwizzleChannels(
        red = MTLTextureSwizzle.Red,
        green = MTLTextureSwizzle.Green,
        blue = MTLTextureSwizzle.Blue,
        alpha = MTLTextureSwizzle.Alpha,
    )
