class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int m = popped.length;
        if(m== 0) {
            return false;
        }
        Stack<Integer> st = new Stack<>();
        
        int i=0,j=0;
        while(i<n && j<m) {
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek() == popped[j]) {
                    st.pop();
                    j++;
            }
            i++;
        }
        return st.isEmpty();

    }
}