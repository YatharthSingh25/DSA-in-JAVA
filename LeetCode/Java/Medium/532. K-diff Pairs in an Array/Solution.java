class Solution {
    public int findPairs(int[] nums, int k) {

        if(k<0){
            return 0;
        }
        int n = nums.length;
        Arrays.sort(nums);
        int right=1;
        int left=0;
        int count=0;

        while (right < n) {
            if (left == right) {
                right++;
                continue;
            }
            int diff = Math.abs(nums[left] - nums[right]);
            if (diff < k) {
                right++;
            } 

            else if (diff > k) {
                left++;
            } else {
                count++;
            int a = nums[left];
            int b = nums[right];
            
            while (left < n && nums[left] == a) {
                    left++;
                }
                while (right < n && nums[right] == b) {
                    right++;
                }
            }
        }
        return count;

        
    }
}