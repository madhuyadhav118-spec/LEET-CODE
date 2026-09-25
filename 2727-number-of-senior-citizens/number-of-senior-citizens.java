class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s1 : details){
            char c1 = s1.charAt(11);
            char c2 = s1.charAt(12);
            String s = ""+ c1 + c2;
            int a = Integer.parseInt(s);
            if(a > 60) {
                count++;
            }

        }

        return count;
    }
}