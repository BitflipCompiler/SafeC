#include <stdio.h>
#include <malloc.h>
#include <math.h>
#include <time.h>

const int DATABITS = 57;
const int PARITYBITS = 6;

int *returnBinary(int number);
int calcParity(int *arr);
void updateParity(int *bin, int *arr);
void setupArray(int *arr);

int main(void) {
    //setup array with DATABITS amount of bits
    srand(time(NULL));
    int arr [DATABITS];
    setupArray(arr);

    //Find parity value (int)
    int parity = calcParity(arr);
    //printf("parity is: %d prior to encoding\n", parity);

    //Convert parity value to binary representation
    int *binValue = returnBinary(parity);

    //encoding parity bits
    updateParity(binValue, arr);

    //check if encoding went as planned
    int parityChecked = calcParity(arr);
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