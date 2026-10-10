class Solution {
    public boolean canAliceWin(int[] nums) {
        int count1=0;
        int count2=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>9){
                count1 += nums[i];
            }else{
                count2 += nums[i];
            }
        }
        return count1 != count2;
    }
}