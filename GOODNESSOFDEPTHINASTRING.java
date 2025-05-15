import java.util.* ;
import java.io.*; 
public class Solution {
  static final int mod=1000000007;
	public static int goodnessOfString(String s) {
		// Write your code here.
    int depth=0;
    long goodness=0;
    int i=0;
    while(i<s.length())
    {
      char ch=s.charAt(i);
      if(ch=='['){
        depth++;
        i++;
      }
      else if(ch==']'){
        depth--;
        i++;
      }
      else if(Character.isDigit(ch)){
        int num=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
          num=num*10 + (s.charAt(i)-'0');
          i++;
        }
        goodness=(goodness+(1L*num*depth)%mod)%mod;
      }
      else{
        i++;
      }
    }
    return (int)goodness;
	}
}
