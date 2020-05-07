package com.javaex.practice02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//나이측정 프로그램1
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
				
		if(age > 20) {
			System.out.print("\"1번 그룹\"");}
		
		else {
			System.out.print("\"2번 그룹\"");		
		}
		
		System.out.println("입니다.");
		
		sc.close();

	}

}
