package collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import bean.Student;

public class Demo_list1 {

	/**
	 * List���ϴ洢�ַ���������?(����������ͨfor)
	 */
	public static void main(String[] args) {
		List list= new ArrayList();
		list.add(new Student("����1",23));
		list.add(new Student("����2",23));
		list.add(new Student("����3",23));
		list.add(new Student("����4",23));
		Iterator it=list.iterator();
		while(it.hasNext()){
			//Student s=(Student)it.next();
			//System.out.println(s.getName()+s.getAge());
			System.out.println(it.next());
			
		}
		
	}

}
