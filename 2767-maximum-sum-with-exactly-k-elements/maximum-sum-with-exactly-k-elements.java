class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        int idx =-1;
        int res =0;
        while(k-->0) {
            for(int i=0;i<n;i++) {
                if(nums[i] > max) {
                    max = nums[i];
                    idx = i;
                }
            }
            int sum = max;
            nums[idx]= max+1;
            res = res+sum;
        }
        return res;
    }
}