package Nested;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
	public static void main (String[] args) {
		String nam[]= {"Ragul","Kalai","AJi","Ragul","Kalai"};
	
		
		for(int i=0;i<nam.length;i++) {
			for(int j=i+1;j<nam.length;j++) {
				if(nam[i].equals(nam[j])) {
		System.out.println(nam[i]);	
			}
		}

	}

	}
}
