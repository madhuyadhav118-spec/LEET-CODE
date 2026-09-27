class Solution {
    public String reverseParentheses(String s) {

        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++) {
            char ch = s.charAt(i);
            if(ch == ')') {
                sb.setLength(0);
                while(!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                if(!st.isEmpty()) {
                st.pop();
                }

            for(int j =0 ; j<sb.length();j++) {
                st.push(sb.charAt(j));
            }
            
            
            }else {
                st.push(ch);
            }
        }

    sb.setLength(0);
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }

    return sb.reverse().toString();
    }
}