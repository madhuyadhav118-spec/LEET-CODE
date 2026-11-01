class Solution {
    public int minSwaps(String s) {
        int bal = 0;
        int maxImbal = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '[') {
                bal++;
            }else{
                bal--;
            }

            maxImbal = Math.max(maxImbal,-bal);
        }
        return (maxImbal + 1)/2;
    }
}