import java.util.*;
public class ValidParentheses {
    public static boolean isValid(String str){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '('){
                stack.push(')');
            }else if(ch == '{'){
                stack.push('}');
                }else if(ch == '['){
                    stack.push(']');
                } else{
                    if(stack.isEmpty() || stack.pop()!= ch){
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
        public static void main(String args[]){

            String input = "{[()]}";
        System.out.println("1 {[()]} : " +isValid(input));
        
        input = "{[(])}";
        System.out.println("2 {[(])} : " +isValid(input)); // false
        }
    }                                                                                                                               

