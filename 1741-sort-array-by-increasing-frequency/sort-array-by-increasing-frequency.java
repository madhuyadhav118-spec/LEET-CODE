class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
         int n = nums.length;
        Integer arr[] = new Integer[n];
        for(int i =0;i<n;i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr,(a,b)->{
            // When Frequency Is Equals Then Return Large Number First
            if(map.get(a)== map.get(b)) { 
                return b-a;
            }
            //Return The Number With Min Frequency
            return map.get(a)-map.get(b);
        });
        for(int i =0;i<n;i++){
            nums[i] = arr[i];
        }
        return nums;
    }
}
 // List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        // //Sorting The List Based On The Frequency

        // list.sort((a,b)->a.getValue()-b.getValue());
        
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
        //     arr[idx++] = entry.getKey();
        // }
        // return arr;