import java.util.Scanner;
public class Midterm{
    public static void main(String[] agrs){
        Scanner input=new Scanner(System.in);
        System.out.print("input: ");
        String date=input.nextLine();
        
        String day=date.substring(0, 2);
        int month=Integer.parseInt(date.substring(3, 5));
        String year=date.substring(6, 10);
        
       
        String[] monthOftheYear={"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        if(month == 1){
            System.out.print("Output: "+monthOftheYear[0] +" "+ day+", "+ year);
        }
        else if(month == 2){
            System.out.print("Output: "+monthOftheYear[1] +" "+ day+", "+ year);
        }
        else if(month == 3){
            System.out.print("Output: "+monthOftheYear[2] +" "+ day+", "+ year);
        }
        else if(month == 4){
            System.out.print("Output: "+monthOftheYear[3] +" "+ day+", "+ year);
        }
        else if(month == 5){
            System.out.print("Output: "+monthOftheYear[4] +" "+ day+", "+ year);
        }
        else if(month == 6){
            System.out.print("Output: "+monthOftheYear[5] +" "+ day+", "+ year);
        }
        else if(month == 7){
            System.out.print("Output: "+monthOftheYear[6] +" "+ day+", "+ year);
        }
        else if(month == 8){
            System.out.print("Output: "+monthOftheYear[7] +" "+ day+", "+ year);
        }
        else if(month == 9){
            System.out.print("Output: "+monthOftheYear[8] +" "+ day+", "+ year);
        }
        else if(month == 10){
            System.out.print("Output: "+monthOftheYear[9] +" "+ day+", "+ year);
        }
        else if(month == 11){
            System.out.print("Output: "+monthOftheYear[10] +" "+ day+", "+ year);
        }
        else{
            System.out.print("Output: "+monthOftheYear[11] +" "+ day+", "+ year);
        }
    }
}