package worker;
import java.util.*;
import worker.*;
public class FullTime extends TotalWorker{
	FullTime(String n,String d,Double h){
	super(n,d,h);
	}
	public void checkpay(Double wage){
		this.salary=50*wage;
}
}
