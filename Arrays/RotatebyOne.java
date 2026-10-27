class Solution {
    public void rotateArrayByOne(int[] nums) {
        /*Approach: save the first element, move all the elements to left and lace the first element at the last position*/
        //TC=O(n)
        //SC=O(1);
        int n=nums.length;
        int firstElement=nums[0];
        for(int i=0;i<n-1;i++){
            nums[i]=nums[i+1];
        }
        nums[n-1]=firstElement;
    }
}
