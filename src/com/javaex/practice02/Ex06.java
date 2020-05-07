package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//큰 수와 작은 수 구분하기
		
		int num1;
		int num2;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		
		
		if(num1 > num2) {
			System.out.println("큰수: "+num1+"\t"+"작은수: "+num2+" 입니다.");
		}
		
		else if(num1 < num2) {
			System.out.println("큰수: "+num2+"\t"+"작은수: "+num1+" 입니다.");
		}
		
		else {
			System.out.println("큰수: "+num1+"\t"+"작은수: "+num2+" 입니다.");
		}
			
		
		sc.close();
		

	}

}
