package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력해주세요.");
	    System.out.print("알파벳: ");
	    String s = sc.nextLine();
	    
	    switch(s) {
	    	case "a":
	    		System.out.println("모음입니다.");
	    		break;
	    	case "b":
	    		System.out.println("자음입니다.");
	    		break;
	    	default:
	    		break;
	    }
	    
	    
	    sc.close();
	}
}
