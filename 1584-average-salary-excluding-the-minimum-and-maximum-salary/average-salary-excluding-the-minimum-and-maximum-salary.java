class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int s : salary) {
            max = Math.max(s,max);
            min = Math.min(s,min);
            sum += s;
        }
        
        sum = sum -max-min;
        return (double)sum/(n-2);
        
    }
}