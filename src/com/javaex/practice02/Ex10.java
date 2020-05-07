package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		//팀 확인 프로그램
		
		int num, nau;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		num = sc.nextInt();
		nau = num%3;
		
		switch(nau){
			case 0: System.out.print("A팀입니다."); break;
			case 1: System.out.print("B팀입니다."); break;
			case 2: System.out.print("c팀입니다."); break;
			default: System.out.println("잘못입력하셨습니다.");
			}
		
		sc.close();

	}

}
