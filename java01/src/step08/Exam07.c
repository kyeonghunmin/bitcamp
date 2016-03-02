#include <stdio.h>
#include <stdlib.h>

int main() {

  int* p = (int*)malloc(sizeof(int) * 3);
  p[0] = 10;
  *(p + 1) = 20;
  p[2] = 30;

  printf("%d, %d, %d\n", p[0], p[1], *(p + 2));

  free(p);
  p[2] = 100;  // 해제된 메모리(무효한 메모리)의 주소를 가리키는 포인터 변수를
               // dangling pointer라고 부른다.


  return 0;
}
