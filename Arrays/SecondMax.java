class Solution {
    public int secondLargestElement(int[] nums) {
        /*Approach: initialise max and secondmax to Integer.MIN_VALUE. find maximum and then find second max by iteration. if second max is Integer.MIN_VALUE then return -1*/
        //TC: O(n);
        //SC: O(1);

        int maximum=Integer.MIN_VALUE;
        int secondMaximum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maximum){
                maximum=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>secondMaximum && nums[i]!=maximum){
                secondMaximum=nums[i];
            }
        }

        if(secondMaximum==Integer.MIN_VALUE){
            return -1;
        }

        return secondMaximum;
    }
}
