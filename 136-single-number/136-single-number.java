class Solution {
    public int singleNumber(int[] nums) {
        
        int length = nums.length;
        if(length==1) return nums[0];
        Arrays.sort(nums);
        if(nums[1]!=nums[0]) {
            return nums[0];
        }
        if (nums[length-1]!=nums[length-2]){ 
            return nums[length-1];
        }
        for(int i=1; i<length-1; i++){
            if(nums[i]!=nums[i-1] && nums[i]!= nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}