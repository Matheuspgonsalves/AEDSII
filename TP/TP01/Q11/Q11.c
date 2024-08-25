#include <stdio.h>
#include <string.h>
#include <stdbool.h>

#define MAX 1000

bool isPalindromo(char texto[], int inicio); //Construtor do metodo que verifica palindromo
void imprimir(bool pal); //Construtor do metodo de imprimir
bool verificaFim(char texto[]); //Construtor do metodo que verifica se chegou ao fim

int main(){
    char string[MAX]; 
    scanf(" %[^\n]", string);

    while(verificaFim(string)){
        
        bool isPal = isPalindromo(string, 0);//Vai enviar a string e o valor inicial que comeca em 0
        imprimir(isPal);

        scanf(" %[^\n]", string);
    }
}

bool isPalindromo(char texto[], int inicio){
    int fim = strlen(texto) - inicio - 1;

    if(inicio >= fim) {
        return true;
    }

    if(texto[inicio] != texto[fim]){
        return false;
    }

    return isPalindromo(texto, inicio+1);
}

void imprimir(bool pal) {
    if(pal){
        puts("SIM");
    } else {
        puts("NAO");
    }
}

bool verificaFim(char texto[]) {
    if(texto[0] == 'F' && texto[1] == 'I' && texto[2] == 'M') {
        return false;
    }
    return true;
}