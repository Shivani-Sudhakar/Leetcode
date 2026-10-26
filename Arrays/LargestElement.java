class Solution {
    public int largestElement(int[] nums) {
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>ans){
                ans=nums[i];
            }
        }
        return ans;
    }
}
