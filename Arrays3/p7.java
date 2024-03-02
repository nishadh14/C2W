import java.io.*;
class p7{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size:");
        int size=Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        System.out.println("Enter the data:");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<arr.length;i++){
            int num=arr[i]; 
            int sum=0;
            while(num!=0){
                int rem=num%10;
                int fact=1;
                for(int j=1;j<=rem;j++)
                    fact=fact*j;
                sum=sum+fact;
                num=num/10;
            }
            if(sum==arr[i])
                System.out.println("Strong number "+arr[i]+" found at "+i);
                }
    }
}