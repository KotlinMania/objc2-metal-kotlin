// port-lint: source private.rs
package io.github.kotlinmania.objc2metal

import io.github.kotlinmania.objc2foundation.NSString

interface MTLDevicePrivate {
    fun vendorName(): NSString = NSString("")
    fun familyName(): NSString = NSString("")
}
