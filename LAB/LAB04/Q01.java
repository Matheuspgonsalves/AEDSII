class Q01 {
    public static void main(String[] args){

        //Leitura dos numeros de entrada
        int n1 = MyIO.readInt();
        int n2 = MyIO.readInt();

        while(verificaFim(n1, n2)){  //O(n1)
            int[] array = new int[n1];

            //Iteracao para armazenar a quantidade de numeros n1
            for(int i = 0; i < n1; i++){ //complexidade n1
                array[i] = MyIO.readInt();
            }

            array = ordenaArray(array);

            n1 = MyIO.readInt();
            n2 = MyIO.readInt();
        }
    }

    public static int[] ordenaArray(int[] array){
        int len = array.length;
        int mod1 = 0, mod2 = 0, aux = 0;
        for(int i = 0; i < len; i++){            
            aux = array[0];
            if(array[i+1] > aux) {
                aux = array[i+1];
            }
        }
    }

    public static boolean verificaFim(int n1, int n2){
        if(n1 != 0 && n2 != 0){
            return true;
        } else {
            return false;
        }
    }
}
