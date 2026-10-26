class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int color : nums){
            if(color == 0)red++;
            else if(color == 1) white++;
            else blue++;
        }
        int p = 0;
        while(red != 0){
            nums[p] = 0;
            p++;
            red--;
        }
        while(white != 0){
            nums[p] = 1;
            p++;
            white--;
        }
        while(blue != 0){
            nums[p] = 2;
            p++;
            blue--;
        }
    }
}