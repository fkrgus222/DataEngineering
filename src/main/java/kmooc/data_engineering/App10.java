package kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class App10 {

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

		HashSet<Integer> senders = new HashSet<Integer>();

		int count = 0;
		// 보낸 사람을 Integer[] senders
		for (Email email : data) {
			int from = email.from;
			// from이 senders에 있는지 없는지 확인하고 있으면 무시하고, 없으면 추가한다.
			senders.add(from);
			System.out.println(++count);
		} // end of for
		
		System.out.println("보낸 사람의 수 : "+ senders.size());

	}
	

}

