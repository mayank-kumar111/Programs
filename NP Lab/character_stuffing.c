// character stuffing user enter multiple lines of text

#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define STX "STXDLE"  // Start of Frame
#define ETX "ETXDLE"  // End of Frame
#define DLE "DLE"     // Escape Sequence

// Function to compare strings case-insensitively
int caseInsensitiveMatch(const char *str1, const char *str2) {
    while (*str1 && *str2) {
        if (tolower(*str1) != tolower(*str2)) {
            return 0;  // Not a match
        }
        str1++;
        str2++;
    }
    return (*str2 == '\0');  // Return true only if full match
}

void characterStuffing(char *input) {
    printf("Stuffed Frame: %s", STX);  // Start flag

    for (int i = 0; i < strlen(input); i++) {
        // If "DLE" is found (case insensitive), escape it
        if (caseInsensitiveMatch(&input[i], "DLE")) {
            printf("%s", DLE);  // Add extra DLE before it
        }
        printf("%c", input[i]);  // Print actual character
    }
    
    printf("%s\n", ETX);  // End flag
}

int main() {
    char data[100];
    
    printf("Enter data: ");
    scanf("%s", data);
    
    characterStuffing(data);
    
    return 0;
}