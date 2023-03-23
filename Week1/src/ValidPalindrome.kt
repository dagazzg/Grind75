class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var s = s.filter { it.isLetterOrDigit() }.toLowerCase() // deprecated but leetcode Kotlin doesn't have .lowercase()
        if (s.isEmpty()) return true
        var reverseIndex = s.length - 1
        for (index in s.indices) {
            if (s[index] != s[reverseIndex]) return false
            if (index == reverseIndex || index > reverseIndex) return true
            reverseIndex -= 1
        }
        return false
    }
}
