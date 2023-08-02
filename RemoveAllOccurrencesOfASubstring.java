/*
 * Given two strings s and part, perform the following operation on s until all occurrences of the substring part are removed:

Find the leftmost occurrence of the substring part and remove it from s.
Return s after removing all occurrences of part.

A substring is a contiguous sequence of characters in a string.

 

Example 1:

Input: s = "daabcbaabcbc", part = "abc"
Output: "dab"
Explanation: The following operations are done:
1 - s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
2 - s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
3 - s = "dababc", remove "abc" starting at index 3, so s = "dab".
Now s has no occurrences of "abc".
Example 2:

Input: s = "axxxxyyyyb", part = "xy"
Output: "ab"
Explanation: The following operations are done:
1 - s = "axxxxyyyyb", remove "xy" starting at index 4 so s = "axxxyyyb".
2 - s = "axxxyyyb", remove "xy" starting at index 3 so s = "axxyyb".
3 - s = "axxyyb", remove "xy" starting at index 2 so s = "axyb".
4 - s = "axyb", remove "xy" starting at index 1 so s = "ab".
Now s has no occurrences of "xy".
 */
public class RemoveAllOccurrencesOfASubstring {
    public String removeOccurrences(String s, String part) {
        int length = part.length();
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf(part) != -1) {
            int stIdx = sb.indexOf(part);
            sb.delete(stIdx, stIdx + length);
        }
        return sb.toString();
    }
}
