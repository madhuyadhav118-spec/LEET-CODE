class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int maxDigit = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0; i < n; i++) {
            maxDigit = Math.max(maxDigit,diff(nums[i]));
        }
        
        for(int x : nums) {
            if(diff(x) == maxDigit) {
                sum +=x;
            }
            
        }
        return sum;
        
    }
    private int diff(int a) {
        int min = 9;
        int max = 0;
        while(a > 0) {
            int r = a % 10;
            max = Math.max(max, r);
            min = Math.min(min, r);
            a = a/10;
        }
        return max-min;
    }
}