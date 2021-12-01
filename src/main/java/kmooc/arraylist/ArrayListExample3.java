package kmooc.arraylist;

import java.util.ArrayList;

import kmooc.data_engineering.Email;

public class ArrayListExample3 {

	public static void main(String[] args) {
		//Collection list = new ArrayList();
		//Object 클래스가 default 타입으로 설정되어 있다.
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		ArrayList<String> stringList = new ArrayList<String>();
		System.out.println(stringList.isEmpty());
		System.out.println(stringList.size());
		
		ArrayList<Email> emailList = new ArrayList<Email>();
		System.out.println(emailList.isEmpty());
		System.out.println(emailList.size());
		
	}

}
