import java.util.*;

public class Solution {
    public List<Integer> luckyNumbers (int[][] mat) {
        for (int[] r : mat) {
            int min = r[0], c = 0, i = 0;
            for (int j = 1; j < r.length; j++) if (r[j] < min) { min = r[j]; c = j; }
            for (; i < mat.length; i++) if (mat[i][c] > min) break;
            if (i == mat.length) return Arrays.asList(min);
        }
        return new ArrayList<>();
    }
}
