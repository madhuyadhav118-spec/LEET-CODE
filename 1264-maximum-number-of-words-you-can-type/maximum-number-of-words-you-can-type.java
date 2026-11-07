class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : brokenLetters.toCharArray()) {
            set.add(ch);
        }
        String s[] = text.split(" ");
        int count = 0;
        
        for(String s1 : s) {
            boolean found = true;
            for(char c1 : s1.toCharArray()) {
                if(set.contains(c1)){
                    found = false;
                    break;
                }
            }
            if(found) {
                count++;
            }
        }
        return count;
    }
}