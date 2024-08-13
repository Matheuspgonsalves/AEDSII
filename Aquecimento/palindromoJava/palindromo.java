
class palindromo {
    public static void main(String[] args){
        
        String string ;
        
        while(!(string = MyIO.readString()).equals("FIM")){
            boolean isPalindromo = isPalindromo(string);

            imprimir(isPalindromo);
        }
    }

    public static boolean isPalindromo(String s){
        int tamString = s.length()-1, aux = 0;

        for(int i = 0, j = s.length()-1; i < s.length(); i++){
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
            MyIO.println("SIM");
        } else {
            MyIO.println("NAO");
        }
    }
}