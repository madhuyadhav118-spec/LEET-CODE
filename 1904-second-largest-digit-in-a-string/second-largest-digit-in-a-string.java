class Solution {
    public int secondHighest(String s) {

        int max1 = -1;
        int max2= -1;

        int n = s.length();
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') {
                int a = ch-'0';
                if(a > max1) {
                    max2 = max1;
                    max1 = a;
                }
                else if (a>max2 && a!=max1) {
                    max2=a;
                }
            }
        }
        return max2;
    }
}