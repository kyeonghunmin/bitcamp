#include <stdio.h>

void plus(int a, int b) {
  printf("%d + %d = %d\n", a, b, a + b);
}

// C 언어에서는 같은 이름을 갖는 함수를 만들 수 없다.
//int plus(int a, int b, int c) {
void plus2(int a, int b, int c) {
  printf("%d + %d + %d = %d\n", a, b, c, a + b + c);
}

void plus3(int* p, int len) {
  int sum = 0; int i;
  for (i = 0; i < len; i++) {
    sum = sum + p[i];
    if (i > 0) {
      printf(" + ");
    }
    printf("%d", p[i]);
  }
  printf(" = %d\n", sum);
}

int main() {

  plus(10, 20);
  plus2(10, 20, 30);
  int arr[5] = {10, 20, 30, 40, 50};
  plus3(arr, 5);

  return 0;
}
