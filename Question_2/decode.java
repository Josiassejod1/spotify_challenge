import java.util.*;

public class decode{

     public static void main(String []args){
        System.out.println(decodeString("4[a3cfff]"));
     }
     
    /*
    This function is to repeat an inputed string any amount of times
    */
     
     public static String repeat(String s, int times) {
        String value = "";
        for (int i = 0; i < times; i++) {
            value += s;
        }
         
        return value;
    }
     
     
    public static String decodeString(String s) {
        /*
            stack - keeps track of numbers inputted
            number - keeps track of the numbers in the string
            string - keeps track and build the numbers in the string
        
        */
        Stack<String> stack = new Stack<String>();
        StringBuilder number = new StringBuilder();
        StringBuilder string = new StringBuilder();
        StringBuilder master = new StringBuilder();
         stack.push(Character.toString(s.charAt(0)));
        for (int i = 0; i < s.length(); i++) {
            char c =  s.charAt(i);
            
            if (Character.isDigit(c)) {
                number.append(c);
            }
            if (Character.isLetter(c)) {
                string.append(c);
            }
            
            /*
                if the string of numbers is not full,
                the string builder pushes the completed number on 
                the stack and resets it for the next use
            */
            if (c == '[') {
                if (number != null) {
                    stack.push(number.toString());
                    number.setLength(0);
                }
            }
            
            /*
            if the brackets are closed correctly, the string is build by keeping
            track of all the numbers in the string and passing that along with the
            character sequence in the repeat method.
            */
            
            if (c == ']') {
                String head = stack.pop();
                if (stack.isEmpty()) {
                master.append(repeat(string.toString(), Integer.parseInt(head)));
                } else {
                    continue;
                }
            }
        } 
        
        if (!stack.isEmpty()) {
            System.out.println("You are missing brackets");
        }
        
        return master.toString();
    }
}
