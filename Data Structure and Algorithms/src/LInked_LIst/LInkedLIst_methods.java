package LInked_LIst;
import java.util.*;
public class LInkedLIst_methods {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>();
		
		System.out.println(list);
		list.addFirst(10);
		list.addLast(20);
		list.addFirst(10);
		list.addLast(100);
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		
		
		

	}

}
