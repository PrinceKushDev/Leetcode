class Solution {
    public int mySqrt(int x) {
        long low = 1; long high = x; int ans = 1;
        if(x == 1 || x == 0){
            return x;
        }
        while(low <= high){
            long mid = (low + high) / 2;
            long Mul = mid * mid;
            if(Mul<= x){
                low = (int) mid +1;
                 ans = (int) mid;
            }else {
                high =(int) mid - 1;
            }
        }return ans;
     } 
}
