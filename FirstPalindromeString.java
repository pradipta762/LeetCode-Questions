/*
 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.

 

Example 1:

Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
Example 2:

Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".
Example 3:

Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.
 */
public class FirstPalindromeString{
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            String str = words[i];
            String reverse = "";
            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                reverse = ch + reverse;
            }
            if(str.equals(reverse))
                return str;
        }
        return "";
    }

    //Optimized code
    public boolean swapString(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }
    public String firstPalindrome2(String[] words) {
        for(int i = 0; i < words.length; i++){
            if(swapString(words[i]))
                return words[i];
        }
        return "";
    }
}