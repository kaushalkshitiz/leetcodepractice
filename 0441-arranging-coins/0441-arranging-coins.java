class Solution {
    public int arrangeCoins(int n) {
        int low=1;
        int high=n;
        int ans=0;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            long needed=mid*(mid+1)/2;
            if(needed==n)
            {
                return (int) mid;
            }
            else if(needed<n){low=(int)mid+1;}
            else {high=(int)mid-1;}
        } 
        return (int)high;
    }
}