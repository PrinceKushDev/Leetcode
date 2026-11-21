class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length - 1;
        int CurrSum = 0; int MaxSum = Integer.MIN_VALUE;
        for(int st = 0; st <= n; st++){
            CurrSum += nums[st];
            MaxSum = Math.max(CurrSum, MaxSum);
            if(CurrSum < 0){
                CurrSum = 0;
            }
        } 
        return MaxSum;
    }
}