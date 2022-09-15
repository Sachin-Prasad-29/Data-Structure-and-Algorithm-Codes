package Test_Questions;

import java.util.Scanner;

public class RainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wrapText= 300000 ;
        
        String s = "This is a very long text information that needa Loren The above code is wrapping the string after the next space of every 30 characters, but I need to wrap the string after the previous space of every 30 characters, like for the first line it will be The above code is wrapping the string after the next space of every 30 characters, but I need to wrap the string after the previous space of every 30 characters, like for the first line it will be The above code is wrapping the string after the next space of every 30 characters, but I need to wrap the string after the previous space of every 30 characters, like for the first line it will be The above code is wrapping the string after the next space of every 30 characters, but I need to wrap the string after the previous space of every 30 characters, like for the first line it will be" ;

        StringBuilder sb = new StringBuilder(s);

        if( wrapText > s.length()){
            System.out.println("Invalid Input");
        }
        else{
            int i = 0;
            while ((i = sb.indexOf(" ", i + wrapText)) != -1) {
            sb.replace(i, i + 1, "\n");
            }
   
            System.out.println(sb.toString());
        }
        sc.close();
        
    }
}
