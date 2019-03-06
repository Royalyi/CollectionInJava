package bean;

public class Student //implements Comparable<Student>
{
	private int age;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31; //��һ���������Ȳ���Ҳ��С
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());//name=null����0����Ϊ�շ��ع�ϣֵ
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)					//���ö���ʹ��������ͬһ������
			return true;                    //����ture
		if (obj == null)					//�������Ϊnull
			return false;					//����false
		if (getClass() != obj.getClass())	//���ö���ʹ��������ֽ����ļ���ͬ
			return false;					//����false
		Student other = (Student) obj;		//����ת��
		if (age != other.age)				//���ö��������봫��������䲻��
			return false;					//����false
		if (name == null) {					//���ö�������Ϊnull
			if (other.name != null)			//�������������Ϊnull
				return false;				//����false
		} else if (!name.equals(other.name))//���ö������������ڴ������
			return false;					//����false
		return true;						//���򷵻�true
	}
/*	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int num=this.age-o.age;
		return num==0?this.name.compareTo(o.name):num;
	}*/
	
	
}
