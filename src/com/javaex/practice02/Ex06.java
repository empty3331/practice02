package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//큰 수와 작은 수 구분하기
		
		int num1;
		int num2;
		int max = 0;
		int min = 0;
		
		//1.숫자 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		
		//2.두 수의 크기차이 구별하기
		if(num1 > num2) {
			max = num1;
			min = num2;
		}
		
		else if(num1 < num2) {
			max = num2;
			min = num1;
		}
		
		else {
			System.out.println("두 수는 같습니다.");
			max = num1;
			min = num2;
		}
		
		//3.결과 출력
		System.out.println("큰수: "+max+"\t"+"작은수: "+min+" 입니다.");
		
		
		sc.close();
		

	}

}
