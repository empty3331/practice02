package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		//함수 값 계산하기
		//f(a)= x<=0, x세제곱-9x+2
		//      x>0 , 7x+2
		double x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		x = sc.nextDouble();
		System.out.print("계산결과는 ");
		
		
		if(x<0||x==0) {
			System.out.print((x*x*x)-(9*x)+2);
		}
		
		else {System.out.print(7*x+2);}
		
		System.out.println(" 입니다.");
		
		sc.close();
		
	}

}
