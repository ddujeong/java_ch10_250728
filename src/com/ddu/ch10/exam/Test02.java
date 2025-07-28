package com.ddu.ch10.exam;
//2. 사용자에게 문자열을 입력 받아 문자열의 길이를 출력하는 프로그램을 만드시오.
//단, 사용자가 문자열을 입력하지 않았을 경우 예외가 발생하지 않도록 처리하시오.

import java.util.Scanner;

public class Test02 {

	
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("문자열을 입력하세요 : ");
			String num = scanner.nextLine();
			try {
				for(int i = 0; i< num.length(); i++);
				System.out.println(num.length());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("문자열이 아닙니다!");
				e.printStackTrace();
			}
		}
		}
}
// 미완성