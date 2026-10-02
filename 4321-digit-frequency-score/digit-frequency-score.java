class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp = n;
        while(n>0) {
            int r = n % 10;
            map.put(r,map.getOrDefault(r,0)+1);
            n = n / 10;
        }
        int sum = 0;
        while(temp > 0) {
            int x = temp % 10;
            int a = map.getOrDefault(x,0);
            map.remove(x);
            sum += (x*a);
            temp = temp / 10;
        }
        return sum;
    }
}