import java.util.Map;

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
