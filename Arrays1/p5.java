import java.io.*;
class Demo5{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size: ");
		int s=Integer.parseInt(br.readLine());
		int arr[]=new int[s];
		System.out.println("Enter array elements: ");
		for(int i=0;i<s;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
			for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
				System.out.println(arr[i]+" ");
			}
			}
		
		System.out.println();
	}
}
