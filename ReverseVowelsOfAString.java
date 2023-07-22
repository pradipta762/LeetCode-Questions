/*
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int st = 0, end = s.length() - 1;
        while(st < end){
            if(!isVowel(arr[st])){
                st++;
            }
            if(!isVowel(arr[end])){
                end--;
            }
            if(isVowel(arr[st]) && isVowel(arr[end])){
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        return String.valueOf(arr);
    }

    public boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
}
    // StringBuilder sb = new StringBuilder(s);
    //     int st = 0, end = sb.length() - 1;
    //     HashSet<Character> set = new HashSet<>();
    //     set.add('a');
    //     set.add('e');
    //     set.add('i');
    //     set.add('o');
    //     set.add('u');
    //     set.add('A');
    //     set.add('E');
    //     set.add('I');
    //     set.add('O');
    //     set.add('U');
    //     while(st <= end){
    //         if(set.contains(sb.charAt(st)) && set.contains(sb.charAt(end))){
    //             char temp = sb.charAt(st);
    //             sb.setCharAt(st, sb.charAt(end));
    //             sb.setCharAt(end, temp);
    //             st++;
    //             end--;
    //         }
    //         if(!set.contains(sb.charAt(st)))
    //             st++;
    //         if(!set.contains(sb.charAt(end)))
    //             end--;
    //     }
    //     return sb.toString();