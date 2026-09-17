class Solution {
    public String replaceDigits(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< n;i++) {
            if(i % 2 == 0) {
                sb.append(s.charAt(i));
            }else{
                char a = s.charAt(i-1);
                int b = s.charAt(i)-'0';   
                char c = (char)(a+b); 
                sb.append(c); 
            }
           
        }
        return sb.toString();
    }
}