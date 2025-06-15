class Solution {
    public int maxDiff(int num) {
        String original = Integer.toString(num);
        char digitToMax = ' ';
        for (char c : original.toCharArray()) {
            if (c != '9') {
                digitToMax = c;
                break;
            }
        }
        String maxStr = original;
        if (digitToMax != ' ') {
            maxStr = original.replace(digitToMax, '9');
        }
        String minStr = original;
        char digitToMin = original.charAt(0);
        char replaceWith = '1';
        if (digitToMin == '1') {
            for (int i = 1; i < original.length(); i++) {
                if (original.charAt(i) != '0' && original.charAt(i) != '1') {
                    digitToMin = original.charAt(i);
                    replaceWith = '0';
                    break;
                }
            }
        }
        minStr = original.replace(digitToMin, replaceWith);
        int max = Integer.parseInt(maxStr);
        int min = Integer.parseInt(minStr);
        return max - min;
    }
}
