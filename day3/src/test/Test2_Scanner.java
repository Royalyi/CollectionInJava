package test;

import java.util.HashSet;
import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Test2_Scanner {
	/* ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
	* aaaabbbcccddd
	* 
	*ʵ�ֲ��裺�Ӽ��̻�ȡ�ַ���
	*�ַ���תΪ�ַ�����
	*�����ַ�������ӵ�HashSet�в��������
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
