class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int f : friends) {
            set.add(f);
        }
        int a[] = new int[friends.length];
        int idx = 0;
        for(int x : order) {
            if(set.contains(x)) {
                a[idx++] = x;
            }
        }
        return a;
    }
}