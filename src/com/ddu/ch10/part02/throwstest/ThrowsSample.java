package com.ddu.ch10.part02.throwstest;

public class ThrowsSample {

	public void zeroDivid() throws Exception {
		// 메서드를 호출하는 쪽에서 예외처리를 하라고 강제하는 구문 throws
		System.out.println(10/0);
//		try {
//			System.out.println(10/0);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
		//System.out.println("모든 수는 0 으로 나눌 수 없음");
//		}
//		

	}

}
// 메서드에 복잡한 구문이 들어가있을때 throws 사용으로 가독성 올리기
// 메서드에 복잡한 구문이 들어가있을때 throws 사용으로 유지보수가 쉬움
// 예외처리 구문을 호출한 메인클래스로 throws 사용으로 몰아줌(강제)