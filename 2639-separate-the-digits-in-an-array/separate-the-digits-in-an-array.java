class Solution {
    public int[] separateDigits(int[] nums) {

        StringBuilder sb = new StringBuilder();
        for(int a : nums) {
            sb.append(a);
        }
        
        int n = sb.length();
        int a[] = new int[n];
        for(int i = 0; i< n;i++) {
            a[i] = sb.charAt(i)-'0';
        }
    
        return a;
    }
}