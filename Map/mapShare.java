import java.util.Map;

/**
 * Created by Saurabh Chhimwal on 28/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
 * <p>
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
 * In all cases remove the key "c", leaving the rest of the map unchanged.
 * <p>
 * mapShare({"b": "bbb", "c": "ccc", "a": "aaa"}) → {"b": "aaa", "a": "aaa"}
 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 * mapShare({"d": "hi", "c": "meh", "a": "aaa"}) → {"d": "hi", "b": "aaa", "a": "aaa"}
 */

public Map<String, String> mapShare(Map<String, String> map) {
  
  // if(map.containsKey("a") && map.containsKey("c"))
  // {
  //   map.put("b",map.get("a"));
  //   map.remove("c");
  // }
  // else if(map.containsKey("b") && map.containsKey("c"))
  //   map.remove("c");
  // else if(map.containsKey("a") && !map.containsKey("b"))
  //   map.put("b",map.get("a"));
  
  map.remove("c");
  
   if(map.containsKey("a"))
      map.put("b",map.get("a"));
     
     return map;
     
}
