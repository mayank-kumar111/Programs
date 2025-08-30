// Write a program to implement a changing color and size circle animation
#include <graphics.h>
#include <cstdlib>
#include <ctime>
#include <conio.h>

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");

    srand(time(0));
    int r = 10, dr = 2;

    while (!kbhit()) {
        int color = 1 + rand() % 15;
        setcolor(color);

        cleardevice();
        ellipse(320, 240, 0, 360, r, r);  // Draw empty circle

        delay(10);

        r += dr;
        if (r >= 230 || r <= 10)
            dr = -dr;
    }

    closegraph();
    return 0;
}