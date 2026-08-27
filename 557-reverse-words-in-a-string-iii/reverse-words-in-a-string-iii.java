class Solution {
    public String reverseWords(String s) {
        String s1[] = s.split(" ");
        StringBuilder s2 = new StringBuilder();
        for(int i =0; i < s1.length;i++) {
            int left = 0;
            int right = s1[i].length()-1;
            s2.append(reverse(left,right,s1[i]));
            if(i != s1.length-1) {
                s2.append(" ");

            }
                
            

        }
        return s2.toString();
       
    }
    private String reverse(int left , int right,String str) {
        char ch[] = str.toCharArray();

        while(left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;

        }
        return new String(ch);
    }
}