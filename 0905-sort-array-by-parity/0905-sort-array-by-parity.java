class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                answer.add(nums[i]);
            }
        }
        for(int j = 0; j < n; j++){
            if(nums[j] % 2 != 0){
                answer.add(nums[j]);
            }
        }
        int[] result = new int[answer.size()];
        for(int k = 0; k < answer.size(); k++){
            result[k] = answer.get(k);
        }
         return result;
    }
   
}