package Test_Questions;

import java.util.*;

class Solution{
    
    public static void main(String[] args) {
        String b = "khk";
        String a = "abcd";
        int val = 0;
        for(int i  = 0 ; i < a.length(); i++){
            val |= 1 << (a.charAt(i) - 'a');
        }
        int val1 = 0;
        for(int i  = 0 ; i < b.length(); i++){
            val1 |= 1 << (b.charAt(i) - 'a');
        }
        System.out.println(val+" "+val1);
        System.out.println(val1 & val);
    }

}
