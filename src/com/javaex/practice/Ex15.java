package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력해주세요.");
	    System.out.print("기호: ");
	    String s = sc.nextLine();
	    
	    System.out.print("숫자1: ");
	    float num1 = sc.nextFloat();
	    System.out.print("숫자2: ");
	    float num2 = sc.nextFloat();
	    float result = 0;
	    
	    if(s.equals("+")) {
	    	result = num1 + num2;
	    }else if (s.equals("-")) {
	    	result = num1 - num2;
	    }else if (s.equals("*")) {
	    	result = num1 * num2;
	    }else if (s.equals("/")) {
	    	if(num2==0) {
	    		System.out.println("계산할 수 없습니다.");
	    	}else {
	    		result = num1 / num2;
	    	}
	    }else {
	    	System.out.println("계산할 수 없는 기호입니다.");
	    }
	    
	    if(num2 != 0) {
	    	System.out.println("결과는: "+result);
	    }
	    
		sc.close();
	}
}
