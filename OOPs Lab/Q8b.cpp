#include <iostream>
using namespace std;
class sample
{
private:
    int a, b;

public:
    void getdata();
    void display();
};
int main()
{
    sample s;
    s.getdata();
    s.display();
    return 0;
}
void sample ::getdata()
{
    cout << "Enter two number :"<<endl;
    cin >> a >> b;
}
void sample ::display()
{
    cout << "You enter a number is : " << a << " and " << b << endl;
}
