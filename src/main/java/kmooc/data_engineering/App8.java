package kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//중복 제거 이메일 보낸 사람들의 수 구하기

public class App8 {

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

		// 265213 ID가 있는지 확인하기 - "발견" 이라고 출력
		for (Email email : data) {
			if (email.from == 265213) {
				System.out.println("발견");
				System.exit(1);
			}
			if (email.to == 265213) {
				System.out.println("발견");
				System.exit(1);
			}

		}
		System.out.println("미발견");

	}

}
