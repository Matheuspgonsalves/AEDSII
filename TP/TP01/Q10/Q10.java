class Q10{
    public static void main(String[] args) {
        String string = MyIO.readLine();

        while(verificaFim(string)) {
            boolean isPalindromo = isPalindromo(string, 0);
            MyIO.println(isPalindromo ? "SIM" : "NAO");
            string = MyIO.readLine();
        }
    }

    public static boolean isPalindromo(String in, int inicio){
        int fim = in.length() - 1 - inicio;//Vai armazenando o valor da ultima posicao

        if(inicio >= fim) {//Condicao para ver se ja chegou na metade do array
            return true;
        } 
        if(in.charAt(inicio) != in.charAt(fim)) {//condicao para ver se tem caracter diferente
            return false;
        }

        return isPalindromo(in, inicio+1);//chamada recursiva
    }

    //Metodo para verificar se chegou ao FIM
    public static boolean verificaFim(String texto){
        if(texto.charAt(0) == 'F' && texto.charAt(1) == 'I' && texto.charAt(2) == 'M'){
            return false;
        } else {
            return true;
        }
    }

}