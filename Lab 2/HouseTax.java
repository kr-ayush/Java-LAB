import java.util.*;
class House
{
    public void cal(float pv, int ind)
    {
        float tax;
        if(ind==0)
        {
            tax=pv*(float)(0.005);
        }
        else
        {
            tax=pv*(float)(0.10);
        }
        System.out.println("Total tax:"+tax);
    }
}
class RentedHouse extends House
{
    public void hp()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Enter total property value");
        float pv=obj.nextFloat();
        System.out.println("Press 0 if owned house or Press 1 if rented house:");
        int ind=obj.nextInt();
        cal(pv,ind);
        
    }
}
class HouseTax{
    public static void main(String args[]){
    
        int i;
        Scanner obj=new Scanner(System.in);
        RentedHouse obj1=new RentedHouse();
        do
        {
            obj1.hp();
            System.out.println("Press 1 to continue 0 to stop");
            i=obj.nextInt();
        }
        while(i != 0);      
    }
}
