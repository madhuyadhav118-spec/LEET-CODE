class Solution {
    public boolean canAliceWin(int n) {
        int t = 10;
        boolean win = true;
        while(n >= t && t > 0) {
            n-=t;
            t--;
            win = !win;
        }
        return !win;
    }
}