package practiceQuestion;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		List<List<String>> lst=new ArrayList<List<String>>();
		List<String> ls=new ArrayList<String>();
	     ls.add("phone");
	     ls.add("blue");
	     ls.add("pixel");
	     
	     List<String> ls2=new ArrayList<String>();
	     ls2.add("computer");
	     ls2.add("silver");
	     ls2.add("lenovo");
	     
	     List<String> ls3=new ArrayList<String>();
	     ls3.add("phone");
	     ls3.add("gray");
	     ls3.add("iphone");
	   
	     //System.out.println(ls);
	     lst.add(ls);
	    // System.out.println(lst);
	     lst.add(ls2);
	    // System.out.println(lst);
	     lst.add(ls3);
	    // System.out.println(lst);
	     //lst.add(ls);
	     System.out.println(lst);
	   //  System.out.println((lst.get(0)).get(0));
	   //  System.out.println(lst.get(0).size());
	     
		
		System.out.println(countMatches(lst,"color","silver"));

	}
	
	
	
	 public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		    
	        int col=Integer.MIN_VALUE;
	        int count=0;
	        
	        if(ruleKey=="type"){
	            col=0;
	        }
	        else if(ruleKey=="color"){
	            col=1;
	        }
	        else
	            col=2;
	        System.out.println(col);
	        
	        
	        for(int i=0;i<items.size();i++){
	        	System.out.println(items.get(i));
	        	System.out.println((items.get(i)).get(col));
	            if(ruleValue==(items.get(i)).get(col)){
	                count++;
	            }
	        }
	        
	        return count;
	    }

}
