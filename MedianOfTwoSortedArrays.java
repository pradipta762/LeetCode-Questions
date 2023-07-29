/*
HARD PROBLEM
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).


Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0, j = 0;
        double ans = 0;
        int[] arr = new int[l1 + l2];
        int k = 0;
        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }
        while (i < l1) {
            arr[k++] = nums1[i++];
        }
        while (j < l2) {
            arr[k++] = nums2[j++];
        }
        int n = arr.length;
        if (n % 2 != 0) {
            ans = (0 + n) / 2;
            return arr[(int) ans];
        } else {
            int mid = (0 + (n - 1)) / 2;
            ans = (double) (arr[mid] + arr[mid + 1]) / 2;
        }
        return ans;
    }
}
