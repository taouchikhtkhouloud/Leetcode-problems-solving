class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        Set<Integer> uniqueNum = new HashSet<>();
        if(nums.length==0){
            return 0;
        }
        else if(nums.length==1){
            return 1;
        }
        else{
            
            for(int i=0 ; i<nums.length ; i++){
                if(uniqueNum.contains(nums[i])){
                    nums[i]= Integer.MAX_VALUE;
                }
                else{
                    uniqueNum.add(nums[i]);
                    k++;
                }
            }
            Arrays.sort(nums);
            return k;
        }
    }
}