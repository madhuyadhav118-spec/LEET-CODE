class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums) {
            set.add(a);
            set.add(reverse(a));
        }
        return set.size();
    }
    private int reverse(int a) {
        int rev = 0;
        while(a > 0) {
            rev = rev * 10 + a % 10;
            a/=10;
        }
        return rev;
    }
}