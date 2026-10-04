class Solution {
    public String addSpaces(String s, int[] spaces) {

        StringBuilder sb = new StringBuilder();
        int m = spaces.length;
        int sIdx = 0;

        for(int i =0;i<s.length();i++) {
            
            if(sIdx < m && i == spaces[sIdx]) {
                sb.append(" ");
                sIdx++;
            }
            sb.append(s.charAt(i));
        }
       return  sb.toString();
    }
}