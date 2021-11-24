package kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hyun\\DE//email.txt"));
		int min = Integer.MAX_VALUE;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			if ( from < min ) {
				min= from;
			}
			int to = Integer.parseInt(array[1]);
			if ( to < min ) {
				min = to;
			}
			System.out.println(new Email(from, to));
		}
		System.out.println("최소의 사람 ID : " + min);
		br.close();
	}

}
