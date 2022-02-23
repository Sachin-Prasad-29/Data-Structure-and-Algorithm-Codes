package Stack_Problems;
import java.util.*;
/**
 * Remove_Outermost_paraentheses
 */
public class Remove_Outermost_paraentheses {

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int open =0;
        int close = 0;

    
        for(int i = 0;i< len ;i++ ){
            char c = s.charAt(i);
            if(c == '(')
                open++;
            else
                close++;
            if(open == close){
                 System.out.println(s.substring(start+1,i));
                sb.append(s.substring(start+1,i));
                start=i+1;
            }
        }
    
       System.out.println(sb.toString());
       return sb.toString();
    
    }
}