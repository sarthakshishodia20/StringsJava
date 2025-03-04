import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean splitString(String str) {
        // Write your code here..
        int countleft=0;
        int countright=0;
        int index=0;
        while(index<str.length()/2){
            if(str.charAt(index)=='a'||str.charAt(index)=='e'||str.charAt(index)=='i'||str.charAt(index)=='o'||str.charAt(index)=='u'||
            str.charAt(index)=='A'||str.charAt(index)=='E'||str.charAt(index)=='I'||str.charAt(index)=='O'||str.charAt(index)=='U'){
                countleft++;
            }
            index++;
        }
        while(index<str.length()){
            if(str.charAt(index)=='a'||str.charAt(index)=='e'||str.charAt(index)=='i'||str.charAt(index)=='o'||str.charAt(index)=='u'
            ||str.charAt(index)=='A'||str.charAt(index)=='E'||str.charAt(index)=='I'||str.charAt(index)=='O'||str.charAt(index)=='U'){
                countright++;
            }
            index++;
        }
        return countleft==countright;
    }

}
