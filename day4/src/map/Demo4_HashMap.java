package map;

import java.util.HashMap;

import bean.Student;

public class Demo4_HashMap {
		public static void main(String[] args) {
			/*����ѧ���ֵ࣬�ǳ��У��˰���ּ�ڱ���hashMap�洢�Զ������Ϊ�˱�֤����Ψһ����Ҫ��дHashCode��equals����*/
			HashMap<Student, String> map= new HashMap<>();
			map.put(new Student("����",23), "�Ϻ�");
			map.put(new Student("����",23), "bj");
			map.put(new Student("lis",23), "gz");
			map.put(new Student("ly",23), "sz");
			
			System.out.println(map);
		}
}
