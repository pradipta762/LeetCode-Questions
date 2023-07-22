/*
 * Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int st = 0, end = s.length - 1;
        while(st < end){
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--;
        }
    }
    //Approach - 2 (By using StringBuffer)
    public void reverseString2(char[] s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        sb.reverse();
        for(int i = 0; i < s.length; i++){
            s[i] = sb.charAt(i);
        }
    }
}
