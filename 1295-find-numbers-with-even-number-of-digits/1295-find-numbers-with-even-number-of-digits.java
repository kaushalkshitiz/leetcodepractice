class Solution {
    public int findNumbers(int[] nums) {
       int n1=0;
       int c=0;
       for(int i =0;i<nums.length;i++){
        int k=nums[i];
        c=(k+"").length();
        if(c%2==0){n1+=1;}
       } return n1;
    }
}