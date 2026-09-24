class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for (int j=i;j<n;j++){
                sum= sum+nums[j];
                ans= Math.max(ans,sum);
            }
        }
        return ans;
    }
}