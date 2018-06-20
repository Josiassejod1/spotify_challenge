public class decode{

     public static void main(String []args){
        
        System.out.println(decodeString("4[ab]"));
     }
     
     
     public static String decodeString(String s) {
        Stack<String> number = new Stack<String>();
        Stack<String> string = new Stack<String>();
        StringBuilder build = new StringBuilder();
        
        string.push(s.charAt(0));
        
        for (int i = 0; i < s.length(); i++) {
            char c = str.charAt(i);
            /* If code is a character or letter,
            I want to continue to build the string
            */
            if (Character.isDigit(c)) {
                build.append(c);
            } 
            
            if (Character.isLetter(c)) {
                build.append(c);
            }
             
            /*
                If the loop reaches [ and their is
                values that are still in the string builder, I want to push that value on the stack
            */ 
            
            if (c == '[') {
                if (build != null && Integer.parseInt(build.toString()) {
                    number.push(build);
                    build.setLength(0);
                } else {
                    string.push(build);
                }
            } 
            /*
            If the loop reaches ], I want to start to build a string that duplicates the values as many times as possible
            */
            if (c == ']') {
                if (string.empty()){
                    String repeat = repeat(string.pop(), Integer.parseInt(number.pop());
                } else {
                    string.push(build);
                }
            }
        }
     }
     /*
        This function is to repeat an inputed string an amount of times
     */
     public static String repeat(String s, int times) {
            String value = "";
         for (int i = 0; i < times; i++) {
             value += s;
         }
         
         return value;
     }
}