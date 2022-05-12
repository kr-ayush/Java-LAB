package worker;
import java.util.*;
import worker.FullTime;
public class PartTime extends TotalWorker{
	PartTime(String n,String d,Double h){
	super(n,d,h);
	}
	public void checkpay(double wage){
		if(hours<30)
			this.salary = hours*wage;	
		else
			this.salary= hours*wage*1.5;
}	
}
