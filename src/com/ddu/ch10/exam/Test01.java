package com.ddu.ch10.exam;

import java.util.Scanner;
//1. 사용자에게 두 수를 입력 받아 첫 번째 수를 두번째 수로 나눈 몫을 출력하는 프로그램을 만드시오.
//단, 두번째 수로 입력된 숫자값이 0일때에도 예외가 발생하지 않도록 처리하시오.


public class Test01 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
			int a;
			int b;
			System.out.print("첫번쩨 정수를 입력하세요 : ");
		try{ a = scanner.nextInt();
			System.out.print("두번째 정수를 입력하세요 : ");
			b = scanner.nextInt();
			double divid = (double)a / b;
			System.out.println(divid);
			} catch (Exception e){
			System.out.println("모든 수는 0으로 나눌 수 없습니다");
		}scanner.close();
	}

}
// try 시작점 조정
	