class Q05 {
    public static void main(String[] args){
        //Variaveis da main
        String entradaString = "";

        while(!(entradaString = MyIO.readLine()).equals("0")){//Repita até que encontre o '0'

            String[] splitEntrada = transformaEntradaEmVetor(entradaString);// Variavel para armazenar o split da string

            int n = Integer.parseInt(splitEntrada[0]);//Variavel para armazenar a quantidade de boleanos lid
            
            boolean[] booleanos = new boolean[n];//inicializacao 
            booleanos = transformaEmBool(splitEntrada, n);//array para armazenar os boleanos de entrada

            int lastPosition = (splitEntrada.length)-1;

            
        }
    }

    public static String[] transformaEntradaEmVetor(String entradaString){//
        String[] splitEntrada;
        if(entradaString.charAt(0) == '2'){// Estrutura para dividir a string em pedaços, sendo que a expressao será armazena inteiramente na ultima posicao
            splitEntrada = entradaString.split(" ",4);
        } else {
            splitEntrada = entradaString.split(" ",5);
        }
        return splitEntrada;
    }
    
    public static boolean[] transformaEmBool(String[] splitEntrada, int n){//Metodo para organizar os valores boleanos em um array
        boolean booleanos[] = new boolean[n];
        
        for (int i = 1; i <= n; i++) {//Repeticao para armazenar os valores boleanos
            String valor = splitEntrada[i];
            booleanos[i-1] = Boolean.parseBoolean(valor.equals("1")?"true":"false"); // Converte '1' para true e '0' para false
        }
        return booleanos;
    }
    
}