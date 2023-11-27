class Solution {
    public int[] productExceptSelf(int[] nums) {
       
         int[] numsMult = nums;
        int indexOfZero=0 ;
        int mult=1;
        int elementZero=0;
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]==0){
                indexOfZero=i;
                elementZero++;
            }
            else{
                mult*=nums[i];
                
            }
        }
       
        if(elementZero==1){
             for (int j = 0; j < numsMult.length; j++) {
                        numsMult[j] = 0* numsMult[j];
                }
            numsMult[indexOfZero]=mult;
        }
        else if(elementZero>1){
            for (int j = 0; j < numsMult.length; j++) {
                        numsMult[j] = 0* numsMult[j];
                }
        }
        else{
            for (int j = 0; j < numsMult.length; j++) {
                        numsMult[j] = mult* 1/numsMult[j];
                }
        }
        return numsMult;
    }
}