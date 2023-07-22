/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        while(j < n){
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if(nums[i] == 0 && nums[j] == 0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        System.gc();
    }
}
