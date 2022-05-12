import java.util.*;
class BodyMassIndex{
    public static void main(String args[]){
        float weight,height,BMI;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Weight = ");      
        weight = myObj.nextFloat();
        System.out.println("Height = ");
        height = myObj.nextFloat();
        BMI = (weight*703)/(height*height);
        if(BMI<18.5)
        {
            System.out.println("Underweight");
        }
        else if(BMI>=18.5 && BMI<25)
        {
            System.out.println("Normal Weight");
        }
        else
        {
            System.out.println("Overweight");        
        }
    }
}
