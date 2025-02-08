// Write a program for circular linked List.

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head = NULL;

struct node *createCircularLinkedList(struct node *head);
struct node *display(struct node *head);
struct node *insertAtBeginning(struct node *head);
struct node *insertAtEnd(struct node *head);
struct node *randomInsert(struct node *head);
struct node *deleteAtBeginning(struct node *head);
struct node *deleteAtEnd(struct node *head);
struct node *deleteRandom(struct node *head);
struct node *searchNode(struct node *head, int data);

int main()
{
    int choice;
    printf("Circular Linked List Operations\n");
    printf("*******************************\n");
    printf("1. Create circular linked list\n2. Display\n3. Insert at beginning\n4. Insert at end\n5. Insert random\n6. Delete at beginning\n7. Delete at end\n8. Delete random\n9. Search\n10. Exit\n");
    while (1)
    {
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            head = createCircularLinkedList(head);
            break;
        case 2:
            head = display(head);
            break;
        case 3:
            head = insertAtBeginning(head);
            break;
        case 4:
            head = insertAtEnd(head);
            break;
        case 5:
            head = randomInsert(head);
            break;
        case 6:
            head = deleteAtBeginning(head);
            break;
        case 7:
            head = deleteAtEnd(head);
            break;
        case 8:
            head = deleteRandom(head);
            break;
        case 9:
        {
            int data;
            printf("Enter the data to be searched: ");
            scanf("%d", &data);
            head = searchNode(head, data);
            break;
        }
        case 10:
            printf("Exiting from the program\n");
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }
    return 0;
}

struct node *createCircularLinkedList(struct node *head)
{
    struct node *newNode, *temp;
    int data;
    printf("Enter the -1 to exit:\n");
    while (1)
    {
        newNode = (struct node *)malloc(sizeof(struct node));
        if (newNode == NULL)
        {
            printf("Unable to allocate memory\n");
            break;
        }
        printf("Enter the data : ");
        scanf("%d", &data);
        if (data == -1)
        {
            break;
        }
        newNode->data = data;
        newNode->next = NULL;
        if (head == NULL)
        {
            head = newNode;
            head->next = head;
        }
        else
        {
            temp = head;
            while (temp->next != head)
            {
                temp = temp->next;
            }
            temp->next = newNode;
            newNode->next = head;
        }
    }
    return head;
}

struct node *display(struct node *head)
{
    struct node *temp;
    if (head == NULL)
    {
        printf("List is empty\n");
    }
    else
    {
        temp = head;
        do
        {
            printf("%d -> ", temp->data);
            temp = temp->next;
        } while (temp != head);
        printf("HEAD\n");
    }
    return head;
}

struct node *insertAtBeginning(struct node *head)
{
    struct node *newNode, *temp;
    int data;
    newNode = (struct node *)malloc(sizeof(struct node));
    if (newNode == NULL)
    {
        printf("Unable to allocate memory\n");
    }
    else
    {
        printf("Enter the data: ");
        scanf("%d", &data);
        newNode->data = data;
        temp = head;
        while (temp->next != head)
        {
            temp = temp->next;
        }
        temp->next = newNode;
        newNode->next = head;
        head = newNode;
    }
    printf("Element %d is inserted at the beginning\n", data);
    return head;
}

struct node *insertAtEnd(struct node *head)
{
    struct node *newNode, *temp;
    int data;
    newNode = (struct node *)malloc(sizeof(struct node));
    if (newNode == NULL)
    {
        printf("Unable to allocate memory\n");
    }
    else
    {
        printf("Enter the data: ");
        scanf("%d", &data);
        newNode->data = data;
        newNode->next = head; // New node will point to head
        if (head == NULL)
        {
            head = newNode;
            newNode->next = head; // Circular link
        }
        else
        {
            temp = head;
            while (temp->next != head)
            {
                temp = temp->next;
            }
            temp->next = newNode;
        }
    }
    printf("Element %d is inserted at the end\n", data);
    return head;
}

struct node *randomInsert(struct node *head)
{
    struct node *newNode, *temp;
    int data, key;
    newNode = (struct node *)malloc(sizeof(struct node));
    if (newNode == NULL)
    {
        printf("Unable to allocate memory\n");
    }
    else
    {
        printf("Enter the data: ");
        scanf("%d", &data);
        printf("Enter the key: ");
        scanf("%d", &key);
        newNode->data = data;
        temp = head;
        while (temp->data != key && temp->next != head)
        {
            temp = temp->next;
        }
        if (temp->data != key)
        {
            printf("Key not found\n");
        }
        else
        {
            newNode->next = temp->next;
            temp->next = newNode;
            printf("Element %d is inserted after %d\n", data, key);
        }
    }
    return head;
}

struct node *deleteAtBeginning(struct node *head)
{
    struct node *temp, *ptr;
    if (head == NULL)
    {
        
        printf("List is empty\n");
    }
    else
    {
        temp = head;
        while (temp->next != head)
        {
            temp = temp->next;
        }
        if (head->next == head)
        {
            free(head);
            head = NULL;
        }
        else
        {
            ptr = head;
            head = head->next;
            temp->next = head;
            free(ptr);
        }
        printf("Node deleted from the beginning\n");
    }
    return head;
}

struct node *deleteAtEnd(struct node *head)
{
    struct node *temp, *prev;
    if (head == NULL)
    {
        printf("List is empty\n");
    }
    else
    {
        temp = head;
        while (temp->next != head)
        {
            prev = temp;
            temp = temp->next;
        }
        if (temp == head)
        {
            head = NULL;
            free(temp);
        }
        else
        {
            prev->next = head;
            free(temp);
        }
        printf("Node deleted from the end\n");
    }
    return head;
}

struct node *deleteRandom(struct node *head)
{
    struct node *temp, *prev;
    int key;
    if (head == NULL)
    {
        printf("List is empty\n");
    }
    else
    {
        printf("Enter the key: ");
        scanf("%d", &key);
        temp = head;
        prev = head;
        while (prev->next != head)
        {
            prev = prev->next;
        }
        if (head->data == key)
        {
            prev->next = head->next;
            free(head);
            head = prev->next;
        }
        else
        {
            while (temp->data != key && temp->next != head)
            {
                prev = temp;
                temp = temp->next;
            }
            if (temp->data != key)
            {
                printf("Node with data %d not found\n", key);
            }
            else
            {
                prev->next = temp->next;
                free(temp);
                printf("Node with data %d is deleted\n", key);
            }
        }
    }
    return head;
}

struct node *searchNode(struct node *head, int data)
{
    struct node *temp;
    int count = 0;
    if (head == NULL)
    {
        printf("List is empty\n");
    }
    else
    {
        temp = head;
        do
        {
            if (temp->data == data)
            {
                count++;
                break;
            }
            temp = temp->next;
        } while (temp != head);
        if (count == 0)
        {
            printf("Data not found\n");
        }
        else
        {
            printf("Data found\n");
        }
    }
    return head;
}
