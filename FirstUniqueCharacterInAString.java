/*
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 */
public class FirstUniqueCharacterInAString {
    // Using Frequency array
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (freq[arr[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    // Using HashMap
    public int firstUniqChar2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

}
