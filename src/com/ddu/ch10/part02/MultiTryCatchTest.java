package com.ddu.ch10.part02;

public class MultiTryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			
			int[] arr  = {1,2,3};
			System.out.println(arr[4]); // index out of bounds 에러!
			int a= 10 / 0; // by zero 에러!
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch ( IndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		System.out.println("저는 19번 줄입니다.");
	}
		
}
// (Exception e) 로 작성시 모든 에러를 잡을 수 있음
// but 여러개의 에러가 있어도 맨 처음 에러만 잡음
