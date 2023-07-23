public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i++;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    // Method - 2 ( Using HashMap )
    public boolean divideArray2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) % 2 != 0)
                return false;
        }
        System.gc();
        return true;
    }
}
