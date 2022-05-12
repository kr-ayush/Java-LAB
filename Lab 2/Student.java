import java.util.*;
class Student{
    Student(int rno,int w, int h, String name,int dob)
    {
        System.out.println("Roll no:"+rno);
        System.out.println("Name:"+name);
        System.out.println("DOB:"+dob);
        System.out.println("Weight:"+w);
        System.out.println("Height:"+h);
    }
    
    public static void main(String args[])
    {
        int n,rno,w,h,age;
        String name; 
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number of student:");
        n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("----------------------Enter Employee "+i+" Details---------------------------------");
            System.out.println("Enter roll no:");
            rno=obj.nextInt();
            System.out.println("Enter student name:");
            name=obj.next();
            System.out.println("Enter age:");
            age=obj.nextInt();
            System.out.println("Enter weight(kg):");
            w=obj.nextInt();
            System.out.println("Enter height(cm):");
            h=obj.nextInt();
            System.out.println("----------------------Fetching Employee "+i+" Details---------------------------------");
            Student ob=new Student(rno,w,h,name,age);
            if(age>=19 && w>75 && h<172)
            {
                System.out.println("-------------------------------------------------------");
                System.out.println("19 years  old or more with weight above 75 kg but height less than 172 cm student roll no:"+rno);
            }
        }
    }
}
