#include <stdio.h>
#include <stdlib.h>

void plus(int a, int b) {
  printf("%d + %d = %d\n", a, b, a + b);
}

// C++(객체 지향 프로그래밍 언어)에서는
// 파라미터의 개수나 타입이 다르다면 함수의 이름을 같게 할 수 있다.
// => 같은 기능을 하는 함수에 대해 같은 이름을 부여할 수 있게 허락한다.
void plus(int a, int b, int c) {
  printf("%d + %d + %d = %d\n", 10, 20, 30, a + b + c);
}

void plus(int* p, int len) {
  int sum = 0, i = 0;
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
  plus(11, 21);
  plus(11, 21, 31);
  int arr[5] = {11, 21, 31, 41, 51};
  plus(arr, 5);

  return 0;
}

