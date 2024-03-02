//write a java progrm to check if a number is even or odd.
class P1{
    public static void main(String[] args){
        int var = 10;
        if(var == 0){
            System.out.println(var + " is Whole Number");
        }else if(var % 2 == 0){
            System.out.println(var + " is even no");
        }else{
            System.out.println(var + " is odd no");
        }
    }
}