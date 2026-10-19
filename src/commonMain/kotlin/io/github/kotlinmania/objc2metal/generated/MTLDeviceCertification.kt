// port-lint: source generated/MTLDeviceCertification.rs
package io.github.kotlinmania.objc2metal.generated

import io.github.kotlinmania.objc2foundation.NSInteger
import io.github.kotlinmania.objc2foundation.generated.NSNotificationName

typealias NSDeviceCertification = NSInteger

val NSDeviceCertificationiPhonePerformanceGaming: NSDeviceCertification = 1L

typealias NSProcessPerformanceProfile = NSInteger

val NSProcessPerformanceProfileDefault: NSProcessPerformanceProfile = 0L
val NSProcessPerformanceProfileSustained: NSProcessPerformanceProfile = 1L

val NSProcessInfoPerformanceProfileDidChangeNotification: NSNotificationName? = null

interface Sealed

/**
 * Category "NSDeviceCertification" on NSProcessInfo.
 */
interface NSProcessInfoNSDeviceCertification : Sealed {
    fun isDeviceCertifiedFor(performance_tier: NSDeviceCertification): Boolean

    fun hasPerformanceProfile(performance_profile: NSProcessPerformanceProfile): Boolean
}
