// Write a program to implement (Digital Differential Analyzer) DDA line drawing algorithm
#include <graphics.h>
#include <stdio.h>
#include <math.h>
#include <conio.h>

void drawNormalLine(int x1, int y1, int x2, int y2) {
    int dx = x2 - x1;
    int dy = y2 - y1;
    int steps = abs(dx) > abs(dy) ? abs(dx) : abs(dy);

    float xInc = dx / (float)steps;
    float yInc = dy / (float)steps;

    float x = x1, y = y1;
    for (int i = 0; i <= steps; i++) {
        putpixel(round(x), round(y), WHITE);
        x += xInc;
        y += yInc;
        delay(10);
    }
}

void drawDottedLine(int x1, int y1, int x2, int y2) {
    int dx = x2 - x1;
    int dy = y2 - y1;
    int steps = abs(dx) > abs(dy) ? abs(dx) : abs(dy);

    float xInc = dx / (float)steps;
    float yInc = dy / (float)steps;

    float x = x1, y = y1;
    for (int i = 0; i <= steps; i++) {
        if (i % 4 == 0) // Draw every 4th pixel
            putpixel(round(x), round(y), WHITE);
        x += xInc;
        y += yInc;
        delay(10);
    }
}

void drawBoldLine(int x1, int y1, int x2, int y2) {
    int dx = x2 - x1;
    int dy = y2 - y1;
    int steps = abs(dx) > abs(dy) ? abs(dx) : abs(dy);

    float xInc = dx / (float)steps;
    float yInc = dy / (float)steps;

    float x = x1, y = y1;
    for (int i = 0; i <= steps; i++) {
        int px = round(x);
        int py = round(y);
        // Draw a 2x2 pixel block for bold effect
        putpixel(px, py, WHITE);
        putpixel(px + 1, py, WHITE);
        putpixel(px, py + 1, WHITE);
        putpixel(px + 1, py + 1, WHITE);
        x += xInc;
        y += yInc;
        delay(10);
    }
}

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");

    int x1, y1, x2, y2, choice;
    printf("Enter coordinates (x1 y1 x2 y2): ");
    scanf("%d %d %d %d", &x1, &y1, &x2, &y2);

    printf("\nChoose line style:\n");
    printf("1. Normal Line\n");
    printf("2. Dotted Line\n");
    printf("3. Bold Line\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1: drawNormalLine(x1, y1, x2, y2); break;
        case 2: drawDottedLine(x1, y1, x2, y2); break;
        case 3: drawBoldLine(x1, y1, x2, y2); break;
        default: printf("Invalid choice!\n");
    }

    getch();
    closegraph();
    return 0;
}