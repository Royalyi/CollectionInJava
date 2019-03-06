package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo_List2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("world");
		list.add("23");
		list.add("avc");
		ListIterator it=list.listIterator();//获取迭代器引用
		while(it.hasNext()){
			String str=(String)it.next();
			if("world".equals(str)){
				it.add("java");
			}
		}
		System.out.println(list);
	}

}
