import java.io.*;
class p8{
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
            int cnt=0,sum=0;
            while(num!=0){
                cnt++;
                num=num/10;
            }
            num=arr[i];
            
            while(num!=0){
                int mult=1;
                int rem=num%10;
                for(int j=1;j<=cnt;j++){
                    mult=mult*rem;
                }
                sum=sum+mult;
                num=num/10;
            }
            if(sum==arr[i])
            System.out.println("ArmStrongNumber "+arr[i]+" found at "+i);
        }
    }
}