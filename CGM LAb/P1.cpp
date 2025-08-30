#include <graphics.h>
#include <conio.h>

int main()
{
    int gd = DETECT, gm;

    initgraph(&gd, &gm, "C:\\TC\\BGI");

    line(100, 150, 300, 450);
    circle(200, 300, 50);
    putpixel(10, 15, WHITE);

    getch();

    closegraph();

    return 0;
}
