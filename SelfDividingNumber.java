/*
 * A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

 

Example 1:

Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
Example 2:

Input: left = 47, right = 85
Output: [48,55,66,77]
 */

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        //Optimized code;
        for(int i = left; i <= right; i++){
            
            int num = i;
            while(num > 0){
                int digit = num % 10;
                if(digit == 0 || i % digit != 0) break;
                num /= 10;
            }
            if(num == 0) ans.add(i);  
        }
        // for(int i = left; i <= right; i++){
        //     if(i < 10) ans.add(i);
        //     else{
        //         int num = i;
        //         boolean flag = true;
        //         while(num > 0){
        //             int digit = num % 10;
        //             if(digit == 0 || i % digit != 0) flag = false;
        //             num /= 10;
        //         }
        //         if(flag == true) ans.add(i);
        //     }
        // }
        return ans;
    }
    public static void main(String[] args){
        List<Integer> li = new ArrayList<>();
        int left = 1;
        int right = 22;
        li = selfDividingNumbers(left, right);
        System.out.println(li);
    }
}
