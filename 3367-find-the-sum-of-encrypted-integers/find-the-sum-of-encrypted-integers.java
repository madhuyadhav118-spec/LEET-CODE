class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            nums[i] = encrypt(nums[i]);
        }

        int sum = 0;
        for(int a : nums) {
            sum += a;
        }
        return sum;
    }
    private int encrypt(int n) {
        int count = 0;
        int temp = n;
        int max = 0;
        while(n>0) {
            int r = n % 10;
            max = Math.max(max,r);
            count++;
            n = n/10;
        }
        int num = 0;
        for(int i =0 ;i < count ; i++) {
            num = num * 10+max;
        }

        return num;
    }
}