class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length - 1;
        int P1 = 0;
        int P2 = 1;
        while(P1 <= n && P2 <= n){
            if(nums[P1] % 2 == 0){
                P1 = P1+2;
            }
             else if(nums[P2] % 2 != 0){
                P2 = P2+2;
            }else{
                int temp = nums[P1];
            nums[P1] = nums[P2];
            nums[P2] = temp;
             P1+=2;
            P2+=2;
            }
        }
        return nums;
    }
}