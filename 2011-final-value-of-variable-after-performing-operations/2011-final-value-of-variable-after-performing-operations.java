class Solution {
    public int finalValueAfterOperations(String[] s) {
        int ans = 0;

        for(int i = 0; i < s.length; i++){
            if(s[i].equals("--X")){
                ans -= 1;
            }else if(s[i].equals("X--")){
                ans -= 1;
            }else if(s[i].equals("++X")){
                ans += 1;
            }else{
                ans += 1;   
            }
        }
        return ans;
    }
}