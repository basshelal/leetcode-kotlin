@file:Suppress("unused")

package dev.basshelal.problems

/**
 * [58. Length of Last Word](https://leetcode.com/problems/length-of-last-word/)
 */
fun lengthOfLastWord(s: String): Int {
    var result = 0
    // start from the end since we only care about that
    for (i in s.lastIndex downTo 0) {
        val char = s[i]
        if (char != ' ') {
            // we have reached a letter, keep going
            result++
        } else if (char == ' ' && result > 0) {
            // we have reached a new word, we're done
            return result;
        }
    }
    return result
}
