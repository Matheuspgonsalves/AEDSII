class Q06 {
    public static void main(String[] args) {
        String input = "";

        while(!(input = MyIO.readLine()).equals("FIM")){
            input = input.toLowerCase();
            boolean isVogal = feitaPorVogais(input);

            boolean isConsoante = feitaPorConsoantes(input);
        }
    }
    
    public static boolean feitaPorVogais(String str){
        int a = 0,e = 0,i = 0,o = 0,u = 0;

        for(int j = 0; j < str.length(); j++){
            switch (str.charAt(i)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }

        int soma = a+e+i+o+u;
        if(str.length() == soma){
            return true;
        }
        return false;
    }
}