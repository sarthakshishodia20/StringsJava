class Solution {
    public String convert(String s, int numRows) {
        // Simple Simulation on Matrix Zig Zagly and first loop mein col ko constant rkho second loop ke andr column to increase krte jao because of zig zag motion 
        if (numRows == 1) {
            return s; 
        }
        String[][] matrix = new String[numRows][s.length()];
        int pointer = 0;
        int col = 0;
        while (pointer < s.length()) {
            for (int i = 0; i < numRows && pointer < s.length(); i++) {
                matrix[i][col] = String.valueOf(s.charAt(pointer));
                pointer++;
            }
            col++;
            for (int i = numRows - 2; i > 0 && pointer < s.length(); i--) {
                matrix[i][col] = String.valueOf(s.charAt(pointer));
                pointer++;
                col++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String[] mat : matrix) {
            for (String str : mat) {
                if (str == null) {
                    continue;
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
