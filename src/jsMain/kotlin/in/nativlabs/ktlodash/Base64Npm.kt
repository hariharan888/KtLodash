
package `in`.nativlabs.ktlodash

@JsModule("base-64")
@JsNonModule
external object Base64 {
    fun encode(s: String): String
}