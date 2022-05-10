#include <stdbool.h>
float age = 19;
char * name = "KarlEmil";
bool binary = true;
char  favChar = 'n';
float newAge;
bool x = true;
float setAge(float agen){
age = agen;
age = 10 + 10;
return age;
}
bool isOver18(){
bool is18 = false;

if (age > 18){
is18 = true;
}

return is18;
}
void main(){
newAge = setAge(20);
x = isOver18();

}
