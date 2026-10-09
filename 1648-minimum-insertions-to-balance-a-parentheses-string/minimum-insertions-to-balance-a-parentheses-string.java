class Solution {
    public int minInsertions(String s) {
        int res = 0;
        int req = 0;

        for(int i =0;i<s.length();i++) {
            
            if(s.charAt(i) == '(') {
                req += 2;

                if(req % 2 != 0) {
                    res++;
                    req--;
                }
            }else{
                req--;

                if(req < 0) {
                    res++;
                    req = 1;
                }
            }
        }
        return res+req;
    }
}