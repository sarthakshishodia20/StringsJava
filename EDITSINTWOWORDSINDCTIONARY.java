class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (String query : queries) {
            for (String dictWord : dictionary) {
                if (isTwoEditsAway(query, dictWord)) {
                    ans.add(query);
                    break; 
                }
            }
        }
        return ans;
    }
    public static boolean isTwoEditsAway(String a, String b) {
        if (a.length() != b.length()) return false;
        int diffCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffCount++;
                if (diffCount > 2) return false;
            }
        }
        return true; 
    }
}
