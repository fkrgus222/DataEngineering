package kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App6 {

	public static void app2() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hyun\\DE//email.txt"));
		int lineCount = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			lineCount++;
			if (line.startsWith("#"))
				continue;
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
//			System.out.println(new Email(from, to));
		}
		System.out.println("줄 수 : " + lineCount);
		br.close();
	}

	public static void app3() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hyun\\DE//email.txt"));
		int eventCount = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			eventCount++;
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
//			System.out.println(new Email(from, to));
		}
		System.out.println("이벤트 수 : " + eventCount);
		br.close();
	}

	public static void app4() throws IOException {
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
			if (from < min) {
				min = from;
			}
			int to = Integer.parseInt(array[1]);
			if (to < min) {
				min = to;
			}
//			System.out.println(new Email(from, to));
		}
		System.out.println("최소의 사람 ID : " + min);
		br.close();
	}

	public static void app5() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hyun\\DE//email.txt"));
		int max = Integer.MIN_VALUE;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			if ( from > max ) {
				max = from;
			}
			int to = Integer.parseInt(array[1]);
			if ( to < max ) {
				max = to;
			}
//			System.out.println(new Email(from, to));
		}
		System.out.println("최대 사람 ID : " + max);
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		app2();
		app3();
		app4();
		app5();
	}

}
