import java.io.*;
class Demo3{
	public static void main(String[]args) throws IOException{
		int mul=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size: ");
		int s=Integer.parseInt(br.readLine());
		int arr[]=new int[s];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2==1){
				mul=mul*arr[i];
			}
		}
		System.out.println(mul);
	}
}
