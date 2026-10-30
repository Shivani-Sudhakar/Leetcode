class Solution {
    public int missingNumber(int[] nums) {
        /*Approach: find sum of n natural numbers (n=length of nums). subtract all the elements of nums from sum and return sum*/
        //TC=O(n);
        //SC=O(1);
        int n=nums.length;
        int sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum-=nums[i];
        }
        return sum;
    }
}
