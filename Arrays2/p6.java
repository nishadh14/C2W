import java.io.*;
class Demo6{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size: ");
		int s=Integer.parseInt(br.readLine());
		int arr[]=new int[s];
		System.out.println("Enter array elements: ");
		for(int i=0;i<s;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int m=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>m){
				m=arr[i];
			}
		}
		System.out.println("Minimum element in the array: "+m);
	}
}
