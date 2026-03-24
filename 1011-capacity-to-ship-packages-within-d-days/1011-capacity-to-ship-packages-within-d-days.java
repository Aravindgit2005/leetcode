import java.util.*;

class Solution {

    public int daysneeded(int[] w, int cap){
        int day = 1;
        int load = 0;

        for(int i = 0; i < w.length; i++){
            if(load + w[i] > cap){
                day++;
                load = w[i];
            } else {
                load += w[i];
            }
        }
        return day;
    }

    public int shipWithinDays(int[] w, int days){

        int left = Arrays.stream(w).max().getAsInt();
        int right = Arrays.stream(w).sum();

        int ans = right;

        while(left <= right){

            int mid = left + (right - left) / 2;

            int needed = daysneeded(w, mid);

            if(needed <= days){
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}