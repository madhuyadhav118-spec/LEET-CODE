class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // int n = arr1.length;
        // int m = arr2.length;
        // int count = 0;
        // int idx = -1;
        // for(int i =0; i < n ; i++) {
        //     int j =0;
        //     for( j = 0; j < m; j++) {
                
        //         if(Math.abs(arr1[i]- arr2[j]) <= d) {
        //             break;
        //         }
               
        //     }
        //      if(j == m) {
        //         count++;
        //     }
            
        // }
        // return count;
        int count = 0;
        for(int a1 : arr1) {
            boolean isValid = true;
            for(int a2 : arr2) {
                if(Math.abs(a1-a2) <= d) {
                    isValid = false;
                    break;
                }
            }
            if(isValid) {
                count++;
            }
        }
        return count;
    }
}