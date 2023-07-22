/*
 * You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

 

Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 */

import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n ; j++){
                if(heights[i] < heights[j]){
                    int temp = heights[i];
                    String str = names[i];
                    heights[i] = heights[j];
                    names[i] = names[j];
                    heights[j] = temp;
                    names[j] = str;
                }
            }
        }
        return names;
    }

    public String[] sortPeople2(String[] names, int[] heights) {
        //Using HashMap
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0; i < names.length; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] str = new String[names.length];
        int j = 0;
        for(int i = heights.length - 1; i >= 0; i--){
            str[j++] = map.get(heights[i]); 
        }
        return str;
    }
}
