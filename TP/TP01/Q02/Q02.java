import java.util.Scanner;
class Q02 { //Classe principal e unica

    public static void main(String[] args){//Metodo main
        //Declaracao de variaveis
        Scanner sc = new Scanner(System.in);
        String input;
        String fim = "FIM";
        boolean isEqual = false;

        //Estrutura Do While para executar o algoritmo
        do{
            input = MyIO.readLine(); 

            //Estrutura lógica para verificar se a palavra "FIM" foi lida
            if(input.length() != fim.length()){
                isEqual = true;
            } else {
                for(int i = 0; i < input.length(); i++){
                    if(input.charAt(i) != fim.charAt(i)){
                        isEqual = true;
                        break;
                    } else {
                        isEqual = false;
                    }
                }
            }
            
            if(isEqual){
                String cifra = ciframento(input);
                imprimir(cifra);
            }

        }while(isEqual);
    }

    //Metodo que desloca os characteres da string por 3 a direita
    public static String ciframento(String temp){
        //Variaveis do metodo
        char[] newChar = new char[temp.length()];
        String aux = "";

        //Estrutura de repeticao que modifica os characteres
        for(int i = 0; i < temp.length(); i++){
            newChar[i] = (char) (temp.charAt(i)+3);
            aux += newChar[i];
        }        
        return aux;
    }

    public static void imprimir(String out){
        MyIO.println(out);
    }
}