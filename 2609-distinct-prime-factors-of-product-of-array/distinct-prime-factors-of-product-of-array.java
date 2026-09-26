class Solution {
    public int distinctPrimeFactors(int[] nums) {
        //find prime factors each element in the array

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            List<Integer> list = primeFactor(num);
            for(int i=0;i<list.size();i++) {
                set.add(list.get(i));
            }
            
        }

        return set.size();
    }
    private List<Integer> primeFactor(int n) {
        List<Integer> l = new ArrayList<>();
        int count = 0;
        //Step 1
        while(n % 2 == 0) {
            n /= 2;
            count++;
        }
        if(count > 0) {
            l.add(2);
        }
        //Step 2

        for(int i =3; (i*i) <= n ; i+=2) {
            count = 0;
            while(n % i == 0) {
                n /= i;
                count++;
            }
            if(count > 0) {
                l.add(i);
            }
        }
        //Step 3
        if(n > 1) {
            l.add(n);
        }
        return l;
    }
}