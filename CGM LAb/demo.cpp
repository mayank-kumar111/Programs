#include <graphics.h>
#include <stdio.h>
#include <math.h>

// DDA Line Drawing Function
void drawLineDDA(int x1, int y1, int x2, int y2) {
    int dx = x2 - x1;
    int dy = y2 - y1;

    int steps = abs(dx) > abs(dy) ? abs(dx) : abs(dy);

    float xInc = dx / (float)steps;
    float yInc = dy / (float)steps;

    float x = x1;
    float y = y1;

    for (int i = 0; i <= steps; i++) {
        putpixel(round(x), round(y), WHITE);
        x += xInc;
        y += yInc;
    }
}

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");

    int x1, y1, x2, y2;

    // 🧑‍💻 User Input
    printf("Enter starting point (x1 y1): ");
    scanf("%d %d", &x1, &y1);

    printf("Enter ending point (x2 y2): ");
    scanf("%d %d", &x2, &y2);

    // 🖌️ Draw the line
    drawLineDDA(x1, y1, x2, y2);

    getch();
    closegraph();
    return 0;
}