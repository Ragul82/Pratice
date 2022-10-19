package Pin;

import java.util.Scanner;

public class PasswordDemo {
	public static void main (String[] args) {
		Scanner val=new Scanner(System.in) ;
		System.out.println("Enter Pin");
		int count=0;
		
		for(int i=1;i<=3;i++) {
			int name=val.nextInt();
			if(name==1901) {
				System.out.println("Succes");
				count++;
				break;
				
			}
			else if(i<3) {
				System.out.println("RE Enter");
			}
			
		}
		if(count==0) {
			System.out.println("Invalid");
		}
		
	}
	

}
