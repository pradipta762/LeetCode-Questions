
/*
 * Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.

 

Example 1:

Input: s = "foobar", letter = "o"
Output: 33
Explanation:
The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
Example 2:

Input: s = "jjjj", letter = "k"
Output: 0
Explanation:
The percentage of characters in s that equal the letter 'k' is 0%, so we return 0.
 */
import java.util.Map;
import java.util.HashMap;

public class PercentageOfLetterInString {
    // Using CharArray
    public int percentageLetter(String s, char letter) {
        int length = s.length();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == letter)
                count++;
        }
        return (count * 100) / length;
    }

    // Using HashMap
    public static int percentageLetter2(String s, char letter) {
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int charLen = map.get(letter);
        return (charLen * 100) / length;
    }

    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        int ans = percentageLetter2(s, letter);
        System.out.println(ans);
    }
}
