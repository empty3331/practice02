package com.javaex.practice02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// 세금계산법
		
		double m;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익 입력해 주세요");
		System.out.print("금액: ");
		m = sc.nextDouble();
		
		
		if(m>=0 && m<=1000) {
			System.out.print("소득세는 "+ m* 0.09+" 입니다.");
		}
		
		else if(m>1000 && m<=4000) {
			System.out.print("소득세는 "+ 1000*0.09 + 0.18*(m-1000)+" 입니다.");
		}
		
		else if(m>4000 && m<8000) {
			System.out.print("소득세는 "+ 1000*0.09 + 3000*0.18 + 0.27*(m-4000)+" 입니다.");
		}
		else if(m>=8000){System.out.print("소득세는 "+1000*0.09 + 3000*0.18 + 4000*0.27+0.36*(m-8000)+" 입니다.");
		}
		
		else {System.out.println("잘못 입력했습니다.");}
		
		
		sc.close();
		
		
	}

}
