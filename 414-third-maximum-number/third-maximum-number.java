class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int a : nums) {

            if( a==firstMax || a==secondMax || a== thirdMax) {
                continue;
            }
            if(a > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = a;
            }else if(a > secondMax ) {
                thirdMax = secondMax;
                secondMax = a;
            }else if(a > thirdMax ) {
                thirdMax = a;
            }
        }
        
       if(thirdMax == Long.MIN_VALUE) {
            return (int)firstMax;
       }

       return (int)thirdMax;
    }
}