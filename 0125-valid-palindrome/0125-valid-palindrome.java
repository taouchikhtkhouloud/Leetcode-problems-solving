class Solution {
    public boolean isPalindrome(String s) {
        //char uppercaseA = 'A';
        //int offset = 32;
        //char lowercaseA = (char) (uppercaseA + offset);
        
        
        int i=0;
        int j=s.length()-1;
        
        while(i<=j){
            char firstch = s.charAt(i);
            char lastch = s.charAt(j);
            if(!Character.isLetterOrDigit(firstch)){
                i++;
            }
            else if(!Character.isLetterOrDigit(lastch)){
                j--;
            }
            else{
                if(Character.toLowerCase(firstch)== Character.toLowerCase(lastch)){

               i++;
               j--;
           
                }
           else {
               return false;
           }
            }
           
        }
        return true;

    }
}