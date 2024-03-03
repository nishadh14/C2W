class p10{
    public static void main(String[] args){
        int num = 1221;
        int rev = 0 ;
        int temp = num;
        while(temp!=0){
            int rem = temp %10;
            rev = rev *10 + rem;
            temp = temp/10;
        }

        if(num == rev){
            System.out.println("The Number is palindrome");
        }else{
            System.out.println("The numner is not palindrome");
        }
    }
}