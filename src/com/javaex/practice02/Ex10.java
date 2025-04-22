package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
	    System.out.print("숫자1: ");
	    int num1 = sc.nextInt();
	    System.out.print("숫자2: ");
	    int num2 = sc.nextInt();
	    
	    int bigNum = 0, smallNum = 0;
	    
	    if(num1 > num2) {
			bigNum = num1;
			smallNum = num2;
	    }else {
	    	bigNum = num2;
			smallNum = num1;
	    }
	    
	    System.out.println("큰수: "+bigNum+"   작은수: "+smallNum+" 입니다.");
	    
		sc.close();
	}
}
