import java.io.*;
class Demo1{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size: ");
		int s=Integer.parseInt(br.readLine());
		int arr[]=new int[s];
		System.out.println("Enter array elements: ");
		for(int i=1;i<s;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
				sum=sum+arr[i];
			}
		System.out.println(sum);
	}
}
