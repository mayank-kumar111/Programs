// Character count framing:

#include <stdio.h>
int main() {
    char frame1[100], frame2[100];
    int count1 = 1, count2 = 1;
    char ch;
    int i = 0;

    printf("Enter the first string (press Enter to finish): ");
    while ((ch = getchar()) != '\n' && i < 99) {
        frame1[i++] = ch;
        count1++;
    }
    frame1[i] = '\0'; 

    i = 0;

    printf("Enter the second string (press Enter to finish): ");
    while ((ch = getchar()) != '\n' && i < 99) {
        frame2[i++] = ch;
        count2++;
    }
    frame2[i] = '\0';

    printf("The Result is: %d%s%d%s\n", count1, frame1, count2, frame2);

    return 0;
}