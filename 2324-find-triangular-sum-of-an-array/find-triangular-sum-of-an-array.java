class Solution {
    public int triangularSum(int[] nums) {

        int n = nums.length;
        if(n==1) {
            return nums[0];
        }
        
        int a[] = new int[n-1];
        int temp = n;
        while(n > 0) {
            for(int i=0;i<n-1;i++) {
                a[i] = (nums[i] + nums[i+1]) % 10;
            }
            for(int i=0;i<n-1;i++){
                nums[i] = a[i];
            }
            n--;
        }
        return a[0];
    }
}