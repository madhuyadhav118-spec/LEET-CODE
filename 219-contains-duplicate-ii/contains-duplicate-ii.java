class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        // for(int i=0;i<n;i++) {
        //     for(int j=i+1;j<n;j++) {
        //         if(nums[i] == nums[j]) {
        //             if(Math.abs(i-j) <=k) {
        //                 return true;
        //             }
        //          }
        //     }
        // }
        // return false;
       Set set = new HashSet<>();
       for(int i =0; i<n;i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
             if(set.size() > k) {
                 set.remove(nums[i-k]);
             }
       }
       return false;
    }
}