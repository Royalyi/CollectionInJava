package map;

import java.util.Comparator;
import java.util.TreeMap;

import bean.Student;

public class Demo6_TreeMap {
	/** A:案例演示
	* TreeMap集合键是Student值是String的案例*/
	public static void main(String[] args) {
//		TreeMap<Student, String> tm=new TreeMap<>();
		TreeMap<Student, String> tm=new TreeMap<>(new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int num=o1.getAge()-o2.getAge();
				return num==0?o1.getName().compareTo(o2.getName()):num;
			}});
		tm.put(new Student("张三",23), "上海");
		tm.put(new Student("张三",23), "bj");
		tm.put(new Student("lis",23), "gz");
		tm.put(new Student("ly",23), "sz");
		
		System.out.println(tm);
	}
}
