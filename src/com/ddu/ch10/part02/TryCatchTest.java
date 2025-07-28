package com.ddu.ch10.part02;

public class TryCatchTest {
	public static void main(String[] args) {
			
	 int num = 0;
	 // num 값이 0이 나올 수도 있을때 예외 검사
	 try{
		 int result = 100 / num;
		 System.out.println(result);

	 } catch(ArithmeticException e) {
		 System.out.println("모든 수는 0으로 나눌수 없습니다. num 값을 다시 확인하세요"); 
		 e.printStackTrace();
	 } 
	 System.out.println("저는 15번 라인입니다");
	
	}
}