package package1;
import java.util.*;
public class Passenger
{
	public String name;
	public String street;
	public String town;
	public int pincode;
	public int age;
	public String source;
	public String destination;

	public Passenger(String n,String s,String t,int pin,int a,String sou,String des)
{		
		this.name=n;
		this.street=s;
		this.town=t;
		this.pincode=pin;
		this.age=a;
		this.source=sou;
		this.destination=des;
	}
	public void display(){
	System.out.println("\n"+name+"\n"+street+"\n"+town+"\n"+pincode+"\n"+age+"\n"+source+"\n"+destination);
	}

}
