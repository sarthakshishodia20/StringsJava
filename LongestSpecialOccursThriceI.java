class Solution {
    public int maximumLength(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                list.add(substring);
            }
        }
        for (String str : list) {
            if (specialString(str)) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        String ans = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();
            String str = entry.getKey();
            if (frequency >= 3 && str.length() > ans.length()) {
                ans = str;
            }
        }

        return ans.length() > 0 ? ans.length() : -1;
    }

    public static boolean specialString(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return set.size() == 1; 
    }
}
