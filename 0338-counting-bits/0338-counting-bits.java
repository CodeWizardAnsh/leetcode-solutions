class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        int count =0;
        for(int i=0;i<=n;i++) {
            int num = i;
            while (num > 0) {
                if ((num & 1) == 1) {
                    count++;
                }
                num = num >> 1;
                arr[i]=count;
            }
            count=0;
        }
       return arr;
    }
}