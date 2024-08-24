import java.util.Random;
class Q04 {
    public static void main(String[] args){
        String input;

        //Gerador de numero aleatorio com seed setada em 4
        Random gerador = new Random();
        gerador.setSeed(4);
        
        
        while(!(input = leInput()).equals("FIM")){
            char a = (char)('a' + Math.abs(gerador.nextInt() % 26));//Primeira ocorrencia
            char b = (char)('a' + Math.abs(gerador.nextInt() % 26));//Segunda ocorrencia
            String aux = trocaString(input, a, b);
            imprimir(aux);
        }
        
    }

    public static String leInput(){//Metodo para ler do teclado (fiz atoa)
        return MyIO.readLine();
    }
    
    //Metodo para trocar a primeira ocorrencia pela segunda
    public static String trocaString(String texto, char a, char b){
        String newString = "";

        for(int i = 0; i < texto.length(); i++){
            //Caso a primeira ocorrencia seja validade, troca pela segunda ocorrencia
            if(texto.charAt(i) == a){ 
                newString += b;
            } else {
                newString += texto.charAt(i);
            }
        }
        return newString;
    }

    public static void imprimir(String out){ //Metodo para imprimir
        MyIO.println(out);
    }
    
}