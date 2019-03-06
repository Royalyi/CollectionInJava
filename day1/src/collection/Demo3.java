package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import bean.Student;

public class Demo3 {

	/**
	 * Collection存储自定义对象并用迭代器遍历
	 */
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Student("张三",23));
		c.add(new Student("李四",23));
		c.add(new Student("王五",23));
		c.add(new Student("赵六",23));
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
