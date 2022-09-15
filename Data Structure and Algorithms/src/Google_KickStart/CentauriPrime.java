package Google_KickStart;

import java.util.Scanner;

public class CentauriPrime {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//		System.out.println(" enter the number of input ");
					int noOfCases = sc.nextInt();sc.nextLine();
					int k= 1;
				    char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
				    char ignore = 'y';
					while(noOfCases >= k) {
						//System.out.println("enter the string");
						String s = sc.nextLine();
						int len = s.length();
						char lastChar = s.charAt(len-1);
						if(lastChar == ignore) 
							System.out.println("Case #"+k+": " +s+ " is ruled by nobody");
						else {
							boolean flag = false;
							for(int i= 0;i<10;i++) {
								if(lastChar == vowels[i]) {
									flag = true;
									break;
								}	
							}
							if(flag)
								System.out.println("Case #"+k+": " +s+ " is ruled by Alice");
							else 
								System.out.println("Case #"+k+": " +s+ " is ruled by Bob.");
						}
						k++;
					}
		}

	}

}
