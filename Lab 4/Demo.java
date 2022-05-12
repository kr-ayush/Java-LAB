package irctc;
import package1.Passenger;
import package2.Train;

public class Demo{
public static void main(String [] args){	
            Passenger p1= new Passenger("joyraj","Ln street","Habra",743223,23,"kolkata","chennai");
            p1.display();

	Train t1 = new Train(200547,"Hawrah","MGR","5/4/2022");
	t1.display();
       }
}
