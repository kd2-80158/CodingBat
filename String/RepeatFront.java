package String;

/* 
* Created by Saurabh Chhimwal on 08/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>



Given a string and an int n, return a string made of the first n characters of the string, 
followed by the first n-1 characters of the string, and so on. 
You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).


* repeatFront("Chocolate", 4) → "ChocChoChC"
* repeatFront("Chocolate", 3) → "ChoChC"
* repeatFront("Ice Cream", 2) → "IcI"
*/

public class RepeatFront {

    public String repeatFront(String str, int n) {
  
        String newString = "";
       
        if(n<1)
          return "";
        else
        {
          while(n!=0)
          {
          newString += str.substring(0,n);
          n--;
          }
        }
        return newString;
      }
      
    
}
