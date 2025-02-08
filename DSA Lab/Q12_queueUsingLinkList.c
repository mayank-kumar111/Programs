// Write a program to implement a queue using linked list.

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *front = NULL;
struct node *rear = NULL;

void enqueue();
void dequeue();
void display();

int main()
{
    int choice;

    while (1)
    {
        printf("1. Enqueue\n2. Dequeue\n3. Display\n4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            enqueue();
            break;
        case 2:
            dequeue();
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

void enqueue()
{
    struct node *newNode;
    newNode = (struct node *)malloc(sizeof(struct node));
    if (newNode == NULL)
    {
        printf("Queue is full\n");
    }
    else
    {
        int data;
        printf("Enter the element to be inserted: ");
        scanf("%d", &data);
        newNode->data = data;
        newNode->next = NULL;
        if (front == NULL)
        {
            front = rear = newNode;
        }
        else
        {
            rear->next = newNode;
            rear = newNode;
        }
        display();
    }
}

void dequeue()
{
    if (front == NULL)
    {
        printf("Queue is empty\n");
    }
    else
    {
        struct node *temp = front;
        printf("Deleted element is: %d\n", front->data);
        front = front->next;
        free(temp);
        display();
    }
}

void display()
{
    if (front == NULL) 
    {
        printf("Queue is empty\n");
    }
    else
    {
        struct node *temp = front;
        printf("Front -> ");
        while (temp != NULL)
        {
            printf("%d -> ", temp->data);
            temp = temp->next;
        }
        printf("Rear\n");
    }
}