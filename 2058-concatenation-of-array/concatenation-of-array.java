class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2*n];
        for(int i=0;i<2*n;i++){
            int index=i%n;
            arr[i]=nums[index];
        }
        return arr;
    }
}