class Solution {
    public String reverseWords(String s) {
        String[] arr= s.split(" ");
        StringBuilder result=new StringBuilder();
        int i=0;
       while(i< arr.length){
           char[] num= arr[i].toCharArray();
           int start=0;
           int end= num.length-1;
           while(start<=end){
               char temp=num[start];
               num[start]=num[end];
               num[end]=temp;
               start++;
               end--;
           }
           i++;
           String n=new String(num);
          result.append(n);
          if(i!=arr.length){
        result.append(" "); 
          }
          
       }
       return result.toString();
         }

    }
