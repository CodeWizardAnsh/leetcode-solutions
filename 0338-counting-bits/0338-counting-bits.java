class Solution {
    public int[] countBits(int n) {
       int[]arr=new int[n+1];
       int index=0;
       for(int i=0;i<=n;i++){
           int temp=i;
           int count = 0;
           while (temp != 0) {
               count++;
               temp = temp - (temp & -temp);
           }
               arr[i] = count;

       }
       return arr;
    }
}