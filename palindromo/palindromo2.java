import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class palindromo2 {
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
        int tamString = s.length()-1, aux = 0;

        for(int i = 0, j = tamString; i < s.length()/2; i++){
            if(s.charAt(i) == s.charAt(j)) {
                aux++;
            }
            j--;
        }
        if(aux == tamString/2) {
            return true;
        } 
        return false;
        
    }

    public static void imprimir(boolean bool){
        if(bool){
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}