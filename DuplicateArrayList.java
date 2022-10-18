package Nested;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateArrayList {
	public static void main (String[] args) {
		//String nm[]= {"RA","vi","ka","RA","vi","MMB"};
		ArrayList <String>name=new ArrayList<String>();
		name.add("hi");
		name.add("hello");
		name.add("hi");
		for (int i=0;i<name.size();i++) {
			for(int j=i+1;j<name.size();j++) {
				if(name.get(i).equals(name.get(j))) {
					System.out.println(name.get(i));
				}
			}
			
		}
		
	}

}
