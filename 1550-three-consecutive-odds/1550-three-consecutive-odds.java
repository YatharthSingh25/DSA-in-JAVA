class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        boolean odd = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0 && count < 2){
                count++;
            }
            else if(arr[i] % 2 != 0 && count == 2){
                return odd = true;
            }
            else if(arr[i] % 2 == 0){
                count = 0;
            }
        }
        return odd;
    }
}
