class Q12 { //Classe principal e unica

    public static void main(String[] args){//Metodo main
        //Declaracao de variaveis
        String input;
        boolean isEqual = false;

        
        //Estrutura Do While para executar o algoritmo
        while(verificaFim(input = MyIO.readLine())) {
            String cifra = ciframento(input, 0);
            imprimir(cifra);
        }
    }

    //Metodo que desloca os characteres da string por 3 a direita
    public static String ciframento(String temp, int pos){
        //Variaveis do metodo
        char[] newChar = new char[temp.length()];
        String aux = "";
        int fim = temp.length();

        if(pos < fim) {
            newChar[pos] = (char) (temp.charAt(pos)+3);
            aux += newChar[pos] + ciframento(temp, pos+1) ;
            
        }

        return aux;
    }

    public static void imprimir(String out){
        MyIO.println(out);
    }

    public static boolean verificaFim(String texto) {
        if(texto.charAt(0) == 'F' && texto.charAt(1) == 'I' && texto.charAt(2) == 'M') {
            return false;
        } else {
            return true;
        }
    }
}