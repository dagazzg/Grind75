package java;

import java.util.Map;
import static java.util.stream.Collectors.toMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sCharCounts = s.chars().boxed()
                .collect(toMap(
                        key -> (char) key.intValue(),
                        value -> 1,
                        Integer::sum
                ));

        Map<Character, Integer> tCharCounts = t.chars().boxed()
                .collect(toMap(
                        key -> (char) key.intValue(),
                        value -> 1,
                        Integer::sum
                ));
        System.out.println(sCharCounts.entrySet());
        System.out.println(tCharCounts.entrySet());
        return sCharCounts.entrySet().equals(tCharCounts.entrySet());
    }
}
