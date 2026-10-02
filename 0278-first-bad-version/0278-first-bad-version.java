/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low =1; 
        int high=n;
        boolean x=false; 
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            x=isBadVersion(mid);
            if(x==true)
                {
                high=mid-1;
                }
            else
            {
                low=mid+1;ans=mid;
            }
        }
        return ans+1;
    }
}