/*
 * Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstirngWithoutRepeatingCharacter{
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int j = 0, max = 0;
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max = Math.max(max, i - j + 1);
            } 
            else {
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
            }
        }
        return max;
    }
}