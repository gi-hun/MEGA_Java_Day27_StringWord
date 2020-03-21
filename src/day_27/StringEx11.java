/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 */

package day_27;

import java.util.Scanner;

public class StringEx11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String start = "자전거";
		
		while(true)
		{
			System.out.println("제시어 : " + start);
			
			char st = start.charAt(start.length()-1);
			
			System.out.print("입력:");
			String word = sc.next();
			
			char nt = word.charAt(0);
			
			if(st == nt)
			{
				start = word;
			}
			else
			{
				System.out.println("끝말잇기 실패");
				break;
			}
		}
		
	}
}
