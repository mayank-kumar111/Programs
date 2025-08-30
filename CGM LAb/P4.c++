// Write a program to implement to make a bouncing ball animation of different colors and sizes.
#include <graphics.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>

int main()
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");
    srand(time(0));

    int x[6], y[6], r[6], dy[6];

    for (int i = 0; i < 6; i++)
    {
        x[i] = 80 + i * 100;
        y[i] = rand() % 400 + 40;
        r[i] = rand() % 30 + 20;
        dy[i] = rand() % 3 + 1;
    }

    while (!kbhit())
    {
        cleardevice();
        for (int i = 0; i < 6; i++)
        {
            int color = rand() % 15 + 1; // new random color each frame
            setcolor(color);
            circle(x[i], y[i], r[i]); // outline only, no fill

            y[i] += dy[i];
            if (y[i] >= getmaxy() - r[i] || y[i] <= r[i])
                dy[i] = -dy[i];
        }
        delay(10);
    }

    closegraph();
    return 0;
}