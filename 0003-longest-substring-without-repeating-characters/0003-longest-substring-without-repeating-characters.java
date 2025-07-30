class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder result=new StringBuilder();
        int start=0;
        int length=0;
        int ans =0;
      for(int i =0;i<s.length();i++){
          char c = s.charAt(i);
          if(s.length()!=0&& ( (result.indexOf(String.valueOf(c)) == -1) )){
              result.append(c);
              length=result.length();
              ans=Math.max(length,ans);
          }
          else{
              i=start;
              start++;
              result.setLength(0);
          }

      }
        return ans;


    }
}

    