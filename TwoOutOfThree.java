/*
 * Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
 

Example 1:

Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.
Example 2:

Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
- 1, in nums1 and nums3.
Example 3:

Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
Output: []
Explanation: No value is present in at least two arrays.
 */
public class TwoOutOfThree{
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        List<Integer> li = new ArrayList<>();
        
        for(int i : nums1) set1.add(i);
        for(int i : nums2) set2.add(i);
        for(int i : nums3) set3.add(i);

        for(int i : set1){
            if(set2.contains(i)){
                li.add(i);
            }
        }
        for(int i : set2){
            if(set3.contains(i) && !set1.contains(i)){
                li.add(i);
            }
        }
        for(int i : set3){
            if(set1.contains(i) && !set2.contains(i)){
                li.add(i);
            }
        }
        
        return li;
    }
}