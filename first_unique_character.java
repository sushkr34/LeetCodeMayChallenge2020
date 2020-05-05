class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character,Integer> scoreboard = new HashMap<>(); 
        char ch='\0';
        boolean flag=false;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i); 
        if (scoreboard.containsKey(c)) {
            scoreboard.put(c, scoreboard.get(c) + 1);
        } else { 
            scoreboard.put(c, 1); 
        }
    } 
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            if (scoreboard.get(c) == 1) {
              ch=c;
                flag=true;
                break;
                
            } 
        }
        if (flag==true){
            return ( s.indexOf(ch));
        }
        return 0;
    

    }
}