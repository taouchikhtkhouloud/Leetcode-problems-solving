class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int max=0;
        int index=0;
       

        for(int i=0 ; i<nums.length;i++){
            if(!count.containsKey(nums[i])){
                count.put(nums[i],1);
                if(max<count.get(nums[i])){
                    max=count.get(nums[i]);
                    index=nums[i];
                }
            }
            else{
                count.put(nums[i],count.get(nums[i])+1);
                if(max<count.get(nums[i])){
                    max=count.get(nums[i]);
                    index=nums[i];
                }
            }
        } 
        return index;
        }
           
}