class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int len = requests.length;
        int curr = 0;
        int res = 0;
        for(int i = 0; i < len; i++) {
            res += Math.abs(requests[i] - curr);
            curr = requests[i];
        }
        return res;
    }
}