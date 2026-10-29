class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int n1 : nums1) {
            min1 = Math.min(min1,n1);
        }
        for(int n2 : nums2) {
            min2 = Math.min(min2,n2);
        }
        return min2-min1;
    }
}