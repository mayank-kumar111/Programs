// Write a program to implement constructors in inheritance in C++.
// include all cases of inheritance.

//WAP to implement constructor in Inheritance
//case 1: Default constructor in base, no constructed in derived
#include <iostream>
using namespace std;
// class Base{
//     public:
//         Base(){
//             cout<<"\nDefault constructor of Base:";
//         }
// };
// class Derived: public Base{

// };
// main(){
//     Derived d1;
// }

// case 2: No constructor in base, default constructor in derived
// class Base{
//     public:
        
// };
// class Derived: public Base{
//     public:
//     Derived(){
//             cout<<"\nDefault constructor of derived:";
//         }
// };
// main(){
//     Derived d1;
// }

//case 3: Default constructor in base and default constructor in derived
// class Base{
//     public:
//         Base(){
//         cout<<"\nDefault constructor of Base:";
//         }
// };
// class Derived: public Base{
//     public:
//     Derived(){
//             cout<<"\nDefault constructor of derived:";
//         }
// };
// main(){
//     Derived d1;
// }

// case 4.1: Parameterized constructor in base default constructor in derived
// class Base{
//     public:
//         Base(){
//         cout<<"\nDefault constructor of Base:";
//         }
//         Base(int x){
//             cout<<"\nParameterized constuctor of base:";
//         }
// };
// class Derived: public Base{
//     public:
//     Derived(){
//             cout<<"\nDefault constructor of derived:";
//         }
// };
// main(){
//     Derived d1;
// }

// case 4.2: Parameterized constructor in base default constructor in derived
// class Base{
//     public:
//         Base(int x){
//             cout<<"\nParameterized constuctor of base:";
//         }
// };
// class Derived: public Base{
//     public:
//     Derived():Base(10){
//             cout<<"\nDefault constructor of derived:";
//         }
// };
// main(){
//     Derived d1;
// }

// case 5: Default and parameterized constructor in base and derived both
// class Base{
//     public:
//         Base(){
//         cout<<"\nDefault constructor of Base:";
//         }
//         Base(int x){
//             cout<<"\nParameterized constuctor of base:";
//         }
// };

// class Derived: public Base{
//     public:
//     int y;
//     Derived():Base(y){
//             cout<<"\nDefault constructor of derived:";
//         }
//     Derived(int y):Base(y){
//         cout<<"\nParameterized const. of derived";
//     }    
// };
// main(){
//     Derived d1;
//     Derived d2(10);
// }

// case 6: Instructor in multiple inheritance
// class Base1{
//     public:
//       Base1(){
//         cout<<"\ndefault const. of Base1";
//       }
// };
// class Base2{
//     public:
//       Base2(){
//         cout<<"\nDefault comst. of Base2";
//       }
// };
// class Derived:public Base1, public Base2{
//     public:
//     Derived(){
//         cout<<"\nDefault const. of derived";
//     }
// };
// main(){
//     Derived d1;
// }

// case 7:virtual inheritance in multiple inheritance
// class Base1{
//     public:
//       Base1(){
//         cout<<"\ndefault const. of Base1";
//       }
// };
// class Base2{
//     public:
//       Base2(){
//         cout<<"\nDefault comst. of Base2";
//       }
// };
// class Derived:public Base1, virtual public Base2{
//     public:
//     Derived(){
//         cout<<"\nDefault const. of derived";
//     }
// };
// main(){
//     Derived d1;
// }

//case 8: Default,Paramaterized in  ultiple Inheritance
class Base1{
    public:
      Base1(int x){
        cout<<"\nParameterized const. of Base1";
      }
};
class Base2{
    public:
      Base2(int y){
        cout<<"\nParameterized const. of Base2";
      }
};
class Derived:public Base1, public Base2{
    public:
    Derived(int z):Base2(z), Base1(z){
        cout<<"\nparameterized const. of derived";
    }
};
main(){
    Derived d(10);
}