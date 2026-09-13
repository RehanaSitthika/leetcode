class Solution {
    public boolean divideArray(int[] nums) {

        if (nums.length % 2 != 0) {
            return false;
        }

        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            set.put(nums[i], set.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer n : set.keySet()) {
            if (set.get(n) % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}