// Bit Stuffing Framing:

#include <stdio.h>
#include <string.h>

int main() {
    char data[100], stuffed_data[100];
    int i, j, count, n;

    printf("Enter the data: ");
    scanf("%s", data);

    n = strlen(data);

    count = 0;
    j = 0;

    for (i = 0; i < n; i++) {
        if (data[i] == '1') {
            count++;
        } else {
            count = 0;
        }

        stuffed_data[j] = data[i];
        j++;

        if (count == 5) {
            stuffed_data[j] = '0';
            j++;
            count = 0;
        }
    }

    stuffed_data[j] = '\0';

    printf("After Bit Stuffing: %s\n", stuffed_data);

    return 0;
}