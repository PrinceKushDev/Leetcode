class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ans : nums){
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }for(int res : map.keySet()){
            if(map.get(res) == 1){
                return res;
            }
        }return -1;
    }
}