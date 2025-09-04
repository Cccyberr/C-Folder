#include <stdio.h>
void main(){
    int age;
    char name[] = "name";
    printf("enter voter name:");
    scanf("%s",name);
    printf("enter voter age: ");
    scanf("%d",age);
    if(age<18){
        printf("voter not eligible to vote!.");}
    else{
            printf("voter eligilbe to vote!.");
        }
    }
