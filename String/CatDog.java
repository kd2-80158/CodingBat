package String;

/* 
* Created by Saurabh Chhimwal on 05/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Return true if the string "cat" and "dog" appear the same number of times in the given string.


* catDog("catdog") → true
* catDog("catcat") → false
* catDog("1cat1cadodog") → true
*/

public class CatDog {

    public boolean catDog(String str) {
  
        if(str.length()<1)
          return true;
        int count1=0;
        int count2=0;
        for(int i=0;i<str.length()-2;i++)
        {
          String temp = str.substring(i,i+3);
          if(temp.compareTo("cat")==0)
            count1++;
          if(temp.compareTo("dog")==0)
            count2++;
        }
        if(count1==count2)
          return true;
        else
          return false;
      }
      
    
}
