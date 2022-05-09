#include <stdio.h>
#include <malloc.h>
#include <math.h>
#include <time.h>
#include <stdlib.h>

const int DATABITS = 32;
const int PARITYBITS = 6;

//union def. taken from https://www.geeksforgeeks.org/program-for-conversion-of-32-bits-single-precision-ieee-754-floating-point-representation/
typedef union {
    float f;
    struct{
        // Order is important.
        // Here the members of the union data structure
        // use the same memory (32 bits).
        // The ordering is taken
        // from the LSB to the MSB.
        unsigned int mantissa : 23;
        unsigned int exponent : 8;
        unsigned int sign : 1;
    } raw;
} number;

int *returnBinary(int number);
int calcParity(int *arr);
void updateParity(int *bin, int *arr);
void setupArray(int *arr);

int *main(int argc, char *argv[]) {

    //if input float value, convert it from string to double
    if(argc == 2) {

        //getting input floating point number as IEEE 754 representation
        float val = atof(argv[1]);
        printf("input value as float: %lf\n", val);
        number number;
        number.f = val;
        unsigned int dataBinArr[DATABITS];
        int index = 1;

        //set first bit to the sign bit
        dataBinArr[0] = number.raw.sign;

        //set following eight bits to the exponent
        for (int k = 8 - 1; k >= 0; k--) {
            if ((number.raw.exponent >> k) & 1) {
                dataBinArr[index++] = 1;
            } else {
                dataBinArr[index++] = 0;
            }
        }

        //set the following 23 bits to the mantissa
        for (int k = 23 - 1; k >= 0; k--) {
            if ((number.raw.mantissa >> k) & 1) {
                dataBinArr[index++] = 1;
            } else {
                dataBinArr[index++] = 0;
            }
        }

        //calculating the hammingcode parity bits
        int parity = calcParity(dataBinArr);
        int *parityBinValue = returnBinary(parity);

        //setting up returnarray, stoing data as well as parity bits
        unsigned int returnArr[DATABITS + PARITYBITS + 1];
        printf("input value as IEEE-754 with parity digits: \n");

        //set first digit to zero, since this cannot be used to store data/parity bits
        printf("Z ");
        returnArr[0] = 0;

        //storing data bits, unless the index of the array is 2^i+1
        //2^0
        printf("P ");
        returnArr[1] = parityBinValue[0];
        //2^1
        printf("P ");
        returnArr[2] = parityBinValue[1];
        printf("D ");
        returnArr[3] = dataBinArr[0];
        //2^2
        printf("P ");
        returnArr[4] = parityBinValue[2];
        for(int i = 5; i < 8; i++){
            printf("D ");
            returnArr[i] = dataBinArr[i - 4];
        }
        //2^3
        printf("P ");
        returnArr[8] = parityBinValue[3];
        for(int i = 9; i < 16; i++){
            printf("D ");
            returnArr[i] = dataBinArr[i - 5];
        }
        //2^4
        printf("P ");
        returnArr[16] = parityBinValue[4];
        for(int i = 17; i < 32; i++){
            printf("D ");
            returnArr[i] = dataBinArr[i - 6];
        }
        //2^5
        printf("P ");
        returnArr[32] = parityBinValue[5];
        for(int i = 33; i < DATABITS+PARITYBITS+1; i++){
            printf("D ");
            returnArr[i] = dataBinArr[i - 7];
        }
        printf("\n");

        for(int i = 0; i < DATABITS+PARITYBITS+1; i++){
            printf("%d ", returnArr[i]);
        }
        return returnArr;
    } else{
        //setup array with DATABITS amount of bits
        int arr [DATABITS];
        srand(time(NULL));
        setupArray(arr);

        //Find parity value (int)
        int parity = calcParity(arr);
        //printf("parity is: %d prior to encoding\n", parity);

        //Convert parity value to binary representation
        int *binValue = returnBinary(parity);

        printf("binValue digits is:");
        for(int i = 0; i < PARITYBITS; i++){
            printf("%d ", binValue[i]);
        }
        printf("\n");

        //encoding parity bits
        updateParity(binValue, arr);

        //check if encoding went as planned
        int parityChecked = calcParity(arr);
        //printf("parity is: %d after to encoding\n", parityChecked);

        if(parityChecked == 0){
            printf("Hammingcode encoding successful.\n");
        } else {
            printf("Error encoding parity digits.\n");
        }
        //printf("parity is: %d after encoding\n", parityChecked);
        //int *binValueChecked = returnBinary(parityChecked);

        free(binValue);
        //free(binValueChecked);
        return 0;
    }
}

int *returnBinary(int number){
    int i;
    int *b = (int *) calloc(PARITYBITS, 0);
    if(b == NULL){
        EXIT_FAILURE;
    }

    int *c = (int *) calloc(PARITYBITS, 0);
    if(c == NULL){
        EXIT_FAILURE;
    }

    for(i = 0; number > 0 ; i++){
        b[i] = number % 2;
        number = number / 2;
    }

    for(i=i-1;i>=0;i--){
        c[(PARITYBITS-1)-i] = b[i];
    }
    free(b);
    return c;
}

int calcParity(int *arr){
    int parity = 0;
    for(int i = 0; i < DATABITS; i++){
        if(arr[i] == 1){
            parity = parity ^ i;
        }
    }
    return parity;
}

void updateParity(int *bin, int *arr){

    for(int i = 0; i < PARITYBITS; i++){
        if(bin[i] == 1){
            if(arr[(int)pow(2,((PARITYBITS - 1)-i))] == 0){
                arr[(int)pow(2,((PARITYBITS - 1)-i))] = 1;
            } else {
                arr[(int)pow(2,((PARITYBITS - 1)-i))] = 0;
            }
        }
    }
}

void setupArray(int *arr){
    printf("setup: ");
    for(int i = 0; i < DATABITS; i++){
        arr[i] = rand() % 2;
        printf("%d ", arr[i]);
    }
    printf("\n");
}
