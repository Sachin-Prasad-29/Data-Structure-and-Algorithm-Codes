package Dynamic_Programming;

public class Scrambled_String {
    public static void main(String[] args) {
        String A= "great";
        String B = "ategr";
        // int N  = A.length();
        // int i =2;
        //     String P = A.substring(0,i);
        //     String Q = B.substring(N-i,N);
        //     String R = A.substring(i,N);
        //     String S = B.substring(0,N-i); 
        //     System.out.println(P+" "+Q+" "+R+" "+S);
        //     System.out.println("---------------------------------");

        if(A.length() !=  B.length())  
            System.out.println("0");;
        if(A.length() == 0) System.out.println("1");

        if(helper(A,B)) System.out.println("1");
        else 
             System.out.println("0");;

    }
    private static boolean helper(String A ,String B){
        // if both string are same return true
        if(A.compareTo(B)==0) return true;
        // if the size is one or less the return false because if size if one and we reached this part 
        // that mean both one char string is not equal so we return false here 
        if( A.length() <= 1) return false;
        //Now call the recurcive for loop for the smaller input answer
        int N  = A.length();
        boolean flag = false;
        for(int i = 1; i< N-1; i++){
            // condition 1 we will take for the string when there is a swapping 
            String P = A.substring(0,i);
            String Q = B.substring(N-i,N);
            String R = A.substring(i,N);
            String S = B.substring(0,N-i);
            System.out.println(P+" "+Q+" "+R+" "+S);
            boolean condition1 =  (helper(P,Q)) && (helper(R,S));
            System.out.println(condition1);

            // condition 2 we will take when the there is no swapping in string
            boolean condition2 = false;
            if(condition1 == false){
                condition2 = (helper(A.substring(0,i),B.substring(0,i))) && 
                                (helper(A.substring(i,N),B.substring(i,N)));
                System.out.println(condition2);
            }
            

            if( condition1 || condition2 ){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
