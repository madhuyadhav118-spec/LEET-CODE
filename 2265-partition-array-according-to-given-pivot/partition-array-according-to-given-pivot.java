class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int a[]  = new int[n];
        int idx = 0;
        for(int num : nums) {
            if(num < pivot) {
                a[idx++] = num;
            }
        }
        for(int num : nums) {
            if(num == pivot) {
                a[idx++] = num;
            }
        }

        for(int num : nums) {
            if(num > pivot) {
                a[idx++] = num;
            }
        }
        return a;
        }  
}