import java.util.Scanner;
class Insurance{
    public static void main(String[] args){
        int age;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the person's age - ");
        age = myObj.nextInt();
        System.out.println("Enter the person's sex - ");
        String sex = myObj.next();
        System.out.println("Enter the person's health - ");
        String health = myObj.next();
        
        if(age>=25 && age<35)
        {
            if(sex.equals("male"))
            {
                if(health.equals("excellent"))
                {
                    System.out.println("Person can be insured with a maximum amount of 2 lakhs");                    
                    int amount = myObj.nextInt();
                    int premium = (amount / 1000)*4;
                    System.out.println("Premium amount = Rs 4 per 1000/ is = " + premium);
                    
                }
                if(health.equals("poor"))
                {
                    System.out.println("Person can be insured with a maximum amount of 10,000");
                    int amount = myObj.nextInt();
                    int premium = (amount / 1000)*6;
                    System.out.println("Premium amount = Rs 6 per 1000/-" + premium);

                }            
            }
            if(sex.equals("female"))
            {
                    System.out.println("Person can be insured with a maximum amount of 1 lakhs");
                    int amount = myObj.nextInt();
                    int premium = (amount / 1000)*3;
                    System.out.println("Premium amount = Rs 3 per 1000/-" + premium);
            }      
        }
        else
        {
            System.out.println("Person can't be insured");
        }      
    }
}
