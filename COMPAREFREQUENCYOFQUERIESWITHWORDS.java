class Solution {
    private int frequencyOfSmallestChar(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char smallest = arr[0];
        int freq = 0;
        for (char c : arr) {
            if (c == smallest) freq++;
            else break;
        }
        return freq;
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans = new int[queries.length];
        int[] freqWords = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            freqWords[i] = frequencyOfSmallestChar(words[i]);
        }
        
        for (int i = 0; i < queries.length; i++) {
            int fq = frequencyOfSmallestChar(queries[i]);
            int count = 0;
            for (int fw : freqWords) {
                if (fq < fw) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
