// port-lint: source capture.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2metal.generated.MTLCaptureDescriptor
import io.github.kotlinmania.objc2metal.generated.MTLCaptureScope
import io.github.kotlinmania.objc2metal.generated.MTLCommandQueue
import io.github.kotlinmania.objc2metal.generated.MTLDevice

fun MTLCaptureDescriptor.setCaptureDevice(device: MTLDevice) {
    captureObject = device
}

fun MTLCaptureDescriptor.setCaptureScope(scope: MTLCaptureScope) {
    captureObject = scope
}

fun MTLCaptureDescriptor.setCaptureCommandQueue(commandQueue: MTLCommandQueue) {
    captureObject = commandQueue
}
