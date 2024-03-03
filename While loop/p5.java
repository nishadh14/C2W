class p5{
    public static void main(String[] args){
        int num = 942111423;
        while(num != 0){
            int rem = num % 10;
            if(rem % 2 == 0 ){
            System.out.print((rem*rem) + " ");
            }
            num = num / 10;
        }
    }
}