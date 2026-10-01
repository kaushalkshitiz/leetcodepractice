class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;int j=n;int z=0;
        int[] k=new int[2*n];
        while(i<n)
        {
        k[z]=nums[i];
        z++;
        k[z]=nums[j];
        i++;
        z++;
        j++;
        }return k;
    }
}