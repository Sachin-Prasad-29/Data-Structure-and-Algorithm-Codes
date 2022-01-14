package Recursion;

import java.io.*; 

class ArmstrongNumbers
{
    boolean armStrongNo(int n)
    {
    	System.out.println(n);
        int quotient = n, remainder, sum = 0; 
        System.out.println(quotient);
        String num = Integer.toString(n);
        int len=num.length();
        System.out.println(len);
        while(quotient > 0)
        {
            remainder= quotient % 10; 
            System.out.println(remainder);
            sum = sum + ((int)Math.pow(remainder, len));
            System.out.println(sum);
            
            quotient = quotient/10;
             System.out.println(quotient);
            
        }
     if(n==sum){
         return true;
     }
        return false;
    }
}

class StringPermutation
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
        int n;
        
        n=Integer.parseInt(br.readLine().trim()); 
        
        ArmstrongNumbers no=new ArmstrongNumbers();
        
        if(no.armStrongNo(n))
            System.out.print("The given number "+n+" is an Armstrong number. ");
        
        else
            System.out.print("The given number "+n+" is NOT an Armstrong number. ");
    }
}