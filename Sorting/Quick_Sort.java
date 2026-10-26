
class Quick_Sort {
    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && nums[i] <= pivot) {
                i++;
            }

            while (j > low && nums[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }

        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int p = partition(nums, low, high);
            quickSort(nums, low, p - 1);
            quickSort(nums, p + 1, high);
        }
    }

    public int[] quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}