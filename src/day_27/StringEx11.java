/*
 * # �����ձ� ����
 * ���þ� : ������
 * �Է� : �Ź�
 * ���þ� : �Ź�
 * �Է� : �̼�
 * ...
 */

package day_27;

import java.util.Scanner;

public class StringEx11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String start = "������";
		
		while(true)
		{
			System.out.println("���þ� : " + start);
			
			char st = start.charAt(start.length()-1);
			
			System.out.print("�Է�:");
			String word = sc.next();
			
			char nt = word.charAt(0);
			
			if(st == nt)
			{
				start = word;
			}
			else
			{
				System.out.println("�����ձ� ����");
				break;
			}
		}
		
	}
}
