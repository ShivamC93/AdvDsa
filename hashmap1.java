import java.util.*;

public class hashmap1{
    static void HashmapMethod(){
        //sYNTAX
        HashMap<String, Integer> mp = new HashMap<>();
        //Adding element
        mp.put("Akash",21);
        mp.put("Shiva",93);
        mp.put("yash",35);
        mp.put("vansh",83);
        //getting value of key
        System.out.println(mp.get("Shiva"));
        //changing value of key
        mp.put("Shiva", 3);
        //remove 
        System.out.println(mp.remove("Yash"));
        //check if a key is present or not
        System.out.println(mp.containsKey("Shiva"));
        //adding new entry only if the new key doesnt exist
        mp.putIfAbsent("akshat",67);
        //Return all values in the map
        System.out.println(mp.entrySet());
        //all keys
        System.out.println(mp.keySet());
        //all values
        System.out.println(mp.values());
        //traversing
        for(Map.Entry<String, Integer> e: mp.entrySet()){
            System.out.printf("Age of %s is %d", e.getKey(),e.getValue());
        }
        //iteration
    
    }
    public static void main(String[] args) {
        HashmapMethod();
    }
}