class Solution {
    // Set me words daalo then baari bari hrr sustring check kro hrr word ki agr vo exist krta hai hashset toh replace kro and nahi toh word hi return kro and baari baari isliye kyuki shortest word chahiye hmko isss case mein .
    
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr=sentence.split(" ");
        HashSet<String> set=new HashSet<>();
        for(String str:dictionary){
            set.add(str);
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(shortSubstring(set,arr[i]));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
            if(i==list.size()-1){
                break;
            }
            else{
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static String shortSubstring(HashSet<String> set,String word){
        for(int i=1;i<word.length();i++){
            String rootWord=word.substring(0,i);
            if(set.contains(rootWord)){
                return rootWord;
            }
        }
        return word;
    }
}
