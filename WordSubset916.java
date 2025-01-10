class Solution {
    // Brute Force Approach-> ek list bnate uske andr string or hashmap bnate hrr string ka or frequency count krte fir word2 ke hrr string se check krwate ki valid hai ya nahi hai
    // Iss approach mein hmne atleast frequency ki ek array bnai mtlb ki itne toh hone hi chahiye character order matter nahi kryta hai uske alava baari baari hrr ek word ki frequency se maxfrequency nikali or word1 array ke andr check kia ki uske temp ki value agr required max frequency ke requirement se small hai tb toh nahi kr paega vo universal vrna kr jaega
    
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFrequency=new int[26];
        for(String str:words2){
            int[] temp=new int[26];
            for(int i=0;i<str.length();i++){
                temp[str.charAt(i)-'a']++;
            }
            for(int i=0;i<maxFrequency.length;i++){
                maxFrequency[i]=Math.max(temp[i],maxFrequency[i]);
            }
        }
        List<String> ans=new ArrayList<>();
        for(String str:words1){
            String wordRequired=str;
            int[] temp=new int[26];
            for(int i=0;i<wordRequired.length();i++){
                temp[wordRequired.charAt(i)-'a']++;
            }
            boolean haiYanai=true;
            for(int i=0;i<temp.length;i++){
                if(temp[i]<maxFrequency[i]){
                    haiYanai=false;
                    break;
                }
            }
            if(haiYanai){
                ans.add(wordRequired);
            }
        }
        return ans;
    }
}
