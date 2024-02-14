@file:Suppress("unused")

package dev.basshelal.problems

import java.util.Arrays

/**
 * [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
 */
fun merge(result: IntArray, nums1Length: Int, nums2: IntArray, nums2Length: Int): Unit {
    val nums1 = Arrays.copyOfRange(result, 0, nums1Length)
    val resultSize = nums1Length + nums2Length
    var nums1Index = 0
    var nums2Index = 0
    for (i in 0 until resultSize) {
        if (nums1Index >= nums1Length) result[i] = nums2[nums2Index++]
        else if (nums2Index >= nums2Length) result[i] = nums1[nums1Index++]
        else {
            val nums1Value = nums1[nums1Index]
            val nums2Value = nums2[nums2Index]
            if (nums1Value <= nums2Value) {
                result[i] = nums1Value
                nums1Index++
            } else {
                result[i] = nums2Value
                nums2Index++
            }
        }
    }
}