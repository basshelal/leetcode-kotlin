@file:Suppress("unused")

package dev.basshelal.problems

/**
 * [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
 */
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val uniques = mutableListOf<Int>()
        var lastAdded = Int.MIN_VALUE
        for (i in nums.indices) {
            val num = nums[i]
            if (num != lastAdded) {
                uniques.add(num)
                lastAdded = num
            }
        }
        uniques.forEachIndexed { index, it ->
            nums[index] = it
        }
        return uniques.size
    }
}