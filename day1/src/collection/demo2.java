package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c=new ArrayList();	//父类引用指向子类对象
		 c.add("aff");
		 c.add("af");
		 c.add("a");
		 c.add("affq");
		 c.add("affqq");
		Iterator it=c.iterator();  //获取迭代器的引用
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
