package com.javaex.practice02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		//나이측정 프로그램2
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age>=19 && age<65) {
			System.out.print("\"1번그룹\"");
		}//19세 이상,65세 미만
		
		else {System.out.print("\"2번그룹\"");}
		
		
		System.out.println("입니다.");
		
		
		sc.close();
		

	}

}
