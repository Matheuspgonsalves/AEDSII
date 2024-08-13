public class Q01 { //Classe principal e única

    // Método main
    public static void main(String[] args){ 
        //Declaracao de variável
        String input;
        
        //Estrutura repetitiva para ler as palavras até a palavra "FIM"
        while ( !(input = MyIO.readLine()).equals("FIM") ){
            int charMaiusculos = contaChar(input);
            imprimir( charMaiusculos );
        } 
    } 

    //Metodo para contagem das letras maiusculas
    public static int contaChar(String temp){
        int count = 0;
        //Iteracao para contagem das letras maiusculas
        for (int i = 0; i < temp.length(); i++){
            //Condicao da contagem
            if( ((int)temp.charAt(i) >= 65) && ((int)temp.charAt(i) <= 90) ){
                count++;
            }
        }
        return count;
    }

    //Metodo para imprimir um numero
    public static void imprimir(int x){ 
        System.out.println(x);
    }
}
