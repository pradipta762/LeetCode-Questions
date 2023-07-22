/*
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 */

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        // Using Bit manupulation.(Approach - 1)
        /*
        As we know that if we do XOR operation of 0 with any number it will give us the exact same number.
        And similarly if we do XOR operation between two similar numbers it will give 0 i.e., 2 ^ 2 = 0 
        */
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
    public int singleNumber2(int[] nums) {
         // Approach - 2
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i += 2){
            if(nums[i] != nums[i + 1])
                return nums[i];
        }
        return nums[nums.length - 1];
    }
}
