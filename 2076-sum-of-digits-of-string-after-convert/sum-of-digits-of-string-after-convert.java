class Solution {
    public int getLucky(String s, int k) {

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            sb.append(c-'a'+1); 
        }
        String s1 = sb.toString();
        
        while(k-->0) {
            int sum =0;
            for(int i =0;i<s1.length();i++) {
                char ch = s1.charAt(i);
                sum += ch-'0';
            }

            s1 = String.valueOf(sum);
            
        }
        return Integer.parseInt(s1);
    }
}