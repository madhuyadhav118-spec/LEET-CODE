class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        int mv = 0;
        int mc = 0;

        for(int i =0;i<n;i++) {
            char c1 = s.charAt(i);
            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
                mv = Math.max(mv,map.get(c1));
            }else{
                mc = Math.max(mc,map.get(c1));
            }
        }
        return mc + mv;
    }
}