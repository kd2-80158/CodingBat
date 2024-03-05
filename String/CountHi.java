package String;

/* 
* Created by Saurabh Chhimwal on 04/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Return the number of times that the string "hi" appears anywhere in the given string.


* countHi("abc hi ho") → 1
* countHi("ABChi hi") → 2
* countHi("hihi") → 2
*/

public class CountHi {

    public int countHi(String str) {
  
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
         if(i+2<=str.length() && str.substring(i,i+2).equals("hi")) 
         {
           count++;
         }
        }
        return count;
      }
    
}
