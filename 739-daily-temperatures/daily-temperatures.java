class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        /* Brute Force
        int ans[] = new int[n];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(temp[j]>temp[i]){
                ans[i] = j-i;
                break;
                }
            }
        } */
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1;i>-1;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i] = stack.peek()-i;
            }
            stack.push(i);
        } 
        return ans;
    }
}