package String;

/* 
* Created by Saurabh Chhimwal on 08/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Given a string, consider the prefix string made of the first N chars of the string. 
Does that prefix string appear somewhere else in the string? Assume that the string is not empty and 
that N is in the range 1..str.length().


* prefixAgain("abXYabc", 1) → true
* prefixAgain("abXYabc", 2) → true
* prefixAgain("abXYabc", 3) → false
*/
public class PrefixAgain {

    public boolean prefixAgain(String str, int n) {
  
        String prefix = str.substring(0,n);
        for(int i=n;i<=str.length()-n;i++)
        {
          // if(i<str.length() && str.charAt(i)==str.charAt(i+1))
          // return true;
          // String prefix = str.substring(0,n);
          // if(i>=n && prefix.compareTo(str.substring(i,i+prefix.length()))==0)
          //   return true;
          if(str.substring(i,i+n).equals(prefix))
            return true;
        }
        return false;
      }
    
}
