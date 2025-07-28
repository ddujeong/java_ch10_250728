package com.ddu.ch10.exam;
//3. 사용자에게정수를 입력 받아 짝수인지 홀수인지 구분하요 " 짝수!" 또는 "홀수!"로 출력하는 프로그램을 만드시오.
//단 숫자가 아닌 값 입력시 예외가 발생하지 않도록 처리하고,
//정수가 아닌 값이 입력 되었을때는 "정수가 아닙니다!"라고 출력하시오.

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("정수를 입력하세요 : ");
			num = scanner.nextInt();
			if (num % 2 ==0) {
				System.out.println("짝수!");
			} else {
				System.out.println("홀수!");
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("정수가 아닙니다!");}
			
	}
	}


