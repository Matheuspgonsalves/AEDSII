import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Q01 {
    public static void main(String[] args) throws IOException{
        //Classes in e out
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String string ;
        
        while(!(string = in.readLine()).equals("FIM")){
            boolean isPalindromo = isPalindromo(string);

            imprimir(isPalindromo);
        }
    }

    public static boolean isPalindromo(String s){
        int tamString = s.length();

        for(int i = 0; i < tamString/2; i++){
            if(s.charAt(i) != s.charAt(tamString-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void imprimir(boolean bool){
        if(bool){
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}