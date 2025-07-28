package com.ddu.ch10.part02.throwstest;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -1;
		if(age < 0) {
			throw new IllegalArgumentException("나이는 음수가 올수 없습니다");
			//System.out.println("나이는 음수가 올수 없습니다");
			// 강제로 에러를 내는..?(강제 예외 발생!)
		}
		
		try {
			throw new ArithmeticException("모든 수는 0으로 나눌 수 없어요!");
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("저는 12번 라인입니다");
	}

}
