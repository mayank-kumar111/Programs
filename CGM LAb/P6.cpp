// Write a program to implement Bresenham's line drawing algorithm

#include <graphics.h>
#include <iostream>
using namespace std;

void drawLine(int x1, int y1, int x2, int y2)
{
    int dx = x2 - x1;
    int dy = y2 - y1;

    int x = x1;
    int y = y1;

    int stepX = (dx >= 0) ? 1 : -1;
    int stepY = (dy >= 0) ? 1 : -1;

    dx = abs(dx);
    dy = abs(dy);

    if (dx > dy)
    {
        int p = 2 * dy - dx;
        for (int i = 0; i <= dx; i++)
        {
            putpixel(x, y, WHITE);
            x += stepX;
            if (p < 0)
            {
                p += 2 * dy;
            }
            else
            {
                y += stepY;
                p += 2 * (dy - dx);
            }
        }
    }
    else
    {
        int p = 2 * dx - dy;
        for (int i = 0; i <= dy; i++)
        {
            putpixel(x, y, WHITE);
            y += stepY;
            if (p < 0)
            {
                p += 2 * dx;
            }
            else
            {
                x += stepX;
                p += 2 * (dx - dy);
            }
        }
    }
}

int main()
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");

    int x1, y1, x2, y2;
    cout << "Enter starting point (x1 y1): ";

    cin >> x1 >> y1;
    cout << "Enter ending point (x2 y2): ";
    cin >> x2 >> y2;

    drawLine(x1, y1, x2, y2);

    getch();
    closegraph();
    return 0;
}
