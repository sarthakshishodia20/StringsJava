class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int spaceIndex = 0;
        int spacesLength = spaces.length;
        
        for (int i = 0; i < s.length(); i++) {
            if (spaceIndex < spacesLength && i == spaces[spaceIndex]) {
                sb.append(' ');
                spaceIndex++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
