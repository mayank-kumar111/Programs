// Spice Hut is a tiffin service provider which home delivers dinner to their customers – Occasional customers and Regular customers.Write a C++ program to implement classes.

#include <iostream>
using namespace std;

class Customer
{
protected:
    string customerName;

public:
    float billAmount;
    int billId;
    Customer(string customerName)
    {
        this->customerName = customerName;
    }
    virtual void calculateBillAmount() = 0;
    string getCustomerName()
    {
        return customerName;
    }
};

class OccasionalCustomer : public Customer
{
private:
    int distanceInKms;
    static int counter;

public:
    OccasionalCustomer(string CustomerName, int distanceInKms) : Customer(CustomerName)
    {
        this->distanceInKms = distanceInKms;
        counter++;
        billId = 1000 + counter;
    }
    bool validateDistanceInKms()
    {
        if (distanceInKms >= 1 && distanceInKms <= 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void calculateBillAmount()
    {
        if (validateDistanceInKms())
        {
            if (distanceInKms >= 1 && distanceInKms <= 2)
            {
                billAmount = 50 + (distanceInKms * 5);
            }
            else
            {
                billAmount = 50 + (distanceInKms * 7.5);
            }
        }
        else
        {
            billAmount = -1;
        }
    }
    int getDistanceInKms()
    {
        return distanceInKms;
    }
};

class RegularCustomer : public Customer
{
private:
    int noOfTiffin;
    static int counter;

public:
    RegularCustomer(string CustomerName, int noOfTiffin) : Customer(CustomerName)
    {
        this->noOfTiffin = noOfTiffin;
        counter++;
        billId = 2000 + counter;
    }
    bool validateNoOfTiffin()
    {
        if (noOfTiffin >= 1 && noOfTiffin <= 7)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void calculateBillAmount()
    {
        if (validateNoOfTiffin())
        {
            billAmount = noOfTiffin * 50 * 7;
        }
        else
        {
            billAmount = -1;
        }
    }
    int getNoOfTiffin()
    {
        return noOfTiffin;
    }
};

int OccasionalCustomer::counter = 0;
int RegularCustomer::counter = 0;

int main()
{
    OccasionalCustomer o("Mayank", 2);
    o.calculateBillAmount();
    cout << "The bill amount for " << o.getCustomerName() << " is: " << o.billAmount << endl;

    RegularCustomer r("Pratik", 5);
    r.calculateBillAmount();
    cout << "The bill amount for " << r.getCustomerName() << " is: " << r.billAmount << endl;

    return 0;
}