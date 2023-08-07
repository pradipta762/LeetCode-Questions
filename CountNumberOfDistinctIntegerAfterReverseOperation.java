/*
 * You are given an array nums consisting of positive integers.

You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.

Return the number of distinct integers in the final array.

 

Example 1:

Input: nums = [1,13,10,12,31]
Output: 6
Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
Example 2:

Input: nums = [2,2,2]
Output: 1
Explanation: After including the reverse of each number, the resulting array is [2,2,2,2,2,2].
The number of distinct integers in this array is 1 (The number 2).
 */
public class CountNumberOfDistinctIntegerAfterReverseOperation {
    public int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }

    // Using HashSet
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
            set.add(reverse(n));
        }
        return set.size();
    }

    // Using Normal Array
    public int countDistinctIntegers2(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i + nums.length] = reverse(nums[i]);
        }
        Arrays.sort(ans);
        int count = 0;
        for (int i = 1; i < ans.length; i++) {
            if (ans[i] != ans[i - 1]) {
                count++;
            }
        }
        return count + 1;
    }
}
