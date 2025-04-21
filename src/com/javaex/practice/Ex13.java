package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자: ");
	    int num1 = sc.nextInt();
	    System.out.print("두 번째 숫자: ");
	    int num2 = sc.nextInt();
	    
	    int bigNum = 0;
	    int smallNum = 0;
	    
	    if(num1>=num2) {
	    	bigNum = num1;
	    	smallNum = num2;
	    } else {
	    	bigNum = num2;
	    	smallNum = num1;
	    }
	    
	    if(bigNum%smallNum == 0) {
	    	System.out.println(smallNum+" 은(는) "+bigNum+" 의 약수입니다.");
	    }else {
	    	System.out.println(smallNum+" 은(는) "+bigNum+" 의 약수가 아닙니다.");
	    }
	    
	    
		sc.close();
	}
}
