public int removeDuplicates(int[] nums) {
        /*Approach: take j=1 and use i to traverse the array. If an unique element is found, add in in place of j and increment j*/
        //TC: O(n);
        //SC=O(1);
        int ans=1;
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i+1];
                ans++;
                j++;
            }
        }
        return ans;
    }
