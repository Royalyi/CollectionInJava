package collection;

import bean.Student;



public class demo1_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student[] arr = new Student[9];//����������������
		arr[0] = new Student("����", 23);
		arr[1] = new Student("����", 24);
		arr[2] = new Student("����", 25);
		arr[3] = new Student("����", 26);
		arr[4] = new Student("���", 20);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}

}
