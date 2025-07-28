package com.ddu.ch10.part02.throwstest;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsSample throwsSample = new ThrowsSample();
//		try {
//			throwsSample.zeroDivid(); // 0 나누기 에러 (by zero)
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("모든 수는 0 으로 나눌 수 없음");
//		}
//		
		try {
			throwsSample.zeroDivid();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 0 나누기 에러 (by zero)
		System.out.println("저는 10번 라인입니다.");
		
		
	}

}
