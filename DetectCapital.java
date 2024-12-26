class Solution {
    public boolean detectCapitalUse(String word) {
        if (allLower(word)) {
            return true;
        } else if (allCapital(word)) {
            return true;
        } else if (onlyFirstCapital(word)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean allLower(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean onlyFirstCapital(String str) {
        char first = str.charAt(0);
        if (Character.isLowerCase(first)) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean allCapital(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
