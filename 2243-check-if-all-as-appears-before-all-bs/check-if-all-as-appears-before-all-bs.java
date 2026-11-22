class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        // char ch[] = s.toCharArray();
        // Arrays.sort(ch);
        // for(int i = 0;i < n;i++) {
        //     if(ch[i] != s.charAt(i)) {
        //         return false;
        //     }
        // }
        // return true;  
        if(s.contains("ba")) {
            return false;
        }else{
            return true;
        }
    }
}