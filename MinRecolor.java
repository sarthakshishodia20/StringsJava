class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minOperation = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int operation = countOperation(blocks.substring(i, i + k));
            minOperation = Math.min(minOperation, operation);
        }
        return minOperation;
    }

    public static int countOperation(String sub) {
        int count = 0;
        for (char ele : sub.toCharArray()) {
            if (ele == 'W') {
                count++;
            }
        }
        return count;
    }
}
