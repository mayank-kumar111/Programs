// Write a program to implement insertion and delation opration on queue using an array.

#include <stdio.h>
#include <stdlib.h>

#define MAX 5

int queue[MAX];
int front = -1, rear = -1;

void insert();
void delete();
void display();

int main()
{
    int choice;

    while (1)
    {
        printf("\n1. Insert\n2. Delete\n3. Display\n4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            insert();
            break;
        case 2:
            delete ();
            break;
        case 3:
            display();
            break;
        case 4:
            printf("Exiting from the program\n");
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }
    return 0;
}

void insert()
{
    int item;
    if (rear == MAX - 1)
    {
        printf("Queue is full\n");
    }
    else
    {
        printf("Enter the element to insert: ");
        scanf("%d", &item);
        if (front == -1)
        {
            front = 0;
        }
        rear = rear + 1;
        queue[rear] = item;
    }
}

void delete()
{
    if (front == -1 || front > rear)
    {
        printf("Queue is empty\n");
    }
    else
    {
        printf("Deleted element is %d\n", queue[front]);
        front = front + 1;
        if (front > rear)
        {
            front = rear = -1;
        }
    }
}

void display()
{
    int i;
    if (front == -1)
    {
        printf("Queue is empty\n");
    }
    else
    {
        printf("Queue elements are: ");
        for (i = front; i <= rear; i++)
        {
            printf("%d ", queue[i]);
        }
        printf("\n");
    }
}