#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#define MAX 100

void imprimir(bool isPalindromo){
	if(isPalindromo){
		printf("SIM\n");
	} else {
		printf("NAO\n");
	}
	
}

bool isPalindromo(char pal[]){
	int count = 0, tamString = strlen(pal);
	
	for(int i = 0; i < tamString/2; i++){
		if(pal[i] != pal[tamString-1-i]){
			return false;
		}
	}
	return true;
}

int main(){
	char string[MAX];
	while(1){
		scanf(" %[^\n]", string);
		
		if(strcmp(string, "FIM") == 0){
			break;
		} 
		bool isPal = isPalindromo(string);
		imprimir(isPal);
	}
	
	return ( 0 );
}