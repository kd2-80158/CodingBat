import java.util.HashMap;
import java.util.Map;

/**
 * Created by Saurabh Chhimwal on 06/04/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
 * <p>
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.


* wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
* wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
* wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {
  
  Map<String,Integer> map = new HashMap<>();
  Map<String,Boolean> newMap = new HashMap<>();
  
  for(int i=0;i<strings.length;i++)
  {
    map.put(strings[i],map.getOrDefault(strings[i],0)+1);
    
    for(String str: map.keySet())
       newMap.put(str,map.get(str)>=2);
    
  }
  return newMap;
}
    
}
