class Solution {
    public int singleNonDuplicate(int[] nums) {
         HashMap<Integer,Integer> mapCounter = new HashMap();
        int len= nums.length;
        int val=0;
        if (len ==0){
            return -99999;
        }
        for (int i =0;i<len;i++){
            int c = nums[i];
           if ( mapCounter.get(c) != null){
                mapCounter.put(c,mapCounter.get(c)+1);
            }else {
            mapCounter.put(c,1);
            } 
        }
        for (int i=0 ;i< len ;i++){
            int c = nums[i];
            if(mapCounter.get(c)==1){
                val= c;
                break;
            }            
        }
        return val;
    }
}