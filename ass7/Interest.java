class Interest {
    public void SI(double principal , double time){
        double interest = (principal*time*2.5);
        System.out.println("The deafult rate is : 2.5% ");
        System.out.println("The Simple Intrest : "+interest);    
    }
    public void SI(int rate , int time){
        int interest = 50000*rate*time;
        System.out.println("The default prinicpal = 50000.00 rps");
        System.out.println("The Simple intrest : "+interest);
    }
    public static void main(String[] args) {
        Interest i = new Interest();
        i.SI(12, 03);
        i.SI(45000.00 ,3.5);
    }
    
}
