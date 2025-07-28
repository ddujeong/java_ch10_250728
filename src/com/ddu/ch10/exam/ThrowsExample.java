package com.ddu.ch10.exam;
//4. 아래 클래스의 메소드를 throws 구문을 사용하여 호출하는 측에서 예외 처리하도록 수정하시오.
import java.io.BufferedReader;
import java.io.FileReader;

public class ThrowsExample {
	public static void redaFile() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		System.out.println(br.readLine());
		br.close();
	}
}
