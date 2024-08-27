class Q15 {
    public static boolean isFloat(String input) { 
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean isInteiro(String input) { 
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isConsoante(String input) {
        return isConsoanteRecursive(input, 0);
    }
    
    public static boolean isConsoanteRecursive(String input, int index) {
        if (index >= input.length()) {
            return true;
        }

        char c = input.charAt(index);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || isInteiro(input) || isFloat(input)) {
            return false;
        }
        
        return isConsoanteRecursive(input, index + 1);
    }

    public static boolean isVogal(String input) {
        return isVogalRecursive(input, 0);
    }

    public static boolean isVogalRecursive(String input, int index) {
        if (index >= input.length()) {
            return true;
        }

        char c = input.charAt(index);
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
            return false;
        }
        
        return isVogalRecursive(input, index + 1);
    }

    public static void main(String[] args) {
        String input = "";

        while (!(input = MyIO.readLine()).equals("FIM")) {
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
