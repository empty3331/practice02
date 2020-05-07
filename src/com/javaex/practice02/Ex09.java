package com.javaex.practice02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		//약수 확인 프로그램
		
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			num3 = num1%num2;
			if(num3==0) {
				System.out.println(num2+"는(은) "+num1+"의 약수입니다.");}
			else {System.out.println(num2+"는(은) "+num1+"의 약수가 아닙니다.");}
		}
		
		else if(num1<num2) {
			num3 = num2%num1;
			if(num3==0) {
				System.out.println(num1+"는(은) "+num2+"의 약수입니다.");}
			else {System.out.println(num1+"는(은) "+num2+"의 약수가 아닙니다.");}	
			
		}
		
		else{System.out.println(num1+"는(은) "+num2+"의 약수입니다.");}
		
		
		sc.close();

	}

}
