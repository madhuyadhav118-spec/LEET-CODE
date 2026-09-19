class Solution {

    class Pair {
    char ch;
    int count;

    Pair(char ch ,int count) {
        this.ch = ch;
        this.count = count;
    }
}
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if(!st.isEmpty() && st.peek().ch == c) {
                st.peek().count++;

                if(st.peek().count == k) {
                    st.pop();
                }
            }else{
                st.push(new Pair(c,1));
            }
        }

        while(!st.isEmpty()) {
            Pair p = st.pop();

            for(int i=0;i<p.count;i++) {
                sb.append(p.ch);
            }
        }

        return sb.reverse().toString();
    }
}

