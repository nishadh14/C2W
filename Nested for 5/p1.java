import java.io.*;

class p1{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the No. of Rows: ");

        int ro = Integer.parseInt(br.readLine());
        int num = ro;
        int ch = ro + 64;

        for(int i=1;i<=ro;i++){
            for(int j=1;j<=ro;j++){
                if(i%2 == 1){
                    System.out.print(num-- +""+(char)ch-- +" ");
                }else{
                    System.out.print(num++ + ""+(char)ch++ + " " );
                }
            }
            if(i%2==1){
                num++;
                ch++;
            }else{
                num--;
                ch--;
            }
            System.out.println();
        }
    }
}