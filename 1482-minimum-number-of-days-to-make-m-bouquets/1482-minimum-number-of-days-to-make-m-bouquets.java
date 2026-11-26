class Solution {
    public boolean NOB(int[] arr, int m , int k , int day){
          int count = 0; int BouqCount = 0;
          for(int j = 0; j < arr.length; j++){
            if( arr[j] <= day){
                count++;
            }else{
                BouqCount += count / k;
                count = 0;
            }
          }
          BouqCount += count / k;

          if(BouqCount >= m){
            return true;
          }else{
            return false;
          }
    }

    public int minDays(int[] arr, int m, int k) {
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            max = Math.max(arr[i] , max);
            min = Math.min(arr[i] , min);
        }  
        if((long) m * k > arr.length){
            return - 1;
        }
        int low = min;
        int high = max;
        //int ans = -1;
        while(low <= high){
            int mid =low + (high - low) / 2;
            if(NOB(arr, m , k ,mid) == true){
                //ans = mid;
               high = mid - 1; 
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}