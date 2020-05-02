class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        int lenJ = J.length();
        int lenS= S.length();
        int ctr =0;
        if ( lenJ > 50 || lenS > 50 ) return 0;
        
        HashMap<Character,Integer> mapCounter = new HashMap();
        for ( char c : S.toCharArray()){
            if ( mapCounter.get(c) != null){
                mapCounter.put(c,mapCounter.get(c)+1);
            }else {
            mapCounter.put(c,1);
            }
        }
        for (char c : J.toCharArray()){
                if (mapCounter.get(c) != null){
                    count += mapCounter.get(c);
                }
        }
        
        return count ;
    }
}