import java.util.*;
class TempRecord{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int temp[][] = new int[10][4];
        System.out.println("Enter the code for cities - ");        
        for(int i=0;i<10;i++){
            temp[i][0] = myObj.nextInt();        
        }
        System.out.println("Enter Temperature of the cities - ");
        for(int i=0;i<10;i++){
            for(int j=1;j<4;j++){
                temp[i][j] = myObj.nextInt();            
            }        
        }
        System.out.println("City Temperature Chart - ");
        for(int i=0;i<10;i++){
            for(int j=0;j<4;j++){
                System.out.print(" "+temp[i][j]);            
            }
            System.out.println("");
        }
        int max = 0;
        int min = 0;
        int city1 = 0,city2 = 0;
        int daymin=0,daymax=0;
        for(int i=0;i<10;i++){
            for(int j=1;j<4;j++){
                if(max>temp[i][j]){
                    max = temp[i][j];
                    daymax = j;
                    city1 = i+1;
                }
                if(min<temp[i][j]){
                    min = temp[i][j];
                    daymin = j;
                    city2 = i+1;                
                }            
            }        
        }
        System.out.println("Max Temp -"+max);
        System.out.println("Max Day -"+daymax);
        System.out.println("City -"+city1);
        System.out.println("Min Temp -"+max);
        System.out.println("City -"+city2);
    }
}