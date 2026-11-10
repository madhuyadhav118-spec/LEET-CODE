class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            a[i] = sum ;
        }
        int count = 0;
        for(int i = 0;i<n-1;i++) {
            int s = Math.abs(a[i]-(a[n-1]-a[i]));
            if(s % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}