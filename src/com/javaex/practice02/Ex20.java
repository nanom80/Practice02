package com.javaex.practice02;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력해주세요.");
	    System.out.print("알파벳: ");
	    String s = sc.nextLine();
	    
	    
	    if(s.equals("a")) {
	    	System.out.println("모음입니다.");
	    } else if (s.equals("b")) {
	    	System.out.println("자음입니다.");
	    } else {
	    	System.out.println("영문 소문자를 입력해주세요.");
	    }
	    
	    sc.close();
	}
}
