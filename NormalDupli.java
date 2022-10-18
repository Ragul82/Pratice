package Nested;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class NormalDupli {
	
	public static void main (String[] args) {
		Integer name[]= {1,1,22,55,6,7,7,5};
		HashSet<Integer>nums=new HashSet<Integer>();
		List<Integer> d= new ArrayList<Integer>();
		for(Integer h:name) {
			if(nums.add(h)==false) {
				//System.out.println(h);
				 d.add(h); 
			}
		}
   //List<Integer>names =h.stream().Collect(Collectors.toList());
    // name.forEach(d->System.out.println(nums.add(d)==false);
		  
		//System.out.println(nums);
		System.out.println(d);
	}

}
