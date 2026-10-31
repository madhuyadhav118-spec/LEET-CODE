class Solution {
    public String resultingString(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(!st.isEmpty()) {
                int a = ch-'0';
                int b = st.peek()-'0';
                int c = Math.abs(a-b);
                if(c == 1 || c== 25) {
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else{
                 st.push(ch);
            }
        }
        
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
       
        return sb.reverse().toString();
    }
}