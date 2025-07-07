class Solution {
    public boolean isPalindrome(String s) {
        String Ls= s.toLowerCase();
        String result = Ls.replace(" ", "");
  StringBuilder ans=new StringBuilder();
        for(char c:result.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                ans.append(c);
            }
        }
        if(ans.toString().equals(ans.reverse().toString())){
            return true;
        }
        return false;
       
    }
}

    