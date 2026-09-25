class Solution {
    public String interpret(String command) {
        int n = command.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n ; i++) {
            char c = command.charAt(i);
            if(c == 'G') {
                sb.append('G');
            }else if(c == '(')  {
                if(command.charAt(i+1) == ')') {
                    sb.append('o');
                    i++;
                }else  {
                    sb.append("al");
                    i+=3;
            }
                
            }
        }
        return sb.toString();
    }
}