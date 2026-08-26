class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int[] arr = new int[nums.length];

        int small = 0;
        int equal = 0;

        // Find starting positions
        for (int num : nums) {
            if (num < pivot)
                small++;
            else if (num == pivot)
                equal++;
        }

        int lessIndex = 0;
        int equalIndex = small;
        int greaterIndex = small + equal;

        // Place elements
        for (int num : nums) {
            if (num < pivot)
                arr[lessIndex++] = num;
            else if (num == pivot)
                arr[equalIndex++] = num;
            else
                arr[greaterIndex++] = num;
        }

        return arr;
    }
}