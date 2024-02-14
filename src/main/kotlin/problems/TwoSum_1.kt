@file:Suppress("unused")

/**
 * [Two Sum](https://leetcode.com/problems/two-sum/)
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2) { 0 }
        for (indexA in nums.indices) {
            for (indexB in (indexA + 1) until nums.size) {
                if (nums[indexA] + nums[indexB] == target) {
                    result[0] = indexA
                    result[1] = indexB
                    return result
                }
            }
        }
        throw IllegalStateException()
    }
}