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
		final int prime = 31; //是一个质数，既不大也不小
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());//name=null返回0，不为空返回哈希值
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)					//调用对象和传入对象是同一个对象
			return true;                    //返回ture
		if (obj == null)					//传入对象为null
			return false;					//返回false
		if (getClass() != obj.getClass())	//调用对象和传入对象的字节码文件不同
			return false;					//返回false
		Student other = (Student) obj;		//向下转型
		if (age != other.age)				//调用对象年龄与传入对象年龄不等
			return false;					//返回false
		if (name == null) {					//调用对象姓名为null
			if (other.name != null)			//传入对象姓名不为null
				return false;				//返回false
		} else if (!name.equals(other.name))//调用对象姓名不等于传入对象
			return false;					//返回false
		return true;						//否则返回true
	}
/*	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int num=this.age-o.age;
		return num==0?this.name.compareTo(o.name):num;
	}*/
	
	
}
