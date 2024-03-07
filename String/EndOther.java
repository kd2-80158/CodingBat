package String;
/* 
* Created by Saurabh Chhimwal on 06/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.

* endOther("Hiabc", "abc") → true
* endOther("AbC", "HiaBc") → true
* endOther("abc", "abXabc") → true
*/
public class EndOther {
    public boolean endOther(String a, String b) {
  
        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();
        int alen = str1.length();
        int blen = str2.length();
        if(alen>=blen)
        {
          String temp = str1.substring(alen-blen,alen);
          if(temp.compareTo(str2)==0)
            return true;
          else 
            return false;
        }
         if(blen>=alen)
        {
          String temp = str2.substring(blen-alen,blen);
          if(temp.compareTo(str1)==0)
            return true;
          else 
            return false;
        }
        return false;
      }   
    
}
