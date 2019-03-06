package test;

import java.util.HashSet;
import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Test2_Scanner {
	/* 使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
	* aaaabbbcccddd
	* 
	*实现步骤：从键盘获取字符串
	*字符串转为字符数组
	*遍历字符数组添加到HashSet中并遍历输出
	*/
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		     String i = sc.nextLine();
		     System.out.println(i);
		     char[] cr=i.toCharArray();
		     HashSet<Character> hs=new HashSet<>();
		    for (char c : cr) {
				hs.add(c);
			}
		     System.out.println(hs);
	}
}
