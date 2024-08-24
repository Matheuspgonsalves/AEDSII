import java.io.*;

class Q08{
    public static void main(String[] args) throws Exception{
        //Conexao com o arquivo
        RandomAccessFile raf = new RandomAccessFile("exemplo.txt", "rw"); 

        int n = MyIO.readInt(); //Leitura do numero de casos a ser lido
        
        //Escrevendo os numeros no arquivo
        for(int i = 0; i < n; i++){
            double leitura = MyIO.readDouble();
            raf.writeDouble(leitura);
        }        
        
        raf.close(); //Fechando o arquivo

        //Reabrindo o arquivo para iniciar uma nova escrita
        raf = new RandomAccessFile("exemplo.txt", "rw");

        //Estrutura para inverter a ordem escrita
        for(int i = 0; i < n / 2; i++){
            //Variavel para receber as posicoes 1 e 2
            int posicao1 = i * Double.BYTES;
            int posicao2 = (n - 1 - i) * Double.BYTES;

            //Lendo o arquivo na posicao 1
            raf.seek(posicao1);
            double leitura1 = raf.readDouble();
            //Lendo o arquivo na posicao 1
            raf.seek(posicao2);
            double leitura2 = raf.readDouble();

            //Escrevendo na posicao 1 o conteudo da ultima posicao
            raf.seek(posicao1);
            raf.writeDouble(leitura2);

            //Escrevendo na posicao 2 o conteudo da primeira posicao
            raf.seek(posicao2);
            raf.writeDouble(leitura1);
        }

        //Redefinindo o ponto de onde o arquivo deve começar a mostrar na saida
        raf.seek(0);

        //Mostrando as linhas na tela
        for(int i = 0; i < n; i++){
            double value = raf.readDouble();
            //Verificando se o numero é inteiro ou float para imprimir da maneira adequada
            if(value == (int)value){
                MyIO.println((int)value);
            } else {
                MyIO.println(value);
            }
        }

        raf.close();
    }
}