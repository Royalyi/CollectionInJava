package test;

import java.util.HashSet;
import java.util.Random;

public class Test1 {
	/* A:案例演示
	* 需求：编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
	* 
	* 分析：
	* Random创建对象
	* Hashset实现不重复，比LinkedHashSet效率高
	*/
public static void main(String[] args) {
	Random r=new Random();
	HashSet<Integer> hs=new HashSet<>();
	while(hs.size()<=10){
		hs.add(r.nextInt(20)+1);
	}
	
	System.out.println(hs);
}
}
