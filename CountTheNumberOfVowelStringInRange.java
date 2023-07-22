/*
 * You are given a 0-indexed array of string words and two integers left and right.

A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].

 

Example 1:

Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2
Explanation: 
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.
Example 2:

Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
Output: 3
Explanation: 
- "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
- "mu" is not a vowel string because it does not start with a vowel.
- "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
- "artro" is a vowel string because it starts with 'a' and ends with 'o'.
The number of vowel strings in the mentioned range is 3.
 */

import java.util.HashSet;

public class CountTheNumberOfVowelStringInRange {
    // Using HashSet
    public int vowelStrings(String[] words, int left, int right) {
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        int count = 0;
        for(int i = left; i <= right; i++){
            if(vowel.contains(words[i].charAt(0)) && vowel.contains(words[i].charAt(words[i].length() - 1))){
                count++;
            }
        }
        return count;
    }

    // Using Loop
    public int vowelStrings2(String[] words, int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))){
                count++;
            }
        }
        return count;
    }
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e'|| ch == 'i' ||ch == 'o' || ch == 'u';
    }
}
