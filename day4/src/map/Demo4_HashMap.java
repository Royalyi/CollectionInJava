package map;

import java.util.HashMap;

import bean.Student;

public class Demo4_HashMap {
		public static void main(String[] args) {
			/*键是学生类，值是城市，此案例旨在表明hashMap存储自定义对象为了保证键的唯一性需要重写HashCode和equals方法*/
			HashMap<Student, String> map= new HashMap<>();
			map.put(new Student("张三",23), "上海");
			map.put(new Student("张三",23), "bj");
			map.put(new Student("lis",23), "gz");
			map.put(new Student("ly",23), "sz");
			
			System.out.println(map);
		}
}
