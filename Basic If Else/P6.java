//Write a program to find maximum between three numbers.

class P6{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 30;
        int num3 = 30;

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is Greater");
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is Greater");
        }else if(num3 > num1 && num3 > num2){
            System.out.println(num3 +" is Greater");
        }else if(num1 > num2 && num1 == num3){
            System.out.println(num1 + "," + num2 + " are greater" );
        }else if(num2 > num3 && num2 == num1){
            System.out.println(num2 + "," + num1 + " are greater" );
        }else if(num3 > num1 && num3 == num2){
            System.out.println(num3 + "," + num2 + " are greater");
        }else{
            System.out.println("all are same");
        }
    }
}