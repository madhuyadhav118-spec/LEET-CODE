class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int a : nums) {
            if(a > max) {
                max = a;
            }
        }
        int res = 0;
        for(int x : nums) {
            res = res + max -x;
        }
        return res;
    }
}