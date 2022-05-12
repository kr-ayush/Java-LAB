import java.lang.*;
import java.util.Scanner;
class UG
{
	 public String name;
	 public String udegree;
	 public String branch;
	 public float gpa;
	 public int sem;
	 public String school;
	 public float smarks;
	 UG(String a,String b,String c,Float d ,int e,String f,float g)
	 {
        name=a;
        udegree=b;
        branch=c;
        gpa=d;
        sem=e;
        school=f;
        smarks=g;
	  }
}
class PG extends UG
{
    public String pdegree;
    public String ucollege;
    public float cgpa;
    PG(String a,String b,String c,Float d ,int e,String f,float g,String h,String i,float j)
	{
		super(a,b,c,d,e,f,g);
		pdegree=h;
		ucollege=i;
		cgpa=j;
	}
}
class Phd extends PG
{
	 public String spc;
	 Phd(String a,String b,String c,Float d ,int e,String f,float g,String h,String i,float j,String k)
	 {
	 	super(a,b,c,d,e,f,g,h,i,j);
	 	spc=k;
	 }
	 void disp()
{
	    System.out.println("STUDENT DETAILS....");
	    System.out.println("Student Name..."+name);
	    System.out.println("School Name.."+school);
	    System.out.println("School In terms of percentage"+smarks);
	    System.out.println("********************");
	    System.out.println("UG Degree Details...");
        System.out.println("UG Degree Namne..."+udegree);
        System.out.println("UG  Degree Branch Name.. "+branch);
        System.out.println("Degree Marks(GPA)..."+gpa);
        System.out.println("Total Semister.."+sem);
        System.out.println("********************");
        System.out.println("PG Degree Details...");
        System.out.println(" BASi PG Degree NAME.."+pdegree);
        System.out.println("UG College Name.."+ucollege);
        System.out.println("PG CGPA..."+cgpa);
        System.out.println("PHD speciliazation.."+spc);
}
}
class CourseDemo
{
	public static void main(String arg[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number of students");
		int n=obj.nextInt();
		Phd stud[]= new Phd[n];
		for(int i=0;i<stud.length;i++)
		{
			 stud[i] = new Phd("Rahul","BCA","Comp",9.5f,6,"SSDJ",85.2f,"MCA","SSR",9.28f,"Data sciecne");
			stud[i].disp();
	}
	}
}
