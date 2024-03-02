import java.io.*;
class Demo8
{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array: ");
		int s=Integer.parseInt(br.readLine());
		int arr[]=new int[s];
                System.out.println("Enter size of array 2: ");
		int n=Integer.parseInt(br.readLine());
		int arr1[]=new int[n];
		System.out.println("Enter array1 elements: ");
		for(int i=0;i<s;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter elements of array2: ");
		for(int j=0;j<n;j++){
			arr1[j]=Integer.parseInt(br.readLine());
		}
		int flag=0;
		System.out.println("Uncommon elements are: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length;j++){
			if(arr[i]==arr1[j]){
				flag=1;
			}
		}
		if(flag==0){
			System.out.println(arr[i]);
		}
		flag=0;
		}

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length;j++){
			if(arr[i]==arr1[j]){
				flag=1;
			}
		}
		if(flag==0){
			System.out.println(arr1[i]);
		}
		flag=0;
		}

	}
}

