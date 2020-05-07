package com.javaex.practice02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		//계산기 프로그램
		//나눗셈의 경우 분모가 0일시 계산되지 않을 것
		
		
		String cal;
		double n1, n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		cal = sc.nextLine();
		System.out.print("숫자1: ");
		n1 =sc.nextInt();
		System.out.print("숫자2: ");
		n2 =sc.nextInt();
				
		
			switch(cal){
			 case "+": System.out.println("결과는"+n1+n2); break;
			 case "-": System.out.println("결과는"+(n1-n2)); break;
			 case "*": System.out.println("결과는"+n1*n2); break;
			 case "/": if(n2>0||n2<0) {System.out.println("결과는"+n1/n2);}
			           else{System.out.println("계산할 수 없습니다.");} break;
			 default:System.out.println("계산할 수 없는 기호입니다.");break;
			}
		sc.close();

	}

}
