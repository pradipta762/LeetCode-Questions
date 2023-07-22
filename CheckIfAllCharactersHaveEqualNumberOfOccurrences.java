/*
 * Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

 

Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 */
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        int[] dictionary = new int[26];
        for (int i = 0; i < s.length(); i++) {
            dictionary[s.charAt(i) - 'a']++;
        }
        int length = dictionary[s.charAt(0) - 'a'];
        for (int i = 0; i < 26; i++) {
            if (length != dictionary[i] && dictionary[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // Using HashMap
    public boolean areOccurrencesEqual2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int length = map.get(s.charAt(0));
        for (Character i : map.keySet()) {
            if (map.get(i) != length) {
                return false;
            }
        }
        return true;
    }
}
