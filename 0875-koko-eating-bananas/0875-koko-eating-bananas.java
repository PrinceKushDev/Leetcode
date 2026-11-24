class Solution {
    public long CalSum(int[] nums, int divisor){
        long sum = 0;
        for(int k = 0; k < nums.length; k++){
           sum += Math.ceil((double) nums[k] / divisor);
        } return  sum;
    }
    public int minEatingSpeed(int[] nums, int h) {
        int low = 1; int high = 0; int ans = -1;
        for(int i = 0; i < nums.length; i++){
            high = Math.max(high , nums[i]);
        }
        while(low <= high){
            int mid = (low + high) / 2;
             if(CalSum(nums , mid) <= h){
                ans = mid;
                high =  mid - 1;
            } else{
                low =  mid + 1;
            }
        } return  ans;
    }
}