class Solution {
    public String reversePrefix(String s, int k) {

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        // int i =0;
        // int j = k-1;
        // while(i < j) {
        //     char temp  = s.charAt(i);
        //     sb.insert(i,s.charAt(j));
        //     sb.insert(j,temp); 
        //     i++;
        //     j--;
        // }

        for(int i = k-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }

        while(k < n) {
            sb.append(s.charAt(k));
            k++;
        }

        //sb.append(s.substring(k));


        return sb.toString();
    }
}