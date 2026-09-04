class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        // int left =0;
        // int right = n-1;
        for(int i=0;i<n;i++) {
            int max = max(nums,0,i);
            int min = min(nums,i,n-1);
            if(max-min <= k) {
                return i;
            }
        }
        return -1;
    }
    private int max(int arr[] , int left , int right) {
        int mx = 0;
        for(int i = left ; i <= right;i++ ) {
            mx = Math.max(mx,arr[i]);
        }
        return mx;
    }
    private int min(int arr[],int left,int right) {
        int mn = Integer.MAX_VALUE;
        for(int i=left;i<=right;i++) {
            mn = Math.min(mn,arr[i]);
        }
        return mn;
    }
}