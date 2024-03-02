//Write a program to check day number (1-7) and the corresponding day of week.
import java.io.*;
class P8{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number between 1-7 : ");
        int num = Integer.parseInt(br.readLine());

        if(num == 1){
            System.out.println("Monday");
        }else if(num == 2){
            System.out.println("Tuesday");
        }else if(num == 3){
            System.out.println("Wednesday");
        }else if(num == 4){
            System.out.println("Thursday");
        }else if(num == 5){
            System.out.println("Friday");
        }else if(num == 6){
            System.out.println("Saturday");
        }else if(num == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Number is Invalid");
        }
    }
}
