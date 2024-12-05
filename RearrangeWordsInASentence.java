class Solution {
    static class Pair implements Comparable<Pair> {
        String str;
        int length;
        int index;
        public Pair(String str, int length, int index) {
            this.str = str;
            this.length = length;
            this.index = index;
        }
        @Override
        public int compareTo(Pair p2) {
            if (this.length != p2.length) {
                return this.length - p2.length;
            }
            return this.index - p2.index;
        }
    }

    public String arrangeWords(String text) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            pq.add(new Pair(arr[i], arr[i].length(), i));
        }
        StringBuilder sb = new StringBuilder();
        boolean isFirstWord = true;
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            String word = current.str;
            if (isFirstWord) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                isFirstWord = false;
            } else {
                word = word.toLowerCase();
            }
            sb.append(word);
            if (!pq.isEmpty()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
