package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		//가장 작은 수 구하기
		
		int num1, num2, num3;
		int min;
		
		//1.숫자 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		System.out.print("숫자3: ");
		num3 = sc.nextInt();
		
		//2.제일 작은수 가려내기
		min = num1;
		if(min>num2) {
			min = num2;
		}
		
		if(min>num3) {
			min = num3;
		}
		
		//3.출력
		System.out.println("가장 작은수는 "+min+" 입니다.");
		sc.close();
		
		

	}

}
