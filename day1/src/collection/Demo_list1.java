package collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import bean.Student;

public class Demo_list1 {

	/**
	 * List集合存储字符串并遍历?(迭代器和普通for)
	 */
	public static void main(String[] args) {
		List list= new ArrayList();
		list.add(new Student("张三1",23));
		list.add(new Student("张三2",23));
		list.add(new Student("张三3",23));
		list.add(new Student("张三4",23));
		Iterator it=list.iterator();
		while(it.hasNext()){
			//Student s=(Student)it.next();
			//System.out.println(s.getName()+s.getAge());
			System.out.println(it.next());
			
		}
		
	}

}
