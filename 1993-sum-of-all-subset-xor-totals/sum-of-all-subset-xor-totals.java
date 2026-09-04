class Solution {
    public int subsetXORSum(int[] nums) {

        int result = 0;

        for (int num : nums) {
            result = result | num;
        }

        return result << (nums.length - 1);
    }
}