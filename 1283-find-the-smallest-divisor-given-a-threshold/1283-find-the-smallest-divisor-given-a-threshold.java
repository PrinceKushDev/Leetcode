class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1; int high = 0; int ans = 0;
        for(int i = 0; i < nums.length; i++){
            high = Math.max(nums[i],high);
        }
        while(low <= high){
            int mid = (low + high) / 2;
            if(SumOfDivisor(nums, mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int SumOfDivisor(int[] nums , int divisor){
        int sum = 0;
        for(int k = 0; k < nums.length; k++){
            sum += (int) Math.ceil((double) nums[k] / divisor);
        } return sum;
    }
}