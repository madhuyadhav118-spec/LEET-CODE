class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long ans = 0;
        int a[] = new int[24];
        for(int n : hours) {
            int rem = n % 24;
            int need = (24-rem)%24;
            ans += a[need];
            a[rem]++;
        }
        return ans;
    }
}