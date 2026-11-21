class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n = s.length();
        boolean adj = false;
        for(int i = 0; i < n-1; i++) {
            int a = s.charAt(i)-'0';
            int b = s.charAt(i+1)-'0';
            if(Math.abs(a-b) <= 2)  {
                adj = true;
            }else{
                return false;
            }
        }
        return adj;
    }
}