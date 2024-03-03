
class p3{
    public static void main(String[] args){
        int num = 9689;
        int count = 0;
        while(num != 0){
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
}