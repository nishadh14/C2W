class p7{
    public static void main (String[] args){
        int num = 6;
        
        if(num%2 == 0){
            while(num >=1){
                System.out.print(num );
                num--;
            }
        }else{
            while(num >=1){
                System.out.print(num);
                num = num-2;
            }
        }
    }
}
