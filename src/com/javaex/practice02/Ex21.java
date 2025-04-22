package com.javaex.practice02;

import java.util.Scanner;

public class Ex21 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요.");
	    int ein = sc.nextInt();
	    
	    if(ein<0) {
	    	System.out.println("잘못 입력하셨습니다.");
	    }else if (ein == 0){
	    	System.out.println("잘못된 사번입니다.");
	    }else {
		    if(ein%3 == 0) {
		    	System.out.println("A팀입니다.");
		    }else if(ein%3 == 1) {
		    	System.out.println("B팀입니다.");
		    }else if(ein%3 == 2) {
		    	System.out.println("C팀입니다.");
		    }
	    }
	    
		sc.close();
	}
}
