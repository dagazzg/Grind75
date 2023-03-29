package java;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Set<Character> oddChars = new HashSet();
        for (char c : s.toCharArray()) {
            if(!oddChars.remove(c))
                oddChars.add(c);
        }
        return oddChars.isEmpty() ? s.length() : s.length() - oddChars.size() + 1;
    }
}
