package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import bean.Student;

public class Demo3 {

	/**
	 * Collection�洢�Զ�������õ���������
	 */
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Student("����",23));
		c.add(new Student("����",23));
		c.add(new Student("����",23));
		c.add(new Student("����",23));
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
