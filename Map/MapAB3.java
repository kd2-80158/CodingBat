import java.util.Map;

/**
 * Created by Saurabh Chhimwal on 28/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
 * <p>
Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), 
set the other to have that same value in the map.


* mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
* mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
* mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */
public class MapAB3{
  public Map<String, String> mapAB3(Map<String, String> map) {
  
    if(map.containsKey("a") && !map.containsKey("b"))
      map.put("b",map.get("a"));
    if(!map.containsKey("a") && map.containsKey("b"))
      map.put("a",map.get("b"));
      
    return map;
      
  }
  
  
}