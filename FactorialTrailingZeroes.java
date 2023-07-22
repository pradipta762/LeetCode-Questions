/*
 * Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

 

Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        for(int i = 5; i <= n; i *= 5){
            count = count + n / i;
        }
        return count;
    }
}
