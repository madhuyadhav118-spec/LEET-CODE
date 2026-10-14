class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int sq = (int)Math.sqrt(n);

        for(int i=1; i<=sq;i++) {
            if(n % i ==0) {
                list.add(i);
                if(list.size()==k) {
                    return i;
                }
            }
        }
        if(sq * sq == n) {
            sq--;
        }

        for(int i=sq;i>=1;i--) {
            if(n%i ==0) {
                int b = n/i;
                list.add(b);
                if(list.size() == k) {
                    return b;
                }
            }
        }
        
        return -1;
    }
}