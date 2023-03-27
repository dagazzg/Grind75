package java;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charMap = new HashMap();
        for (char neededChar: ransomNote.toCharArray()) {
            if(charMap.containsKey(neededChar))
                charMap.put(neededChar, charMap.get(neededChar) + 1);
            else
                charMap.put(neededChar, 1);
        }

        int charsFound = 0;
        for (char availableChar: magazine.toCharArray()) {
            if(charMap.containsKey(availableChar) && charMap.get(availableChar) > 0) {
                charMap.put(availableChar, charMap.get(availableChar) - 1);
                charsFound++;
            } else
                continue;
            if (charsFound == ransomNote.length()) return true;
        }
        return false;
    }
}
