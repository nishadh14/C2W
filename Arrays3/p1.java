import java.io.*;
class p1{
    public static void main(String []args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter The size:");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter the elemets in array:");

        for(int i=0;i<arr.length;i++)
                arr[i] = Integer.parseInt(br.readLine());

       for(int i=0;i<arr.length;i++){
             int cnt=0;
             int temp =arr[i];
             while(temp!=0){
                cnt++;
                temp=temp/10;
             
          }
    System.out.println("count of digit in number"+arr[i]+"="+cnt);
       }
    }

}