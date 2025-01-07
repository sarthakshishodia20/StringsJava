class Solution {
    public List<String> printVertically(String s) {
        // Jitni maximum length hogi kisi word ki vhi hmare number of columns bnenge or jitna size hmare array ka hoga utne hmare rows bnenge put them all into a matrix of above length and baari baari column ko traverse krke string bnake add krte jao last mein trim krna pdega because length sbki equal nahi hai uske liye ek method hai ye
        // Ye hmare last se whitespaces remove krta hai dono trf se krne ke liye trim() method chl jaega 
        // .replaceAll("\\s+$","");
        // starting se krne ke liye ("^\\s+$") isko use kro
        int maxLength = Integer.MIN_VALUE;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            maxLength = Math.max(arr[i].length(), maxLength);
        }
        char[][] mat = new char[arr.length][maxLength];
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            for (int j = 0; j < maxLength; j++) {
                if (j < word.length()) {
                    mat[i][j] = word.charAt(j);
                } else {
                    mat[i][j] = ' ';
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (int j = 0; j < maxLength; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(mat[i][j]);
            }
            list.add(sb.toString().replaceAll("\\s+$", ""));
        }
        return list;
    }
}
