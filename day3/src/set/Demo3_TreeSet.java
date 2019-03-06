package set;

import java.util.Comparator;
import java.util.TreeSet;
public class Demo3_TreeSet {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>(new Compare());	//TreeSet(Collection<? extends E> c) 

		ts.add("yaa");
		ts.add("a");
		ts.add("csaa");
		ts.add("aaaw");
		ts.add("wa");
		
		System.out.println(ts);
		
		
	}
	
	
}

class Compare implements Comparator<String>{
	
@Override
public int compare(String o1, String o2) {
	// TODO Auto-generated method stub
	int num=o1.length()-o2.length();		//
	return num==0?o1.compareTo(o2):num;
	
}
}
