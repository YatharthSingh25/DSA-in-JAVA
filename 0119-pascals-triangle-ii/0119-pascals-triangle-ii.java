class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            int val=ncr(rowIndex, i);
            ans.add(val);
        }
        return ans;
        
    }

    public int ncr(int n, int r){
        long res=1;
        for(int i=0; i<r; i++){
            res= res*(n-i);
            res= res/(i+1);
        }
        return (int)res;
    }
}