class Solution {
    public int removeElement(int[] nums, int val) {
        /* if(nums.length==0){
            return 0;
        }
        else if(nums.length==1){
            if(val==nums[0]){
                nums[0]=1000;
                return 0;
            }
            return 1;
        }
        else{

        Arrays.sort(nums);
        int n = (nums.length +1)/2;
        int count=0;
        if(nums[n]>val){
            for(int i=0;i<n;i++){
                if(nums[i]>val){
                    break;
                }
                else if(nums[i]==val){
                    count++;
                     nums[i]=1000;
                }
               
            }
             Arrays.sort(nums);
        }
        else if(nums[n]<val){
            for(int i=nums.length-1;i>=n;i--){
                if(nums[i]<val){
                    break;
                }
                else if(nums[i]==val){
                    count++;
                    nums[i]=1000;
                }
            }
             Arrays.sort(nums);
        }
        else{
            count++;
             nums[n]=1000;
             count=count -removeElement( nums,  val)+nums.length;
        }
       System.out.println(nums.length-count);
              return nums.length-count;
       
        
        } */
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}