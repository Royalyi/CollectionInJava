package set;

import java.util.HashSet;

import bean.Student;

/*
 * �洢�Զ�����󲢱�֤Ԫ��Ψһ
 * */
public class Demo1_HashsetPlus {
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<>();
		hs.add(new Student("����", 23));
		hs.add(new Student("����", 23));
		hs.add(new Student("����", 23));
		hs.add(new Student("����", 23));
		hs.add(new Student("����", 23));
		hs.add(new Student("����", 23));  //HashSet��֤Ԫ��Ψһ�ķ����ǣ�new һ������ʱ�����hashcode������������һ��Hashcode����hashֵһ��ʱ���ڵ���equals�������жϣ�����Ҫ��дequals��hashCode����,�����ȥ�ظ�Ч��
		
		for (Student student : hs) {
			System.out.println(student
					);
		}
	}
}
