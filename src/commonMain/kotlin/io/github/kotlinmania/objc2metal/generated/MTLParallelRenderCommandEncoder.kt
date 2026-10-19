// port-lint: source generated/MTLParallelRenderCommandEncoder.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSUInteger

/**
 * The MTLParallelRenderCommandEncoder protocol is designed to allow a single render to texture operation to be efficiently (and safely) broken up across multiple threads.
 *
 * See also [Apple's documentation](https://developer.apple.com/documentation/metal/mtlparallelrendercommandencoder?language=objc)
 */
interface MTLParallelRenderCommandEncoder : MTLCommandEncoder {
    fun renderCommandEncoder(): MTLRenderCommandEncoder?

    fun setColorStoreAction_atIndex(
        store_action: MTLStoreAction,
        color_attachment_index: NSUInteger,
    )

    fun setDepthStoreAction(store_action: MTLStoreAction)

    fun setStencilStoreAction(store_action: MTLStoreAction)

    fun setColorStoreActionOptions_atIndex(
        store_action_options: MTLStoreActionOptions,
        color_attachment_index: NSUInteger,
    )

    fun setDepthStoreActionOptions(store_action_options: MTLStoreActionOptions)

    fun setStencilStoreActionOptions(store_action_options: MTLStoreActionOptions)
}
