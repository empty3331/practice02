package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//나눗셈의 몫과 나머지 구하기
		
		int num1, num2, num3, num4;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자:");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			num3 = num1/num2; num4 = num1%num2;
			System.out.println("몫: "+num3);
			System.out.println("나머지:"+num4 );
		}
		
		else if(num1 < num2) {
			num3 = num2/num1; num4 = num2%num1;
			System.out.println("몫: "+num3);
			System.out.println("나머지:"+num4 );
		}
		
		else{
			System.out.println("몫: 1");
			System.out.println("나머지: 0");
		}
			
		
		sc.close();
		

	}

}
