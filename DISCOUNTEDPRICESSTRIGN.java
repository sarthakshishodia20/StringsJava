class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] arr = sentence.split(" ");
        ArrayList<String> list = newa ArrayList<>();
        for (String str : arr) {
            if (str.charAt(0) == '$' && str.length() > 1 && isValidStrHai(str.substring(1))) {
                list.add(str);
            }
        }
        ArrayList<String> converted = new ArrayList<>();
        for (String str : list) {
            String convert = getDiscountedPrice(str, discount);
            converted.add(convert);
        }
        StringBuilder sb = new StringBuilder();
        int ind = 0;
        for (String str : arr) {
            if (str.charAt(0) == '$' && str.length() > 1 && isValidStrHai(str.substring(1))) {
                sb.append(converted.get(ind++));
            } else {
                sb.append(str);
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
    public static String getDiscountedPrice(String str, int discount) {
        long num = 0;
        int index = 1;
        while (index < str.length()) {
        num = (num * 10) + (str.charAt(index) - '0');  
        index++;
        }
        double discounted = num * (100 - discount) / 100.0;
        return "$" + String.format("%.2f", discounted);
    }
    public static boolean isValidStrHai(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
