#include <stdio.h>

void main() {
    int a = 0, b = 1, c;

    printf("Fibonacci series up to 100:\n");
    printf("%d, %d, ", a, b);

    while (1) {
        c = a + b;
        if (c > 100)
            break;
        printf("%d, ", c);
        a = b;
        b = c;
    }
}
