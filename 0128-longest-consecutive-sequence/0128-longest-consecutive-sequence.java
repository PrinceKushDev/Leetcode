class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int Longest = 0;
        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            int Element = num;
            int count = 1;

            if (!set.contains(Element - 1)) {
            while(set.contains(Element + 1)){
                count++; Element++; 
            }
            }
            Longest = Math.max(Longest, count);
        }
        return Longest;
    }
}