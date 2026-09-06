class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums) {
            set.add(a);
        }
        int max = 0;
        for(int x : nums) {
            if(set.contains(x) && set.contains(-x)) {
                max = Math.max(max,x);
            }

        }
        return max !=0?max:-1;
        
    }
}