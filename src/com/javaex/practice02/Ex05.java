package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		//체중 구분하기
		
		int cm;
		int kg;
		double stan;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		cm = sc.nextInt();
		System.out.print("몸무게: ");
		kg = sc.nextInt();
		stan = (cm-100)*0.9;
		
		if(kg > stan) {
			System.out.println("과체중 입니다.");
		}
		
		else if(kg < stan) {
			System.out.println("저체중 입니다.");
		}
		
		else{
			System.out.println("표준 입니다.");
		}
		
		System.out.println("표준체중: "+stan);
		
		
		sc.close();
		

	}

}
