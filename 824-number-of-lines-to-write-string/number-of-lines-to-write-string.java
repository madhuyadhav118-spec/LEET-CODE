class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        int n = s.length();
        int a[] = new int[2];
        int count = 1;
        int sum = 0;
        for(int i =0; i < n; i++) {
            char ch = s.charAt(i);
             int x =  widths[ch-'a']; 
            if(sum +x > 100){
                sum = x;
                count++;
            }else{
                sum += x;
            }
        }
        a[0] = count;
        a[1] = sum;
        return a;
    }
}