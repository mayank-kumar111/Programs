#include <graphics.h>
#include <conio.h>
#include <stdio.h>

int main() {
    int gd = DETECT, gm;
    int x1 = 100, y1 = 100, x2 = 200, y2 = 100, x3 = 150, y3 = 200;
    int xmid, ymid;
    initgraph(&gd, &gm, "C:\\Turboc3\\BGI");

    xmid = getmaxx() / 2;
    ymid = getmaxy() / 2;

  
    // Draw original triangle
    setcolor(WHITE);
    line(xmid + x1, ymid - y1, xmid + x2, ymid - y2);
    line(xmid + x2, ymid - y2, xmid + x3, ymid - y3);
    line(xmid + x3, ymid - y3, xmid + x1, ymid - y1);

    // Reflection about X-axis (Y value changes sign)
    setcolor(RED);
    line(xmid + x1, ymid + y1, xmid + x2, ymid + y2);
    line(xmid + x2, ymid + y2, xmid + x3, ymid + y3);
    line(xmid + x3, ymid + y3, xmid + x1, ymid + y1);

    // Reflection about Y-axis (X value changes sign)
    setcolor(GREEN);
    line(xmid - x1, ymid - y1, xmid - x2, ymid - y2);
    line(xmid - x2, ymid - y2, xmid - x3, ymid - y3);
    line(xmid - x3, ymid - y3, xmid - x1, ymid - y1);

    // Reflection about Origin (Both X and Y change sign)
    setcolor(YELLOW);
    line(xmid - x1, ymid + y1, xmid - x2, ymid + y2);
    line(xmid - x2, ymid + y2, xmid - x3, ymid + y3);
    line(xmid - x3, ymid + y3, xmid - x1, ymid + y1);

    // Reflection about x = y (swap x and y)
    setcolor(CYAN);
    line(xmid + y1, ymid - x1, xmid + y2, ymid - x2);
    line(xmid + y2, ymid - x2, xmid + y3, ymid - x3);
    line(xmid + y3, ymid - x3, xmid + y1, ymid - x1);      

    getch();
    closegraph();
    return 0;
}
