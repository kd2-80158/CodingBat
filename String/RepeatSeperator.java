package String;

/* 
* Created by Saurabh Chhimwal on 08/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>



Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
separated by the separator string.


* repeatSeparator("Word", "X", 3) → "WordXWordXWord"
* repeatSeparator("This", "And", 2) → "ThisAndThis"
* repeatSeparator("This", "And", 1) → "This"
*/

public class RepeatSeperator {

    public String repeatSeparator(String word, String sep, int count) {
  
        String newString = "";
        
        if(count<1)
          return "";
        
        while(count!=1)
        {
          newString += word+sep;
          count--;
        }
        newString += word;
        
        return newString;
      }
      
      
    
}
