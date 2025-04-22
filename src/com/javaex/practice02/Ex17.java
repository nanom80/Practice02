package com.javaex.practice02;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익를 입력해주세요.");
	    System.out.print("금액: ");
	    int num = sc.nextInt();
	    double result = 0;
	    
	    if(num>=0 && num<=1000) {
	    	result = num * 0.09;
	    }else if(num>1000 && num<=4000) {
	    	result = 1000 * 0.09 + 0.18 * (num-1000);
	    }else if(num>4000 && num<=8000) {
	    	result = 1000 * 0.09 + 3000*0.18 + 0.27 * (num-4000);
	    }else if(num>8000) {
	    	result = 1000 * 0.09 + 3000*0.18 + 4000*0.27 + 0.36 * (num-8000);
	    }
	    
	    if(num<0) {
	    	System.out.println("잘못 입력했습니다.");
	    } else {
	    	System.out.println("소득세는 "+result+" 입니다.");
	    }
	    
	    sc.close();
	}
}
