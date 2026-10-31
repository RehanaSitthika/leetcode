class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int[] candidates, int target, int start,
                          List<Integer> current,
                          List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Skip duplicate numbers
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Since array is sorted, no need to continue
            if (candidates[i] > target) {
                break;
            }

            // Choose the number
            current.add(candidates[i]);

            // Move to the next index
            backtrack(candidates, target - candidates[i],
                      i + 1, current, result);

            // Remove the number
            current.remove(current.size() - 1);
        }
    }
}