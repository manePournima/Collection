package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<Integer>set=new TreeSet<Integer>();

//		Set<Integer>set=new HashSet<Integer>();
		Set<Integer>set=new LinkedHashSet<Integer>();

		for(int j=90;j>=81;j--) {
			set.add(j);
	}
		
		System.out.println(set);

		
		for(int i=1;i<=20;i++) {
			
			set.add(i);
			
		}
		System.out.println(set);
		System.out.println("---------");
		for(int i=15;i<=25;i++  ) {
			set.add(i);
		}
	
		set.add(null);
		System.out.println(set);

}
}
