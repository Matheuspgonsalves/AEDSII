class Q06 {
    public static boolean isFloat(String input){ // Metodo para verificar se a String é composta somente por numero real
        /*O metodo try catch abaixo vai tentar converter a string para float. Se isso nao for possivel entao a string
         * nao e um numero real
         */
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean isInteiro(String input){ // Metodo para verificar se a String é composta somente por numero inteiro
        /*O metodo try catch abaixo vai tentar converter a string para um numero inteiro. Se isso nao for possivel entao a string
         * nao e um numero inteiro
         */
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isConsoante(String input){// Metodo para verificar se a String é composta somente por consoante
        boolean resp = true;

        for(int i = 0; i < input.length(); i++){
            if(((input.charAt(i) == 'a') || (input.charAt(i) == 'e') || (input.charAt(i) == 'i') || (input.charAt(i) == 'o') || (input.charAt(i) == 'u')) || (isInteiro(input) == true) || (isFloat(input) == true)) {
                resp = false;
                break;
            }
        }

        return resp;
    }

    public static boolean isVogal(String input){ // Metodo para verificar se a String é composta somente por vogal
        boolean resp = true;

        for(int i = 0; i < input.length(); i++){
            if((input.charAt(i) != 'a') && (input.charAt(i) != 'e') && (input.charAt(i) != 'i') && (input.charAt(i) != 'o') && (input.charAt(i) != 'u')){
                resp = false;
                break;
            }
        }
        return resp;
    }

    public static void main(String[] args) { //Meotod main para receber os metodos e gerar a saida
        String input = "";

        while(!(input = MyIO.readLine()).equals("FIM")){
            input = input.toLowerCase();

            boolean vogal = isVogal(input);
            boolean consoante = isConsoante(input);
            boolean inteiro = isInteiro(input);
            boolean numeroReal = isFloat(input);

            MyIO.print(vogal ? "SIM " : "NAO ");
            MyIO.print(consoante ? "SIM " : "NAO ");
            MyIO.print(inteiro ? "SIM " : "NAO ");
            MyIO.print(numeroReal ? "SIM\n" : "NAO\n");
        }
    }
}
    