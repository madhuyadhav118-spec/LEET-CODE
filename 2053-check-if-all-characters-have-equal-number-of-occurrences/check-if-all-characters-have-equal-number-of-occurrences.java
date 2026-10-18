class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char c1[] = s.toCharArray();
        for(char ch : c1) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean flag = true;
        int freq = map.get(c1[0]);
        for(int i=1;i<c1.length;i++) {
            if(map.get(c1[i]) == freq) {
                flag = true;
            }else{
                flag = false;
                break;
            }

        }
        return flag;
    }
}