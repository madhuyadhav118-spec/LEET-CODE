class Solution {
    public boolean isBalanced(String num) {
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i<num.length(); i++) {
            char ch = num.charAt(i);
            int a = ch - '0';

            if(i % 2 == 0) {
                evenSum += a;
            }else{
                oddSum += a;
            }
        }
        return oddSum == evenSum;
    }
}