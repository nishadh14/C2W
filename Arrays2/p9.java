
import java.io.*;
class Demo9{
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
		int arr2[]=new int[s+n];
		for(int i=0;i<arr.length;i++){
			arr2[i]=arr[i];
		}
			for(int j=0;j<arr1.length;j++){
				arr2[n+j]=arr1[j];
			}
			System.out.println("Merged array: ");
			for(int i=0;i<arr2.length;i++){
				System.out.println(arr2[i]);
			}
		}
	}

