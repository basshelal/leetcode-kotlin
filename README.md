# LeetCode

My LeetCode problem submissions in Kotlin, 
of course the actual submissions are on [my LeetCode profile](https://leetcode.com/basshelal/)
and that should be the true source of truth.

This repository is mainly so that I can solve the problems from IntelliJ IDEA, using all the help the IDE provides. 
Saving them in one repository to browse is just a nice to have.

All submissions are found in the [problems package](src/main/kotlin/problems/).

All submissions in this repository are in Kotlin, a modern language with an excellent standard library. 
Despite that, I will try to keep usages of the standard library utility functions low for better learning.

I will usually try to keep my most preferred solution here, this may not be the latest submission.

All submission file names are in the format `$name_$number` where `$name` is the problem's name in camel case, for 
example `TwoSum` for "Two Sum" and `$number` is the problem's number.

LeetCode requires Kotlin submissions be placed in a `Solution` class, with a specific function name and signature 
unique(?) to each problem, for example `1. Two Sum`:
```kotlin
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

    }
}
```

whereas `2. Add Two Numbers`:
```kotlin
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        
    }
}
```

In the submissions I remove the `class Solution` and declare the function in the problem's file.

This is to avoid the IDE complaining about a redeclared class, so when submitting, just wrap the submission function 
with the `class Solution` again.