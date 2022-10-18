package Nested;

import java.util.ArrayList;

public class Loop {
	public static void main(String[] args) {
ArrayList<Integer>n=new ArrayList<>();
		for(int i=1;i<=50;i++) {
			if(i%5==0) {
			//System.out.println(i);
			n.add(i);
			}
		}
		System.out.println(n);
	}

}
