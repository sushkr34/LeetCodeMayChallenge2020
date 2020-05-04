public class Solution {
    public  int findComplement(int num) {
       
       if( num ==0){
           return 1;
       }
       if (num ==1){
           return 0;
       }
       String str = (Integer.toBinaryString(num));
       String str1 ="";
       for(int i=0 ;i< str.length();i++ ){
          char ch = str.charAt(i);
           if ( ch == '0') str1+='1';
           else str1+='0';
       }
       int  n = (Integer.parseInt(str1,2));
       return n;}
 
   
}
