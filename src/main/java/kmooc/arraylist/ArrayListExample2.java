package kmooc.arraylist;

import java.util.ArrayList;

import kmooc.data_engineering.Email;

public class ArrayListExample2 {

	public static void main(String[] args) {
		//Collection list = new ArrayList();
		//Object 클래스가 default 타입으로 설정되어 있다.
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());
		
		ArrayList<String> stringList = new ArrayList<String>();
		System.out.println(stringList.isEmpty());
		
		ArrayList<Email> emailList = new ArrayList<Email>();
		System.out.println(emailList.isEmpty());
		
	}

}
