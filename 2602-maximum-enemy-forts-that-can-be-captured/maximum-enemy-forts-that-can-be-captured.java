class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int count = 0;
        int max = 0;
        int prev = -1;
        for(int i=0;i<n;i++) {
            if(forts[i] != 0) {
                if(prev !=-1 && forts[i] != forts[prev]) {
                    max = Math.max(max,i-prev-1);
                }
                prev = i;
            }
        }
       
        return max;
    }
}