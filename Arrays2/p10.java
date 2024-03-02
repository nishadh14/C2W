import java.io.*;
class Demo10{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size: ");
		int s=Integer.parseInt(br.readLine());
		int arr[]=new int[s];
		System.out.println("Enter array elements: ");
		for(int i=0;i<s;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int sum=0;
		System.out.println("OUTPUT: ");
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			while(temp!=0){
				int rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
			}
			if(sum%2==0){
				System.out.println(arr[i]);
			}
			sum=0;
		}
		
	}
}
