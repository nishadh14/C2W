//Write a program in java to accept three numbers and check whether they are pythogorean triplets or not.
import java.io.*;

class P9{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the three number to know the Pythogorus Triplets : ");
        System.out.print("num1 = ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println();
        System.out.print("num2 = ");
        int num2 = Integer.parseInt(br.readLine());
        System.out.println();
        System.out.print("num3 = ");
        int num3 = Integer.parseInt(br.readLine());
        System.out.println();

        if(num1*num1 + num2 * num2 == num3*num3 || num2*num2 + num3*num3 == num1*num1 || num3*num3 + num1*num1 == num2*num2){
            System.out.println("Numbers are pythogorean triplet");
        }else{
            System.out.println("Not pythorean triplet");
        }
    }
}