package com.ddu.ch10.part02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 에러를 상세하게 콘솔에 찍어줌
		}
			
	}

}
