/*
 * Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.

 

Example 1:

Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
Example 2:

Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit. 
 */
public class SecondLargestDigitInAString {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                continue;
            } else {
                set.add(s.charAt(i) - '0');
            }
        }
        List<Integer> li = new ArrayList<>(set);
        Collections.sort(li);
        if (li.size() == 0 || li.size() == 1) {
            return -1;
        }
        return li.get(li.size() - 2);
    }
}
