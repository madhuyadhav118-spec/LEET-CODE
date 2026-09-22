class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int wg : weights){
            low = Math.max(low,wg);
            high += wg;
        }
        int res = 0;
        while(low <= high){
            int cap = low + (high - low)/2;
            if(canShip(weights,days,cap)){
                res = cap;
                high = cap - 1;
            }else{
                low = cap + 1;
            }
        }

        return res;
    }
    private boolean canShip(int weights[],int days,int cap){
        int day = 1;
        int currSum = 0;
        for(int w : weights){
            if(currSum + w > cap){
                day++;
                currSum = w;
            }else{
                currSum += w;
            }
        }
        return day<=days;
    }
}