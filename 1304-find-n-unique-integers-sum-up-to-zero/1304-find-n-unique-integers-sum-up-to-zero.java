class Solution {
    public int[] sumZero(int n) {
        int positive=1;
        int negative =-1;
        int arr[]=new int[n];
        if(n%2!=0){arr[n-1]=0;n=n-1;}
        for(int i=0;i<n;i=i+2)
        { 
            arr[i]=positive;
            arr[i+1]=negative;
            positive++;
            negative--;
        }return arr;

    }
}