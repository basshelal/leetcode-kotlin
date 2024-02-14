@file:Suppress("unused")

package dev.basshelal.problems

import java.util.Stack

/**
 * [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
 */
fun isValid(s: String): Boolean {
    val noBracket = 0
    val roundBracket = 1
    val squareBracket = 2
    val curlyBracket = 3
    val stack = Stack<Int>()
    var lastOpenedBracketType = noBracket
    for (char in s) {
        when (char) {
            '(' -> stack.push(roundBracket)
            '[' -> stack.push(squareBracket)
            '{' -> stack.push(curlyBracket)
            ')' -> {
                if (stack.isNotEmpty() && stack.peek() == roundBracket)
                    stack.pop()
                else return false
            }

            ']' -> {
                if (stack.isNotEmpty() && stack.peek() == squareBracket)
                    stack.pop()
                else return false
            }

            '}' -> {
                if (stack.isNotEmpty() && stack.peek() == curlyBracket)
                    stack.pop()
                else return false
            }
        }
    }
    return stack.isEmpty()
}