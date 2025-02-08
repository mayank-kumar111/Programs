// write a program to implement the push, pop, peek and exit operations in a stack using function and switch case in arrays.
#include <stdio.h>
#include <string.h>
void push();
void pop();
void peek();
int stack[100], top = -1;

int main()
{
    int  choice;
    // printf("Enter the size of the stack: ");
    // scanf("%d", &n);
    while (1)
    {
        printf("Enter the choice: \n1. Push\n2. Pop\n3. Peek\n4. Exit\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
        case 4:
            return 0;
        default:
            printf("Invalid choice\n");
        }
    }
    return 0;
}

void push()
{
    if (top == 100 - 1)
    {
        printf("Stack is full\n");
    }
    else
    {
        int num;
        printf("Enter the element to push: ");
        scanf("%d", &num);
        top++;
        stack[top] = num;
        printf("Element pushed successfully\n");
        for (int i = 0; i <= top; i++)
        {
            printf("%d ", stack[i]);
        }
    }
}
void pop()
{
    if (top == -1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("Element popped is: %d\n", stack[top]);
        top--;
        printf("Element popped successfully\n");
        for (int i = 0; i <= top; i++)
        {
            printf("%d ", stack[i]);
        }
    }
}
void peek()
{
    if (top == -1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("The top element is: %d\n", stack[top]);
    }
}