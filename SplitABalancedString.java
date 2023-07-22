/*
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
Example 2:

Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
Example 3:

Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".

// HINT :-- Declare a variable "balanced" Iterate through the string and whenever 'L' occurs increase balanced by 1 otherwise decrese by 1 when the balanced becomes 0, increase the ans by 1, and return 1;
 */
public class SplitABalancedString {
    public int balancedStringSplit(String s) {
        int ans = 0, balanced = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'L') 
                balanced++;
            else 
                balanced--;
            if(balanced == 0) 
                ans++;
        }
        return ans;
    }
}
