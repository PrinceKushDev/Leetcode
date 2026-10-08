class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
       HashMap<Integer , Integer> map = new HashMap<>();

       for (int i = 0 ; i < n; i++){
        map.put(arr[i] , map.getOrDefault(arr[i] , 0) +1 );
       }
       for(Map.Entry<Integer , Integer> it : map.entrySet()){
            if(it.getValue() > n/2){
            return it.getKey();
            }
       }
       return -1;
    }
}