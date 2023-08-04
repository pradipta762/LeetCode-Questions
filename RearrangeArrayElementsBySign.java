/*
 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
 */
public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] neg = new int[len / 2];
        int[] pos = new int[len / 2];
        int n = 0;
        int p = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                pos[p++] = nums[i];
            } else {
                neg[n++] = nums[i];
            }
        }
        n = 0;
        p = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                nums[i] = pos[p++];
            } else {
                nums[i] = neg[n++];
            }
        }
        return nums;
    }

    public int[] rearrangeArray2(int[] nums) {
        int evenIdx = 0, oddIdx = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                ans[evenIdx] = nums[i];
                evenIdx += 2;
            } else {
                ans[oddIdx] = nums[i];
                oddIdx += 2;
            }
        }
        return ans;
    }
}
