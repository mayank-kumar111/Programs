#include <iostream>
using namespace std;
class sample
{
private:
    int a, b;

public:
    void getdata()
    {
        cout << "Enter two number :" << endl;
        cin >> a >> b;
    }
    void display()
    {
        cout << "You Enter a number is : " << a << " and " << b << endl;
    }
};
int main()
{
    sample s;
    s.getdata();
    s.display();
    return 0;
}
