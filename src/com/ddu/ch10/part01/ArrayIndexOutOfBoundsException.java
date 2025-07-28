package com.ddu.ch10.part01;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40};
		System.out.println(arr[4]);
		// ArrayIndexOutOfBoundsException(error)
		// 배열요소가 4개(0,1,2,3) 이므로 인덱스는 3까지만 존재
		
		List<String> list = new ArrayList<String>();
		list.add("korea"); // 0 리스트에 요소 넣기
		list.add("Japan"); // 1
		
		System.out.println(list.get(2)); // 리스트 요소 가져오기
		// 0 -> korea , 1 -> Japan
		// ArrayIndexOutOfBoundsException(error)
		// 존재하지 않는 2번 배열에 접근하려 함
		
	}

}
