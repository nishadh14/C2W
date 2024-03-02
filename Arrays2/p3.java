import java.io.*;
class Demo3{
	public static void main(String[]args) throws IOException{
		int sum=0;
		int s=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size: ");
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				sum=sum+arr[i];
			}
			else{
				s=s+arr[i];
			}
		}
		System.out.println("Sum of even elements: "+s);
		System.out.println("Sum of odd elementsl: "+sum);
	}
}
