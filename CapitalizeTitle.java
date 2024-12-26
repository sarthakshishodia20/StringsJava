class Solution {
    public static String changeAllSmall(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    public static String CapitalFirst(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char first = str.charAt(0);
        char ch = Character.toUpperCase(first);
        sb.append(ch);
        sb.append(str.substring(1).toLowerCase());
        return sb.toString();
    }

    public String capitalizeTitle(String title) {
        if (title == null || title.isEmpty()) {
            return title;
        }
        String[] arr = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            if (str.length() <= 2) {
                sb.append(changeAllSmall(str));
            } else {
                sb.append(CapitalFirst(str));
            }
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
