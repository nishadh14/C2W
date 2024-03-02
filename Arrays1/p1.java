import java.io.*;
class Demo1{
	public static void main(String[]args) throws IOException{
		int sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size: ");
		int s=Integer.parseInt(br.readLine());
		int arr[]=new int[s];
		System.out.println("Enter array elements: ");
		for(int i=0;i<s;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==1){
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}
