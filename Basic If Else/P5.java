//Write a java program , in which according to month no. print the no. of days in that month.
import java.io.*;
class P5{
    public static void main(String[] args)throws IOException{
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enetr the No. Between 1-12:");
        int num =Integer.parseInt(br1.readLine());
        if(num == 1){
            System.out.println("jan has 31 days");
        }else if(num == 2){
            System.out.println("Feb has 28 or 29 days");
        }else if(num == 3){
            System.out.println("March has 31 days");
        }else if(num == 4){
            System.out.println("April has 30 days");
        }else if(num == 5){
            System.out.println("May has 31 days");
        }else if(num == 6){
            System.out.println("June has 30 days");
        }else if(num == 7){
            System.out.println("July has 31 days");
        }else if(num == 8){
            System.out.println("August has 31 days");
        }else if(num == 9){
            System.out.println("September has 30 days");
        }else if(num == 10){
            System.out.println("Octumber has 31 days");
        }else if(num == 11){
            System.out.println("November has 30 days");
        }else if(num == 12){
            System.out.println("December has 31 days");
        }else{
            System.out.println("invalid no.");
        }
    }
}