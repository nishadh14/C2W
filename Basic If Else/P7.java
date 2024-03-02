//Calculate profit or loss.
//Write a program that takes the cost price and selling price (take it hardcoded) and calculate its profint or loss.
import java.io.*;
class P7{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Cost Price : ");
        int cost = Integer.parseInt(br.readLine());
        System.out.println("Enter the Selling price : ");
        int sell = Integer.parseInt(br.readLine());

        if(cost < sell){
            int profit = sell - cost;
            System.out.println("Their is profit of " + profit); 
        }else if(cost > sell){
            int loss = cost - sell;
            System.out.println("Their is loss of "+ loss);
        }else{
            System.out.println("No profit , no loss.");
        }
    }
}