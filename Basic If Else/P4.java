//write a java program that checks a number from 0 to 5 and print its speeling.If the number is greater than 5 print greater number.
class P4{
    public static void main(String[] args){
        int var = 4;

        if(var < 0){
            System.out.println("No is less than 5.");
        }else if(var == 1){
            System.out.println("One");
        }else if(var == 2){
            System.out.println("two");
        }else if(var == 3){
            System.out.println("Three");
        }else if(var == 4){
            System.out.println("Four");
        }else if(var == 5){
            System.out.println("Five");
        }else if(var == 0){
            System.out.println("Zero");
        }else{
            System.out.println("No is greater than 5.");
        }
    }
}