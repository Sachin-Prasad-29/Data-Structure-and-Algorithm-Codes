package Recursion;
public class PallinedroneString {
    public static void main(String[] args) {
        String s = "moodm";
    if(PallindroneCheck(s,0))
        System.out.println("Its Pallindrone");
    else 
        System.out.println(" Its non Pallindrone");
    }
    
    private static boolean PallindroneCheck(String s, int i){
        if(i >= s.length()/2)
            return true;
        if(s.charAt(i) != s.charAt(s.length()-1-i))
            return false;
        return PallindroneCheck(s, ++i);
        
    }
    
}
