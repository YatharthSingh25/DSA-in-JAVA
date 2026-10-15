class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
//         for(int i=0; i<n; i++){
//             for(j=i+1; j<n; j++){
//                 if(nums[i] + nums[j] ==target){
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{};

        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
            int curr=nums[i];
            int left=target-curr;
            if(map.containsKey(left)){
                return new int[]{map.get(left), i};
            }
            map.put(curr, i);
        }
        return new int[]{-1, -1};
     }
 }