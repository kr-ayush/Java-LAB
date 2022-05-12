package package2;
import java.util.*;
public class Train{
	public int no;
	public String start;
	public String end;
	public String date;
	
	public Train(int n,String s,String e,String d){		
		this.no=n;
		this.start=s;
		this.end=e;
		this.date=d;
	}
	
	public void display(){
		System.out.println("\n"+no+"\n"+start+"\n"+end+"\n"+date);
	}
}
