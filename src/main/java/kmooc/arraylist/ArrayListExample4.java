package kmooc.arraylist;

import java.util.ArrayList;

import kmooc.data_engineering.Email;

public class ArrayListExample4 {

	public static void main(String[] args) {
		//Collection list = new ArrayList();
		//Object 클래스가 default 타입으로 설정되어 있다.
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		System.out.println(intList.add(3));
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		System.out.println(intList.add(7));
		System.out.println(intList.add(5));
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
	}

}
