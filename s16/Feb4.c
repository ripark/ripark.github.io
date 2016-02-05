#include<stdio.h>
#include<stdlib.h>

int main(int argc, char** argv){
  
  int i = 240;
  int *ptr = &i;

  printf("%d\n", i);
  printf("%p\n", ptr);
  printf("%d\n", *ptr);
  
  i = 450;
  printf("%d\n", i);
  *ptr = 5000;
  printf("%d\n", *ptr);

  //ptr = 5000;
  //printf("%d\n", *ptr);

  ptr = (int *) malloc (sizeof(int));
  *ptr = 1234;
  printf("Actual value: %d\n", *ptr);
  printf("Address: %d\n", ptr);

  printf("Actual value of i: %d\n", i); //5000
  printf("pre increment: %d\n", ++i);   //5001
  printf("post increment: %d\n", i++);  //5001
  printf("i again: %d\n", i);           //5002

/*  printf("%d\n", *++ptr);
  printf("%d\n", ++*ptr);
  printf("%d\n", *ptr++);
  printf("%d\n", *ptr);
*/
  free(ptr);

  return 0;
}
