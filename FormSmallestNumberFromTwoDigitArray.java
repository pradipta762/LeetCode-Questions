/*
 * Given two arrays of unique digits nums1 and nums2, return the smallest number that contains at least one digit from each array.
 

Example 1:

Input: nums1 = [4,1,3], nums2 = [5,7]
Output: 15
Explanation: The number 15 contains the digit 1 from nums1 and the digit 5 from nums2. It can be proven that 15 is the smallest number we can have.
Example 2:

Input: nums1 = [3,5,2,6], nums2 = [3,1,7]
Output: 3
Explanation: The number 3 contains the digit 3 which exists in both arrays.
 */
public class FormSmallestNumberFromTwoDigitArray {
    public int minNumber(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        int similar = 100;
        for (int i : set1) {
            if (set2.contains(i)) {
                similar = Math.min(similar, i);
            }
        }
        if (similar != 100) {
            return similar;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return 10 * Math.min(nums1[0], nums2[0]) + Math.max(nums1[0], nums2[0]);
    }
}
