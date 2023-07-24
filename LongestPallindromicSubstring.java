/*
 * Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */
public class LongestPallindromicSubstring {
    public String longestPalindrome(String s) {
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                if (checkPallindrome(s, j, j + i)) {
                    return s.substring(j, i + j);
                }
            }
        }
        return "";
    }

    public boolean checkPallindrome(String s, int i, int j) {
        int st = i;
        int end = j - 1;
        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}