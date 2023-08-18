/*
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        int k = 0;
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                nums[k++] = i;
            }
        }
    }
}