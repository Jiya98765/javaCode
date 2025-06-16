class jiya23{
    public static void main(String[] args){
        pattonPrenting();
        pattonpramid();
    }

    public static void pattonPrenting(){
        for(int i = 0; i<=4;i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattonpramid(){
        for(int i =0;i<=5 ;i++){
            for(int j=i+1 ; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}