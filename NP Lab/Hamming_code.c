// Hamming code implementation in C

#include <stdio.h>
#include <math.h>

// Function to calculate the number of redundant bits needed
int calculateRedundantBits(int dataBits)
{
    int r = 0;
    while (pow(2, r) < (dataBits + r + 1))
    {
        r++;
    }
    return r;
}

// Function to generate Hamming Code
void generateHammingCode(int data[], int dataBits, int hammingCode[])
{
    int r = calculateRedundantBits(dataBits);
    int totalBits = dataBits + r;
    int j = 0;

    // Placing data bits and leaving space for parity bits
    for (int i = 0; i < totalBits; i++)
    {
        if ((i + 1) == pow(2, j))
        {
            hammingCode[i] = 0; // Placeholder for parity bit
            j++;
        }
        else
        {
            hammingCode[i] = data[--dataBits];
        }
    }

    // Calculating parity bits
    for (int i = 0; i < r; i++)
    {
        int pos = pow(2, i) - 1;
        int parity = 0;
        for (int j = pos; j < totalBits; j += (2 * (pos + 1)))
        {
            for (int k = j; k < j + pos + 1 && k < totalBits; k++)
            {
                if (k != pos)
                {
                    parity ^= hammingCode[k];
                }
            }
        }
        hammingCode[pos] = parity;
    }
}

// Function to detect and correct errors
void detectAndCorrect(int hammingCode[], int totalBits)
{
    int errorPosition = 0;
    int r = 0;

    // Checking parity bits
    for (int i = 0; pow(2, i) < totalBits; i++)
    {
        int pos = pow(2, i) - 1;
        int parity = 0;

        for (int j = pos; j < totalBits; j += (2 * (pos + 1)))
        {
            for (int k = j; k < j + pos + 1 && k < totalBits; k++)
            {
                if (k != pos)
                {
                    parity ^= hammingCode[k];
                }
            }
        }
        if (parity != hammingCode[pos])
        {
            errorPosition += (pos + 1);
        }
    }

    // Correcting the error if detected
    if (errorPosition > 0)
    {
        printf("\nError detected at position: %d\n", errorPosition);
        hammingCode[errorPosition - 1] ^= 1; // Flip the erroneous bit
        printf("Corrected Hamming Code: ");
        for (int i = totalBits - 1; i >= 0; i--)
        {
            printf("%d ", hammingCode[i]);
        }
        printf("\n");
    }
    else
    {
        printf("\nNo error detected.\n");
    }
}

int main()
{
    int dataBits;

    // Taking user input
    printf("Enter the number of data bits: ");
    scanf("%d", &dataBits);

    int *data = (int *)malloc(dataBits * sizeof(int));
    if (data == NULL)
    {
        printf("Memory allocation failed.\n");
        return 1;
    }
    printf("Enter the data bits (LSB first): ");
    for (int i = 0; i < dataBits; i++)
    {
        scanf("%d", &data[i]);
    }

    int r = calculateRedundantBits(dataBits);
    int totalBits = dataBits + r;
    int *hammingCode = (int *)malloc(totalBits * sizeof(int));
    if (hammingCode == NULL)
    {
        printf("Memory allocation failed.\n");
        return 1;
    }

    // Generate Hamming Code
    generateHammingCode(data, dataBits, hammingCode);

    // Display the Hamming Code
    printf("\nGenerated Hamming Code: ");
    for (int i = totalBits - 1; i >= 0; i--)
    {
        printf("%d ", hammingCode[i]);
    }
    printf("\n");

    // Introducing an error (For testing error correction)
    int errorIndex;
    printf("\nEnter the position (1 to %d) where you want to introduce an error (Enter 0 for no error): ", totalBits);
    scanf("%d", &errorIndex);
    free(hammingCode); // Free allocated memory
    free(data);        // Free allocated memory for data
    if (errorIndex > 0)
    {
        hammingCode[errorIndex - 1] ^= 1; // Flip the bit
    }
    free(hammingCode); // Free allocated memory
    return 0;
    // Detect and Correct Errors
    detectAndCorrect(hammingCode, totalBits);

    return 0;
}