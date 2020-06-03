package com.javaex.practice02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		//약수 확인 프로그램
		
		int num1, num2;
	
		//1.숫자 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		
		//2. 숫자크기 가려내기 --> 큰수에서 작은수 나눠떨어지는지 확인하기
		if(num1>num2) {
			
			if(num1%num2==0) {
				System.out.println(num2+"는(은) "+num1+"의 약수입니다.");}
			else {System.out.println(num2+"는(은)"+ num1+"의 약수가 아닙니다.");}
			
		}
		else{
			if(num2%num1==0) {
				System.out.println(num1+"는(은) "+num2+"의 약수입니다.");}
			else {System.out.println(num1+"는(은)"+ num2+"의 약수가 아닙니다.");}
		}
		
		
		 sc.close();
	}
  
 }

