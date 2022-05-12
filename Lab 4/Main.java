package worker;
import java.util.*;
import worker.*;
public class Main{
public static void main(String [] args){
	FullTime w1 = new FullTime("ram","manager",40.0);
	w1.checkpay(300.0);
	w1.display();

	PartTime w2 = new PartTime("apurbo","sde",25.0);
	w2.checkpay(300);
	w2.display();
}
}
