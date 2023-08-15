/*
 * You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.

 

Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 */
public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        for (String str : words) {
            if (isGood(str, chars)) {
                ans += str.length();
            }
        }
        return ans;
    }

    public boolean isGood(String words, String chars) {
        Map<Character, Integer> mapChar = new HashMap<>();
        for (char ch : chars.toCharArray()) {
            mapChar.put(ch, mapChar.getOrDefault(ch, 0) + 1);
        }

        for (char ch : words.toCharArray()) {
            if (mapChar.containsKey(ch) && mapChar.get(ch) > 0) {
                mapChar.put(ch, mapChar.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
