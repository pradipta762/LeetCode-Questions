/*
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
 */
public class ReverseWordsInAString_iii {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(String str : arr){
            sb.append(reverse(str) + " ");
        }
        return sb.toString().trim();
    }
    public String reverse(String str){
        char[] arr = str.toCharArray();
        int st = 0, end = str.length() - 1;
        while(st < end){
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        return new String(arr);
    }
}
