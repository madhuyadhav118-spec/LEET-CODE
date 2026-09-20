class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum =0;
        for(int i=0;i<n;i++){
            char c1 = s.charAt(i);
            int a= c1-'a';
            sum += (i+1)*(26-a);
        }
        return sum;
    }
}