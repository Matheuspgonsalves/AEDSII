class Q05 {
    public static void main(String[] args){
        //Variaveis da main
        String entradaString = "";

        while(!(entradaString = MyIO.readLine()).equals("0")){//Repita até que encontre o '0'

            String[] splitEntrada = transformaEntradaEmVetor(entradaString);// Variavel para armazenar o split da string

            //int n = Integer.parseInt(splitEntrada[0]);//Variavel para armazenar a quantidade de boleanos lid
            
            boolean[] booleanos = new boolean[Integer.parseInt(splitEntrada[0])];//inicializacao 
            booleanos = transformaEmBool(splitEntrada);//array para armazenar os boleanos de entrada

            String expressao = splitEntrada[splitEntrada.length - 1];
            
            for(int i = 0; i < expressao.length(); i++){
                if(entradaString.charAt(0) == '2') {
                    if(expressao.charAt(i) == 'A'){
                        expressao = trocaLetra(expressao, booleanos[0], i);
                    }
                    if(expressao.charAt(i) == 'B'){
                        expressao = trocaLetra(expressao, booleanos[1], i);
                    }
                } else {
                    if(expressao.charAt(i) == 'A'){
                        expressao = trocaLetra(expressao, booleanos[0], i);
                    }
                    if(expressao.charAt(i) == 'B'){
                        expressao = trocaLetra(expressao, booleanos[1], i);
                    }
                    if(expressao.charAt(i) == 'C'){
                        expressao = trocaLetra(expressao, booleanos[1], i);
                    }
                }


            }

            System.out.println(expressao);
           
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
    
    public static boolean[] transformaEmBool(String[] splitEntrada){//Metodo para organizar os valores boleanos em um array
        boolean booleanos[] = new boolean[Integer.parseInt(splitEntrada[0])];
        
        for (int i = 1; i <= (Integer.parseInt(splitEntrada[0])); i++) {//Repeticao para armazenar os valores boleanos
            String valor = splitEntrada[i];
            booleanos[i-1] = Boolean.parseBoolean(valor.equals("1")?"true":"false"); // Converte '1' para true e '0' para false
        }
        return booleanos;
    }

    public static String trocaLetra(String str, boolean bool, int n){ //Metodo para trocar a letra pelo respectivo valor booleano, porem em representação binária
        char novoChar = bool == true ?  '1':'0'; 
        char[] strArray = str.toCharArray();
        strArray[n] = novoChar;
        str = "";

        for(int i = 0; i < strArray.length; i++){
            str += strArray[i];
        }

        return str;
    }
    
}