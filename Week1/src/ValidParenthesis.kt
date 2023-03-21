import java.util.*

class ValidParenthesis {
    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0) return false

        val stack = Stack<Char>()
        val bracketMap = mapOf<Char, Char>(
            '{' to '}',
            '(' to ')',
            '[' to ']'
        )

        s.forEach {
            when (it) {
                '{', '[', '(' -> stack.push(bracketMap[it])
                else -> {
                    if (stack.isNotEmpty() && it == stack.peek()) {
                        stack.pop()
                    } else {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}