#include <iostream>
#include <graphics.h>
#include <conio.h>
#include <math.h> // Required for sin() and cos() in rotation

using namespace std;

// --- LINE TRANSFORMATIONS ---

// Function to handle the translation of a line
void translateLine() {
    int x1, y1, x2, y2, tx, ty;
    cout << "Enter the coordinates of the line (x1 y1 x2 y2): ";
    cin >> x1 >> y1 >> x2 >> y2;
    cout << "Enter the translation factors (tx ty): ";
    cin >> tx >> ty;

    cleardevice();
    
    setcolor(WHITE);
    line(x1, y1, x2, y2);
    outtextxy(x1, y1 - 15, "Original Line");

    setcolor(GREEN);
    line(x1 + tx, y1 + ty, x2 + tx, y2 + ty);
    outtextxy(x1 + tx, y1 + ty - 15, "Translated Line");

    getch();
}

// Function to handle the scaling of a line
void scaleLine() {
    int x1, y1, x2, y2;
    float sx, sy;
    cout << "Enter the coordinates of the line (x1 y1 x2 y2): ";
    cin >> x1 >> y1 >> x2 >> y2;
    cout << "Enter the scaling factors (sx sy): ";
    cin >> sx >> sy;

    cleardevice();
    setcolor(WHITE);
    line(x1, y1, x2, y2);
    outtextxy(x1, y1 - 15, "Original Line");

    // Scale relative to the first point (x1, y1)
    int new_x2 = x1 + (int)((x2 - x1) * sx);
    int new_y2 = y1 + (int)((y2 - y1) * sy);

    setcolor(YELLOW);
    line(x1, y1, new_x2, new_y2);
    outtextxy(x1 + 5, y1 + 5, "Scaled Line");
    getch();
}

// Function to handle the rotation of a line
void rotateLine() {
    int x1, y1, x2, y2;
    float angle;
    cout << "Enter the coordinates of the line (x1 y1 x2 y2): ";
    cin >> x1 >> y1 >> x2 >> y2;
    cout << "Enter the rotation angle (in degrees): ";
    cin >> angle;

    cleardevice();
    setcolor(WHITE);
    line(x1, y1, x2, y2);
    outtextxy(x1, y1 - 15, "Original Line");

    // Convert angle to radians
    float rad = angle * (M_PI / 180.0);

    // Rotate the second point around the first point
    int new_x2 = x1 + (int)((x2 - x1) * cos(rad) - (y2 - y1) * sin(rad));
    int new_y2 = y1 + (int)((x2 - x1) * sin(rad) + (y2 - y1) * cos(rad));

    setcolor(CYAN);
    line(x1, y1, new_x2, new_y2);
    outtextxy(new_x2, new_y2 + 5, "Rotated Line");
    getch();
}

// --- TRIANGLE TRANSFORMATIONS ---

// Function to handle the translation of a triangle
void translateTriangle() {
    int triCoords[8], tx, ty;
    cout << "Enter coordinates of triangle (x1 y1 x2 y2 x3 y3): ";
    cin >> triCoords[0] >> triCoords[1] >> triCoords[2] >> triCoords[3] >> triCoords[4] >> triCoords[5];
    
    triCoords[6] = triCoords[0];
    triCoords[7] = triCoords[1];

    cout << "Enter the translation factors (tx ty): ";
    cin >> tx >> ty;

    cleardevice();
    
    setcolor(WHITE);
    drawpoly(4, triCoords);
    outtextxy(triCoords[0], triCoords[1] - 15, "Original Triangle");

    for (int i = 0; i < 4; ++i) {
        triCoords[i * 2]     += tx;
        triCoords[i * 2 + 1] += ty;
    }

    setcolor(GREEN);
    drawpoly(4, triCoords);
    outtextxy(triCoords[0], triCoords[1] - 15, "Translated Triangle");
    
    getch();
}

// Function to handle the scaling of a triangle
void scaleTriangle() {
    int triCoords[8];
    float sx, sy;
    cout << "Enter coordinates of triangle (x1 y1 x2 y2 x3 y3): ";
    cin >> triCoords[0] >> triCoords[1] >> triCoords[2] >> triCoords[3] >> triCoords[4] >> triCoords[5];
    triCoords[6] = triCoords[0];
    triCoords[7] = triCoords[1];

    cout << "Enter the scaling factors (sx sy): ";
    cin >> sx >> sy;

    cleardevice();
    setcolor(WHITE);
    drawpoly(4, triCoords);
    outtextxy(triCoords[0], triCoords[1] - 15, "Original Triangle");

    // Scale relative to the first vertex (pivot point)
    int pivotX = triCoords[0];
    int pivotY = triCoords[1];
    
    for (int i = 1; i < 3; ++i) { // Scale vertices 2 and 3
        triCoords[i * 2]     = pivotX + (int)((triCoords[i * 2] - pivotX) * sx);
        triCoords[i * 2 + 1] = pivotY + (int)((triCoords[i * 2 + 1] - pivotY) * sy);
    }

    setcolor(YELLOW);
    drawpoly(4, triCoords);
    outtextxy(triCoords[0] + 5, triCoords[1] + 5, "Scaled Triangle");
    getch();
}

// Function to handle the rotation of a triangle
void rotateTriangle() {
    int triCoords[8];
    float angle;
    cout << "Enter coordinates of triangle (x1 y1 x2 y2 x3 y3): ";
    cin >> triCoords[0] >> triCoords[1] >> triCoords[2] >> triCoords[3] >> triCoords[4] >> triCoords[5];
    triCoords[6] = triCoords[0];
    triCoords[7] = triCoords[1];

    cout << "Enter the rotation angle (in degrees): ";
    cin >> angle;
    
    cleardevice();
    setcolor(WHITE);
    drawpoly(4, triCoords);
    outtextxy(triCoords[0], triCoords[1] - 15, "Original Triangle");

    float rad = angle * (M_PI / 180.0);

    // Rotate about the first vertex
    int pivotX = triCoords[0];
    int pivotY = triCoords[1];

    for (int i = 1; i < 3; i++) { // Rotate vertices 2 and 3
        int x_old = triCoords[i * 2];
        int y_old = triCoords[i * 2 + 1];
        triCoords[i * 2]     = pivotX + (int)((x_old - pivotX) * cos(rad) - (y_old - pivotY) * sin(rad));
        triCoords[i * 2 + 1] = pivotY + (int)((x_old - pivotX) * sin(rad) + (y_old - pivotY) * cos(rad));
    }

    setcolor(CYAN);
    drawpoly(4, triCoords);
    outtextxy(triCoords[2] + 5, triCoords[3] + 5, "Rotated Triangle");
    getch();
}

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "C:\\TurboC3\\BGI");

    int choice;
    do {
        cleardevice();
        
        cout << "\n--- 2D Transformation Menu ---\n";
        cout << "--- Line Operations ---\n";
        cout << "1. Translate Line\n";
        cout << "2. Scale Line\n";
        cout << "3. Rotate Line\n";
        cout << "--- Triangle Operations ---\n";
        cout << "4. Translate Triangle\n";
        cout << "5. Scale Triangle\n";
        cout << "6. Rotate Triangle\n";
        cout << "-----------------------\n";
        cout << "7. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: translateLine(); break;
            case 2: scaleLine(); break;
            case 3: rotateLine(); break;
            case 4: translateTriangle(); break;
            case 5: scaleTriangle(); break;
            case 6: rotateTriangle(); break;
            case 7:
                cout << "Exiting...\n";
                break;
            default:
                cout << "Invalid choice! Please try again.\n";
                getch();
        }
    } while (choice != 7);

    closegraph();
    return 0;
}