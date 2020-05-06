class Solution {
    public int majorityElement(int[] nums) {
        int len =nums.length;
        if (len ==1){
            return nums[0];
        }
         HashMap<Integer,Integer> scoreboard = new HashMap<>(); 
        for (int i =0;i<len;i++){
            int temp = nums[i];
            if (scoreboard.containsKey(temp)) {
                scoreboard.put(temp, scoreboard.get(temp) + 1);
                if(scoreboard.get(temp) > (Math.floor(len/2))){
                    return (temp);
                }
            } else { 
                 scoreboard.put(temp, 1); 
            }
        }
        return -999999;
    }
}