class p6{
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        int mul  = 1;
        while(i <= 10){
            if(i%2 == 0){
                sum = sum + i;

            }else{
                mul = mul * i;
            }
            i++;
        }
        System.out.println("The sum of even numbers are from 1 to 10: " + sum);
        System.out.println("The multiplication of odd numbers are from 1 to 10: " + mul);
    }
}