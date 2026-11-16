class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        int max = 0;
        for(int a : nums) {
            if(a <= 9) {
                singleDigitSum += a;
            }else{
                doubleDigitSum += a;
            }
            
        }
        // max = Math.max(sigleDigitSum,doubleDigitSum);
        // if(singleDigitSum > doubleDigitSum || singleDigitSum < doubleDigitSum) {
        //     return true;
        // }else{
        //     return false;
        // }
        return singleDigitSum != doubleDigitSum;
        
    }
}