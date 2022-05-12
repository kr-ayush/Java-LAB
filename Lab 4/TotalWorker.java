package worker;
import java.util.*;
public class TotalWorker{
	public String name;
	public String designation;
	public Double hours;
	public Double salary;
	public TotalWorker(String n,String d,Double h){
		this.name=n;
		this.designation=d;
		this.hours=h;
	}
	public void display(){
		System.out.println("\n"+name+"\n"+designation+"\n"+hours+"\n"+salary);
	}
}
