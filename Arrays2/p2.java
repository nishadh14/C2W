import java.io.*;
class Demo2{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		int c=0;
		System.out.println("Enter size: ");
		int s=Integer.parseInt(br.readLine());
		int arr[]=new int[s];
		System.out.println("Enter array elements: ");
		for(int i=0;i<s;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
			      c++;
			}
			else{
				count++;
			}
		}
		System.out.println("No.of even numbers: "+count);
		System.out.println("No. of odd numbers: "+c);
	}
}
