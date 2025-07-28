package com.ddu.ch10.part02;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30};
		try {// 예외 검사 하는 구문
			for(int i = 0; i<=3; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			// 에러가 났을때 예외처리를 할 구문 입력
			e.printStackTrace();
			System.out.println("arr[3]은 없는 인덱스 입니다");
		}finally {
			// finally 는 DB와의 연결통로를 닫는 용도..? (생략가능)
			System.out.println("저는 에러가 나던 안나던 무조건 실행됩니다");
		}
		System.out.println("저는 19번 라인입니다");
		
	}

}
