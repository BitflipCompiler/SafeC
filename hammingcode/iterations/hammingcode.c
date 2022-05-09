#include <stdio.h>
#include <malloc.h>
#include <math.h>

int *returnBinary(int number);
int checkParity(int *testArr);

int main() {
    //lav et test array med bits
    int testArr[16] = {0,0,1,1,1,0,1,0,0,0,1,0,1,0,0,1};

    //returner tallet 10 (XOR af index med 1 i testarr
    int parity = checkParity(testArr);

    printf("parity før returnbinary er: %d \n", parity);

    //returnerer en binary værdi af en int (parity)
    int *bin = returnBinary(parity);

    //opdaterer parity bits i testArr
    for(int i = 0; i < 4; i++){
        if(bin[i] == 1){
            if(testArr[(int)pow(2,(3-i))] == 0){
                testArr[(int)pow(2,(3-i))] = 1;
            } else {
                testArr[(int)pow(2,(3-i))] = 0;
            }

        }
        //printer testArr efter opdatering
        for(int i = 0; i < 16; i++){
            printf("%d, ", testArr[i]);
        }
        printf("\n");
    }
    printf("\n");

    //check om opdateringen var god
    int parity2 = checkParity(testArr);
    int *bin2 = returnBinary(parity2);
    for(int i = 3; i >= 0; i--){
        printf("%d", bin2[i]);
    }
    free(bin);
    return 0;
}

int *returnBinary(int number){
    int i;
    int *b = (int *) calloc(4, 0);
    if(b == NULL){
        EXIT_FAILURE;
    }
    int *c = (int *) calloc(4, 0);
    if(c == NULL){
        EXIT_FAILURE;
    }

    for(i = 0; number > 0 ; i++){
        b[i] = number % 2;
        number = number / 2;
    }

    for(i=i-1;i>=0;i--)
    {
        c[3-i] = b[i];
    }

    printf("returnBinary says: ");
    for(int j = 0; j < 4; j++){
        printf("%d ", c[j]);
    }
    printf("\n");
    free(b);
    return c;
}

int checkParity(int *testArr){
    int parity = 0;
    for(int i = 0; i < 16; i++){
        if(testArr[i] == 1){
            parity = parity ^ i;
        }
    }
    return parity;
}