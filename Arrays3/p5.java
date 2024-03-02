import java.io.*;
class p5{
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
            int sum=0;
            for(int j=1;j<arr[i];j++){
                if(arr[i]%j==0)
                    sum=sum+j;
            }
            if(sum==arr[i]){
                System.out.println("Pefect number "+arr[i]+" found at "+i);
            }
        }
    }
}