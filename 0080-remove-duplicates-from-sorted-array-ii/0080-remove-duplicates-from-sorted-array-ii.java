class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i=0 ; i<nums.length;i++){
            if(!count.containsKey(nums[i])){
                count.put(nums[i],1);
        
                    nums[index]=nums[i];
                    index++;
                
            }
            else{
                if(count.get(nums[i])<=1){
                    nums[index]=nums[i];
                    index++;
                    count.put(nums[i],count.get(nums[i])+1);
                }
            }
        }
        return index;
    }
}