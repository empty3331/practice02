package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//나눗셈의 몫과 나머지 구하기
		
		int num1, num2, num3, num4;
		int max = 0;
		int min = 0;
		
		//1.숫자 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자:");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		//2.입력된 두 수중 큰수 가려내기
		if (num1 > num2 && num1==num2) {
			max = num1;
			min = num2;
		}
		else{
			max = num2;
			min = num1;
		}
			
		//3.큰 수 를 작은수로 나누기
		num3 = max/min; 
		num4 = max%min;
		
		//4.결과출력
		System.out.println("몫: "+num3);
		System.out.println("나머지:"+num4 );
			
		
		sc.close();
		

	}

}
