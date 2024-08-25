class Q02 {
    public static void main(String[] args) {
        String input;
        input = MyIO.readLine();
        while(input.trim().isEmpty()){


            
            String[] partes = input.split(" ");
            String newString = "";

            int n1 = Integer.parseInt(partes[0]);
            int n2 = Integer.parseInt(partes[1]);

            for(int i = n1; i <= n2; i++){
                newString += i;
            }

            for(int i = newString.length()-1; i >= 0; i--){
                newString += newString.charAt(i);
            }

            System.out.println(newString);
        }

        
    }
}
