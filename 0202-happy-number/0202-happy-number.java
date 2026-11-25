class Solution {
    public boolean isHappy(int n) {
        
        while(n != 1 && n != 4){
            int count = 0;
            while(n > 0){
            int ans = n % 10;
            int res = ans*ans;
            count += res;
            n = n /10;
        }
         n = count;
        }
            return n == 1;
    }
}