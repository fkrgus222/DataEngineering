package kmooc.data_engineering;

public class Email {


	public int from;
	public int to;
	
	
	Email(int from, int to){
		this.from = from;
		this.to = to;
		
	}
	
	public String toString() {
		return "from ==> " + from + "to ==> " + to;
	}
	
	
}
