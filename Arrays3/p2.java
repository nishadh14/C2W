import java.io.*;
class p2{
    public static void main (String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size :");
        int size = Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        System.out.println("enter the element in array:");

        for(int i=0;i<arr.length;i++)
            arr[i]=Integer.parseInt(br.readLine());

        for(int i=0;i<arr.length;i++){
            int rev=0;
            int temp =arr[i];
            while(temp!=0){
                int rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            System.out.println(rev);
        }
    }
}