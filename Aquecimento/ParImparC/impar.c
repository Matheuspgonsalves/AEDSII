#include <stdio.h>

int main(){
	int num;
	do{
		scanf("%d", &num);
		if(num > 0){
			if(num % 2 == 0){
			printf("P\n");
			} else {
				printf("I\n");
			}
		}
	}while(num != 0);
	
	return ( 0 );
}