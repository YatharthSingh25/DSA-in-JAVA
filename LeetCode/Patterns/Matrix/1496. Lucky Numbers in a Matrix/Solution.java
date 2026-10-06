class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int num = matrix[i][0];
            int col = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < num) {
                    num = matrix[i][j];
                    col = j;
                }
            }

            boolean lucky = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][col] > num) {
                    lucky = false;
                    break;
                }
            }

            if (lucky) {
                ans.add(num);
            }
        }

        return ans;
    }
}