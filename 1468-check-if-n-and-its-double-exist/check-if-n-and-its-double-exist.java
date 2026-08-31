class Solution {
    public boolean checkIfExist(int[] arr) {
     HashSet<Integer> set = new HashSet<>();
    for(int a:arr){

        if(set.contains(2*a) || (a%2==0 && set.contains(a/2))) {
            return true;
        }
        set.add(a);
        
    }
   
    return false;
    }
}