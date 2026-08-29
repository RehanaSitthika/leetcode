class Solution {

    public int pivotInteger(int n) {

        int arr[] = new int[n + 1];

        arr[0] = 0;

        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + i;
        }

        for (int i = 1; i <= n; i++) {

            int leftSum = arr[i];
            int rightSum = arr[n] - arr[i - 1];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}