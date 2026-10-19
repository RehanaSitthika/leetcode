class Solution {
    public int minPairSum(int[] nums) {
     Arrays.sort(nums);int max=0;
     int l=0;int r=nums.length-1;
     while(l<r){
        int sum=nums[l]+nums[r];
        if(max<sum){
            max=sum;
        }
        l++;r--;
     }   
     return max;
    }
}