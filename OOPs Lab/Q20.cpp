// to explain static data members and static member functions in a class.
#include <iostream>
using namespace std;

class sample
{
    int x;
    static int y;

public:
    void setdataX();
    void showdatax();
    void showdataY();
    static void showY();
};
int sample ::y=10;
void sample ::setdataX()
{
    cout << "Enter the value of x: ";
    cin >> x;
}
void sample ::showdatax()
{
    cout << "Value of x: " << x << endl;
}
void sample ::showdataY()
{
    cout << "Value of y: " << y << endl;
}
void sample ::showY()
{
    cout << "Value of y: " << y << endl;
}
int main()
{   sample ::showY();
    sample s1;
    s1.setdataX();
    s1.showdatax();
    s1.showdataY();
    s1.showY();
    return 0;
}