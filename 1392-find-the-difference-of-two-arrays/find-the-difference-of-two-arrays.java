class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag && !l1.contains(nums1[i])) {
                l1.add(nums1[i]);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            boolean flags = false;

            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    flags = true;
                    break;
                }
            }

            if (!flags && !l2.contains(nums2[i])) {
                l2.add(nums2[i]);
            }
        }

        list.add(l1);
        list.add(l2);

        return list;
    }
}