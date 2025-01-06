class Solution {
    // hrr ball k liye indexes ka differences store kro overall such that min Operation bne after moving it from filled to empty places
    public int[] minOperations(String boxes) {
        int[] ans=new int[boxes.length()];
        for(int i=0;i<ans.length;i++){
            ans[i]=getIndexesForAllBoxes(i,boxes);
        }
        return ans;
    }
    public static int getIndexesForAllBoxes(int index,String str){
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(i!=index && str.charAt(i)=='1'){
                ans+=Math.abs(i-index);
            }
        }
        return ans;
    }
}
