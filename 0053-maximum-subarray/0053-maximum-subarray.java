class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        int sum=0;
        for(int val:nums)
        {
            sum+=val;
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
            }
        return ans;
    }
}