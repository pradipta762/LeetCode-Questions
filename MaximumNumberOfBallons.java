/*
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

 

Example 1:



Input: text = "nlaebolko"
Output: 1
Example 2:



Input: text = "loonbalxballpoon"
Output: 2
Example 3:

Input: text = "leetcode"
Output: 0
 */
public class MaximumNumberOfBallons {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for (char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }
        // we need to find all the occurrence of the letters of the word "balloon" and
        // return which has minimum occurrence
        int min = freq[1]; // b
        min = Math.min(min, freq[0]); // a
        min = Math.min(min, freq[11] / 2); // l
        min = Math.min(min, freq[14] / 2); // o
        min = Math.min(min, freq[13]); // n

        return min;
    }
}
