package com.ddu.ch10.part01;

public class NullPointerExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = null; // 참조하고 있는 문자열이 메모리에 없음
		
		System.out.println(data.length());// 문자열의 길이
	
		//NullPointerException(error)
		// 참조하고 있는 문자열이 메모리에 존재하지도 않는 문자열의 길이를 반환하려고 할때 발생

}
}