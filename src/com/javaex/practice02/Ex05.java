package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		//체중 구분하기
		
		double cm,kg,stan;
		double pstanKg,mstanKg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		cm = sc.nextDouble();
		System.out.print("몸무게: ");
		kg = sc.nextDouble();
		stan = (cm-100)*0.9;
		pstanKg = stan+(stan/10);
		mstanKg = stan-(stan/10);
		
		if(kg > pstanKg) {
			System.out.println("과체중 입니다.");
		}
		
		else if(kg < mstanKg) {
			System.out.println("저체중 입니다.");
		}
		
		else{
			System.out.println("표준 입니다.");
		}
		
		
		System.out.println("표준체중: "+stan);
		System.out.println("과체중기준: "+pstanKg+" 초과");
		System.out.println("저체중기준: "+mstanKg+" 미만");
		
		sc.close();
		

	}

}
