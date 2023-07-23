/*
 * You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.

 

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"
 */
public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        Map<String, Character> map = new HashMap<>();
        int n = 1;
        // Loop through the alphabet 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) { // Mapping a to z
            // Check if alphabet is 'j' or greater.
            if (ch >= 'j') {
                // If it is, add the number with a '#' and the correspoding alphabet character
                // to the hashmap.
                map.put(n + "#", ch);
            } else {
                // Otherwise, add the number with only the corresponding alphabet character
                // (without the '#')
                map.put(n + "", ch);
            }
            n++;
        }

        // Create a StringBuilder to store the resulting string
        StringBuilder sb = new StringBuilder();
        // Read the characters of the input string from the end
        for (int i = s.length() - 1; i >= 0; i--) {
            // Check if the current character is '#'
            if (s.charAt(i) == '#') {
                // If it is, get the substring of length 3 from the input string
                // starting from i-2 to i+1 (inclusive) and use it as the key to find
                // the corresponding alphabet character in the HashMap

                String key = s.substring(i - 2, i + 1);
                sb.append(map.get(key));
                // Since we used a substring of length 3, we decrement i by 2 to skip the next 2
                // characters
                i = i - 2;
            } else {
                // If the current character is not '#', get the substring of length 1 from the
                // input string starting from i to i+1 (inclusive) and use it as the key to find
                // the corresponding alphabet character in the HashMap
                String key = s.substring(i, i + 1);
                sb.append(map.get(key));
            }
        }
        return sb.reverse().toString();
    }
}
