package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해주세요");
	    System.out.print("년도: ");
	    int bornYear = sc.nextInt();
	    int thisYear = 2025;
	    int age = thisYear - bornYear;
	    
	    System.out.println("올해: "+thisYear);
	    System.out.println("태어난해: "+bornYear);
	    System.out.println("나이: "+age);
	    System.out.println("=========================");
	    
	    if(age<20) {
	    	System.out.println("20살 미만 건강검진대상이 아님");
	    }else {
	    	System.out.println("20살 이상");
	    	if(age%2 == 0) {
	    		System.out.println("건강검진해");
	    		if(age>=40) {
	    			System.out.println("암검사");
	    		}else {
	    			System.out.println("암검사X");
	    		}
	    	}else {
	    		System.out.println("건강검진해 아님");
	    	}
	    }
	    
		sc.close();
	}
}

