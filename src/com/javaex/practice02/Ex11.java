package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
	    System.out.print("첫 번째 숫자: ");
	    int num1 = sc.nextInt();
	    System.out.print("두 번째 숫자: ");
	    int num2 = sc.nextInt();
	    
	    int bigNum = 0; //큰수
	    int smallNum = 0; //작은수
	    int quotient = 0; //몫
	    int remainder = 0; //나머지
	    
	    if(num1>=num2) {
	    	bigNum = num1;
	    	smallNum = num2;
	    } else {
	    	bigNum = num2;
	    	smallNum = num1;
	    }
	    
	    quotient = bigNum / smallNum;
	    remainder = bigNum % smallNum;
	    
	    System.out.println("몫: "+quotient);
	    System.out.println("나머지: "+remainder);
	    
		sc.close();
	}
}
