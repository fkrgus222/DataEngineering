package kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

public class App13 {
//treeSet을 사용해서 원하는 값의 이전, 이후값 찾기. 최소값, 최대값 찾기에도 용이하다.
	public static Email[] getData() throws IOException {
		Email[] data = new Email[420045];
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hyun\\DE//email.txt"));
		int index = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;

			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			data[index++] = new Email(from, to);
		}
		br.close();
		return data;
	}

	public static void main(String[] args) throws IOException {

		Email[] data = getData();

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		for (Email email : data) {
			treeSet.add(email.from);
			treeSet.add(email.to);
		}
		
		System.out.println("100000 이전의 수 : " + treeSet.lower(100000));
		System.out.println("100000 이후의 수 : " + treeSet.higher(100000));
		System.out.println("가장 작은 수 : " + treeSet.first() );
		System.out.println("가장 큰 수 : " + treeSet.last() );
		
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
