class Solution {
    public boolean isPossible(int arr[], int d, int mid){
        int load = 0;
        int days = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]+load<=mid){
                load+=arr[i];
            }
            else{
                load = arr[i];
                days++;
            }
        }
        if(days<=d) return true;
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<weights.length;i++)
        {
            max = Math.max(weights[i],max);
            sum+= weights[i];
        }
        
        
        int low= max;
        int high =sum;
        int ans = 0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(isPossible(weights,days,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;
    }
}