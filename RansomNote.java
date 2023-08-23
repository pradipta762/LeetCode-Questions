/*
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (freq[ch - 'a'] == 0)
                return false;
            freq[ch - 'a']--;
        }
        return true;
    }
}
