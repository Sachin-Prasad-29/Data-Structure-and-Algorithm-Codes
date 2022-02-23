package Stack_Problems;

import java.util.Stack;

/**
 * Min_stack_Implementation
 */
public class Min_stack_Implementation {
    static  Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static void main(String[] args) { 
        push(20);
        push(30);
        System.out.println(minVal());
        push(40);
        push(30);
        push(10);
        System.out.println(minVal());
        push(97);
        push(70);
        push(5);
        System.out.println(minVal());
        pop();
        System.out.println(minVal());
        //System.out.println( s1);   
    }
    public static void push(int data){
        s1.push(data);
        if(s2.size() == 0 || data <= s2.peek())
           s2.push(data);
    }

    public static int pop() {
        int val = s1.peek();
        if(s1.peek() == s2.peek())
             s2.pop();
        s1.pop();
        return val;  
    }
    
    public static int minVal(){
        return s2.peek();
    }
}