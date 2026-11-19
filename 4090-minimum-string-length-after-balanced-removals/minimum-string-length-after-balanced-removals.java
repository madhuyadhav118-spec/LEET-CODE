class Solution {
    public int minLengthAfterRemovals(String s) {

        int n = s.length();
        int aCount = 0;
        int bCount = 0;

        for(int i = 0; i < n ; i++) {
            if(s.charAt(i)=='a') {
                aCount++;
            }else{
                bCount++;
            }
        }
        return Math.abs(aCount-bCount);
    }
}