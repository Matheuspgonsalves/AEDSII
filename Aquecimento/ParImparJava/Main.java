import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        do{
            N = sc.nextInt();
            if(N > 0){
                if(N % 2 == 0){
                    System.out.println("P");
                } else {
                    System.out.println("I");
                }
            }
        }while(N != 0);

        

        sc.close();
    }
}