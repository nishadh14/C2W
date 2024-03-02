class Demo10{
    public static void main(String[]args){
        int r=4;
        int n=1;
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r;j++){
                System.out.print(n++ +" ");
            }
            n--;
            System.out.println();
        }

    }
}