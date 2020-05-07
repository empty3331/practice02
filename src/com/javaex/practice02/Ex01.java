package com.javaex.practice02;

public class Ex01 {

	public static void main(String[] args) {
		
		//age가 0살 초과,18살 미만일 경우
		
		int age = 15;
		
		/*
		if(0 < age < 18) {
			System.out.println("청소년입니다.");
			
		코드오류이유: 두가지 조건을 거려면 
		||연산자나 &&연산자를 사용하여야 한다.	
		*/	
			
		
		if(0 < age && age <18) {
			System.out.println("청소년입니다.");
			}
		
		}

	}
