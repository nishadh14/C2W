import java.io.*;
class p4{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size :");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        System.out.println("Enter the elemets in array:");
        for(int i=0;i<arr.length;i++)
            arr[i]=Integer.parseInt(br.readLine());
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=2){
                    int count=0;
                    for(int j=2;j*j<=arr[i];j++){
                        if(arr[i]%j==0)
                        count++;
                    }
                    if(count==0)
                        System.out.println("Prime Number "+arr[i]+" found at "+i+" index");
                }
            }
    }
}
