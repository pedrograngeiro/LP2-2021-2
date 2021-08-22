#include <stdio.h>
//Struct em c implementando quadrado
typedef struct
{
    int x, y;
    int w, h;
} Quadrado;

void print(Quadrado* valor){
    printf("Retangulo de tamanho (%d, %d) na posicao (%d, %d).\n", valor->w, valor->h, valor->x, valor->y);
}

void main (void){
    Quadrado valores1 = { 1,1, 10,10};
    print(&valores1);
}