class Solution {
    public void reverse(int[] array, int low, int high){
        /*Approach: k=k%n. Reverse the entire array and reverse first k elements and then the remaining elements*/
        //TC=O(n);
        //SC=O(1);
        int i=low;
        int j=high;
        while(i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums, 0, n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}
