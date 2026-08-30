class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int maxIdx = 0;
        int minIdx = 0;
       
        for(int i =0 ; i < n; i++) {
            if(nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }

            if(nums[i] < nums[minIdx]) {
                minIdx = i;
            }
        }
        int left = Math.min(maxIdx,minIdx);
        int right = Math.max(maxIdx,minIdx);
        int front = right+1;
        int back = n-left;
        int fb = (left+1) + (n-right);
        
        return Math.min(front,Math.min(back,fb));
        
    }
}