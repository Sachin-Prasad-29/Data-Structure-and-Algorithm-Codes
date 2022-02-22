package Sliding_Window;

public class Substrings_of_Size_k_with_Distinct_Characters {

	public static void main(String[] args) {
		String s="qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqweqwertyuioqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmpasdfghjklzxcvbnmwertyuiopasdfghjklzxcvbnmrqqwertyuiopasdfghjklzxcvbnmweqwertyuiopasdfghjklzxcvbnmrtqwertyuiopasdfghjklzxcvbnmyuiopaqwertyuiopasdfghjklzxcvbnmsdfqwertyuiopasdfghjklzxcvbnmghjklzxcvbnmtyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm";
		 int[] sArr= new int[26];
	      int k=25;
	      int n=s.length();
	       int start=0, end=0;
	        int count=0;
	         while(end< n){
	            sArr[s.charAt(end)-'a']++;
	             
	             if(end-start+1 < k) end++;
	             
	             else if(  end - start +1 ==k){
	                if(distinct(sArr))  count++;
	                 sArr[s.charAt(start)-'a']--;
	                 start++;
	                 end++;
	                 
	             }
	         }
	        System.out.println(count);   
	    }
	    public static boolean distinct(int[] a){
	            for(int i=0;i<26;i++)
	                if(a[i]>1) return false;
	        return true;
	    }
	}


