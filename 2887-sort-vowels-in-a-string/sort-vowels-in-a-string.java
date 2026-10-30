class Solution {
    public String sortVowels(String s) {
        List<Character> l = new ArrayList<>();
        int n = s.length();
        String s1 = "AEIOUaeiou";
        for(char c : s.toCharArray()) {
            if(s1.indexOf(c) != -1) {
                l.add(c);
            }
        }
        Collections.sort(l);
        int idx=0;
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++) {
            char ch = s.charAt(i);
            if(s1.indexOf(ch) != -1){
                sb.append(l.get(idx++));
            }else{
                sb.append(ch);
            }

        }
        return sb.toString();
    }
}