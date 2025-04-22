package com.javaex.practice02;

import java.util.Scanner;

public class Ex22 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
	    System.out.print("숫자1: ");
	    int num1 = sc.nextInt();
	    System.out.print("숫자2: ");
	    int num2 = sc.nextInt();
	    System.out.print("숫자3: ");
	    int num3 = sc.nextInt();
	    
	    int maxNum = 0;
	    
	    if(num1>=num2) {
	    	if(num1>=num3) {
	    		maxNum = num1;
	    	} else {
	    		maxNum = num3;
	    	}
	    } else {
	    	if(num2>=num3) {
	    		maxNum = num2;
	    	} else {
	    		maxNum = num3;
	    	}
	    }
	    
	    System.out.println("가장 큰 수는 "+maxNum+" 입니다.");
	    
		sc.close();
	}
}
