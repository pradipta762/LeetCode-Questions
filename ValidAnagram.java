/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */
public class ValidAnagram {
    // Method - 1 : Using HashMap
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    // Method - 2 : Using Array
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int val : freq) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
