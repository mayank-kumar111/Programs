// write a program to implement insertion and deletion operation on stack using a linked list.

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *top = NULL;

void push();
void pop();
void peek();
void display();

int main()
{
    int choice;

    while (1)
    {
        printf("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit\n");
        printf("Enter your choice: ");
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
            display();
            break;
        case 5:
            printf("Exiting from the program\n");
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }
    return 0;
}

void push()
{
    struct node *newNode;
    newNode = (struct node *)malloc(sizeof(struct node));
    if (newNode == NULL)
    {
        printf("Stack is full\n");
    }
    else
    {
        printf("Enter the element to push: ");
        scanf("%d", &newNode->data);
        newNode->next = top;
        top = newNode;
    }
}

void pop()
{
    struct node *temp;
    if (top == NULL)
    {
        printf("Stack is empty\n");
    }
    else
    {
        temp = top;
        printf("Popped element is %d\n", temp->data);
        top = top->next;
        free(temp);
    }
}

void peek()
{
    if (top == NULL)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("Top element is %d\n", top->data);
    }
}

void display()
{
    struct node *temp;
    if (top == NULL)
    {
        printf("Stack is empty\n");
    }
    else
    {
        temp = top;
        printf("Stack elements are: ");
        while (temp != NULL)
        {
            printf("%d ", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}