package set;

import java.util.HashSet;

import bean.Student;

/*
 * 存储自定义对象并保证元素唯一
 * */
public class Demo1_HashsetPlus {
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<>();
		hs.add(new Student("张三", 23));
		hs.add(new Student("张三", 23));
		hs.add(new Student("李四", 23));
		hs.add(new Student("李四", 23));
		hs.add(new Student("王五", 23));
		hs.add(new Student("赵六", 23));  //HashSet保证元素唯一的方法是：new 一个对象时会调用hashcode（）方法生成一个Hashcode，当hash值一样时，在调用equals方法做判断，所以要重写equals和hashCode方法,提高了去重复效率
		
		for (Student student : hs) {
			System.out.println(student
					);
		}
	}
}
