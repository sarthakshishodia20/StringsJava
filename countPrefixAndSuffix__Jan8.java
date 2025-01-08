class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String str1=words[i];
            for(int j=i+1;j<words.length;j++){
                String str2=words[j];
                if(validHai(str1,str2)){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean validHai(String str1,String str2){
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}
