import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println(sortByStrings("weather", "therapyw"));
     }
     
     public static String sortByStrings (String s, String t) {
        //Linked Hashmap to keep the order of the inputted elements
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        
        //Null Checker
        if ( t == null || s == null ) {
            return "";
        }
        
        //Use the order of T and initialize the characters that will be present in S
        for ( int j = 0; j < t.length(); j++ ) {
            map.put(t.charAt(j), 0);
        }
        
        //Increment the map with letters that are contained in T
        for (int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(s.charAt(i), map.get(c) + 1);
            }
        }
        
        StringBuilder build = new StringBuilder();
        
        /*
        Using the key and values, the duplicate string method 
        builds the string until they are in the correct order
        
        */
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            
            int value = entry.getValue();
            char key = entry.getKey();
            
            String string =  repeat(key,value);
            build.append(string);
        }
        
        return build.toString();
     }
     
        //A method to repeat the string output 
        public static String repeat(char c, int times){
        
        StringBuilder build = new StringBuilder();
        
        for( int i = 0;i < times;i++ ){
            build.append(c);
        }
        
        return build.toString();
    }
}