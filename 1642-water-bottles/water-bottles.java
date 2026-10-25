class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int max = numBottles;
        // int empty= numBottles;
        // while(numBottles>=numExchange){
            
        //     int full = numBottles/numExchange;
        //      int rem = numBottles%numExchange;
        //      max =  max+ full;
        //      empty = full+rem; 
             
        // }
        // return max;

        return numBottles +(numBottles-1)/(numExchange-1);

    }
}