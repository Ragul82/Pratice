package Pin;

import java.util.Arrays;
import java.util.Scanner;

public class Password {
	public static void main (String[] args) {
		Scanner ans=new Scanner(System.in);
		System.out.println("Enter");	
		int count=0;
		
		
		for(int i=1;i<=3;i++) {
			
			int password=ans.nextInt();
			//System.out.println("enter again");
		          if(password==123) {
		        	  System.out.println("login sussces");
		        	  count++;
		        	  break;
		          }else if(i<3) {
		        	  System.out.println("enter again");
		        	  
		          }
		        	  
		          
			
			}
	      if(count==0) {
	    	  System.out.println("sorry Invalid");
	      }
	     // System.out.println("end");
		
	}
		
}



