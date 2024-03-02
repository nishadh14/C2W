import java.io.*;
class p6{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size:");
        int size=Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        System.out.println("enter the data:");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i=0;i<=arr.length;i++){
            int sum=0;
            int num=arr[i];
            int rev=0;

            while(num!=0){
                int rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            if(rev==arr[i])
            System.out.println("palindrom number"+rev+"found at"+i);
        }
    }
}