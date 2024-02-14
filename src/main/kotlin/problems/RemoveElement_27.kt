@file:Suppress("unused")

package dev.basshelal.problems

/**
 * [27. Remove Element](https://leetcode.com/problems/remove-element/)
 */
fun removeElement(nums: IntArray, v: Int): Int {
    var newIndex = 0
    for (num in nums) {
        if (num != v) {
            nums[newIndex++] = num
        }
    }
    return newIndex
}