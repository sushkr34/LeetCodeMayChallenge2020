class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null) { return true; }
        if (magazine == null) { return false; }
        if (magazine.length() < ransomNote.length()) { return false; }
        HashMap<Character,Integer> mapCounter = new HashMap();
        HashMap <Character ,Integer > mapCounter1= new HashMap();
        for ( char c : magazine.toCharArray()){
            if ( mapCounter.get(c) != null){
                mapCounter.put(c,mapCounter.get(c)+1);
            }else {
            mapCounter.put(c,1);
            }
        }
        for ( char c : ransomNote.toCharArray()){
            if ( mapCounter1.get(c) != null){
                mapCounter1.put(c,mapCounter1.get(c)+1);
            }else {
            mapCounter1.put(c,1);
            }
        }
        for (char c : ransomNote.toCharArray()){
                if (mapCounter.get(c) == null || mapCounter.get(c) < mapCounter1.get(c) ){
                   return false ;
                }
        }
        return true;
    }
}