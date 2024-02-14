@file:Suppress("unused")

package dev.basshelal.problems

/**
 * [9. Palindrome Number](https://leetcode.com/problems/palindrome-number/description/)
 */
fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    val string = x.toString()
    val reversed = string.reversed()
    if (string == reversed) return true

    return false
}