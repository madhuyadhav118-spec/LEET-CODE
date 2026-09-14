class Solution {
    public String sortString(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0; i<s.length();i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        while(!map.isEmpty()) {
            for(char c1 = 'a'; c1 <= 'z' ; c1++) {
                if(map.containsKey(c1)) {
                    sb.append(c1);
                    map.put(c1,map.get(c1)-1);
                    if(map.get(c1) == 0) {
                        map.remove(c1);
                    }
                }
            }

            for(char c2 = 'z'; c2 >= 'a' ; c2--) {
                if(map.containsKey(c2)) {
                    sb.append(c2);
                    map.put(c2,map.get(c2)-1);
                    if(map.get(c2) == 0) {
                        map.remove(c2);
                    }
                }
            }

        }
        return sb.toString();
    }
}