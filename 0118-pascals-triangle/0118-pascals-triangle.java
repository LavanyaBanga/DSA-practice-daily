import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int value = pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j);
                    row.add(value);
                }
            }

            pascalTriangle.add(row); 
        }

        return pascalTriangle;
    }
}
