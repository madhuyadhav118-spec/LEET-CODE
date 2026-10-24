class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);

        Deque<Integer> q = new ArrayDeque<>();

        for(int i = n-1;i>=0;i--) {

            if(!q.isEmpty()) {
                q.addFirst(q.removeLast());
            }

            q.addFirst(deck[i]);
        }

        int a[] = new int[n];
        for(int i = 0; i<n;i++) {
            a[i] = q.removeFirst();
        }
        return a;
    }
}