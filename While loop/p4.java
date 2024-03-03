class p4{
    public static void main(String[] args){
        int num = 942111423;
        int count = 0;
        while(num != 0){
            int rem = num % 10;
            if(rem % 2 == 1){
                count++;
            }
            num = num/10;
        }
        System.out.println("The odd number counts are: " + count);
    }
}