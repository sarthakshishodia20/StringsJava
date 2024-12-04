class Solution {
    // isme subsequence bnana hai str2 ko toh baari baari str1 pr loop krenge hrr ek character jo str2 se match ho rha hai usko skip krke jo match nahi ho rhe unko dekhenge or +1 increment krenge cycly and agr pointer2 hmara last tk pahuch jata hai means usne saare characters ko convert kr dia hai cyclically vrna nai kiya
    
    public boolean canMakeSubsequence(String str1, String str2) {
        int pointer1=0;
        int pointer2=0;
        while(pointer1<str1.length() && pointer2<str2.length()){
            char c1=str1.charAt(pointer1);
            char c2=str2.charAt(pointer2);
            if(c1==c2){
                pointer1++;
                pointer2++;
            }
            else{
                char nextChar=(char)((str1.charAt(pointer1)-'a'+1)%26 +'a');
                if(nextChar==str2.charAt(pointer2)){
                    pointer1++;
                    pointer2++;
                }
                else{
                    pointer1++;
                }
            }
        }
        return pointer2==str2.length();
    }
}
