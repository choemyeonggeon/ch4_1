package com.greedy.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산하기");
		System.out.print("첫 번쨰 정수: ");
		int fi = sc.nextInt();
		System.out.print("두 번쨰 정수 :");
		int se = sc.nextInt();
		
		System.out.println("연산 기호를 입력하세요 :");
		char ch1 = sc.next().charAt(0);
		
		int result = 0;
		
		switch(ch1) {
		case '+':
			result=fi+se;
			break;
		case '-':
			result=fi-se;
			break;
		case '*':
			result=fi*se;
			break;
		case '/':
			result=fi/se;
			break;
		case '%':
			result=fi%se;
			break;
		
		}
	
		System.out.println(fi +"" + ch1+"" + se+ "=" + result);	
		

	}
	
	
}
