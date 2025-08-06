class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i< arr.length;i++){
            list.add(arr[i]);
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
            if(count>1){
                return true;
            }
            
        for(int i =0;i< arr.length;i++){
            if(list.contains(arr[i]*2)&arr[i]!=0)
            {
                return true;
            }
     

    }
      return false;
}
}

    