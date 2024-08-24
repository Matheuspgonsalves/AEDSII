import java.util.Random;
class Q04 {
    public static void main(String[] args){
        //Variaveis
        String input;
        Random gerador = new Random();
        gerador.setSeed(4);
        
        while(!(input = leInput()).equals("FIM")){
            String aux = trocaString(input);
            imprimir(aux);
        }
        
    }

    public static String leInput(){
        return MyIO.readLine();
    }
    
    public static String trocaString(String temp){
        //Variaveis do metodo
        String aux = "";
        char[] newChar = new char[temp.length()];
        //Variaveis e set para utilizar a classe random
        
        int a = (char)'a' + Math.abs(gerador.nextInt() % 26);
        int b = 'a' + Math.abs(gerador.nextInt() % 26);

        for(int i = 0; i < temp.length(); i++){
            newChar[i] = ( char ) ( temp.charAt(i) );
            if(newChar[i] == (char)a){
                newChar[i] = (char)b;
            }
            aux += newChar[i];
        }
        return aux;
    }

    public static void imprimir(String out){
        MyIO.println(out);
    }
    
}