class p8{
    public static void main(String[] args){
        int days = 7;
        while(days!=-1){
            if(days == 0){
                System.out.println(days+" Date is overdue.");
            }else{
                System.out.println(days+" days are remaining.");
            }
            days--;
        }
    }
}