#include <stdio.h>

//Declarando os metodos para usar eles apos a funcao main
void escreveNumeros(int quantidade, FILE *file); 
void leNumeros(int quantidade, char *fileName);

int main(){
    //Nome do arquivo que voou usar
    char* nomeArquivo = "Questao8.txt"; 

    //Declarando o ponteiro file
    FILE *file = fopen(nomeArquivo, "wb");

    //Verifica se tem algo no arquivo
    if(file == NULL) {
        puts("Erro ao abrir arquivo.");
    }

    //Recebendo a quantidade de numeros que vou ler
    int n;
    scanf("%d", &n);

    //Escrevendo os numeros no arquivo
    escreveNumeros(n ,file);
    fclose(file);

    //Lendo os numeros de tras pra frente
    leNumeros(n, nomeArquivo);

    return ( 0 );
}

//Funcao para escrever os numeros no arquivo
void escreveNumeros(int quantidade, FILE *file){
    double num;

    for(int i = 0; i < quantidade; i++){
        scanf("%lf", &num);
        fwrite(&num, sizeof(double), 1, file);
    }
}

//Lendo os numeros do arquivo
void leNumeros(int quantidade, char *fileName){
        FILE *file = fopen(fileName, "rb");

        if(file == NULL) {
            puts("Erro ao abrir arquivo");
        }

        double num;
        //loop para ler de tras pra frente os numeros digitados
        for (int i = 1; i <= quantidade; i++) {
            fseek(file, -i * sizeof(double), SEEK_END); //Definindo a posicao para comecar a ler os numeros
            fread(&num, sizeof(double), 1, file); //Lendo o arquivo
            if (num == (int) num) {
                printf("%d\n", (int)num);
            } else {
                printf("%g\n", num);
            }
        }
        fclose(file);
    }