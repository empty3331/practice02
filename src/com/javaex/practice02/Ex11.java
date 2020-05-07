package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		//알파벳 자음 모음 구분기
		
		String alpa;
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		alpa = sc.nextLine();
		
		switch(alpa) {
		    case "a": System.out.println("모음입니다."); break;
		    case "e": System.out.println("모음입니다."); break;
		    case "i": System.out.println("모음입니다."); break;
		    case "o": System.out.println("모음입니다."); break;
		    case "u": System.out.println("모음입니다."); break;
		    //break를 한번만 써도 되지만 추천하지 않는 방식
		    	
		    default:System.out.println("자음입니다.");break;		    		
		
		}
		
		
		sc.close();
		
		

	}

}
