#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

#define MAX_INPUT_LENGTH 100

// Função recursiva para trocar a primeira ocorrência de um caractere por outro
void trocaStringRecursiva(char* texto, char a, char b, char* novaString, int index) {
    if (index >= strlen(texto)) {
        novaString[index] = '\0'; // Finaliza a nova string
        return;
    }
    
    if (texto[index] == a) {
        novaString[index] = b;
    } else {
        novaString[index] = texto[index];
    }
    
    trocaStringRecursiva(texto, a, b, novaString, index + 1);
}

// Função para verificar se a entrada é "FIM"
int isEnd(char* entrada) {
    return strcmp(entrada, "FIM\n") == 0;
}

int main() {
    char input[MAX_INPUT_LENGTH];
    char novaString[MAX_INPUT_LENGTH];
    char a, b;
    int seed = 4;
    
    // Inicializa o gerador de números aleatórios com a seed
    srand(seed);
    
    // Loop para ler e processar entradas até "FIM"
    while (fgets(input, sizeof(input), stdin) && !isEnd(input)) {
        // Remove o caractere de nova linha, se presente
        input[strcspn(input, "\n")] = '\0';

        // Gera dois caracteres aleatórios
        a = 'a' + abs(rand() % 26);
        b = 'a' + abs(rand() % 26);

        // Troca as ocorrências usando a função recursiva
        trocaStringRecursiva(input, a, b, novaString, 0);
        printf("%s\n", novaString);
    }

    return 0;
}