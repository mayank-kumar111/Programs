// Write a program to create a linked list and perform insertion and deletion of all cases. Write a function to sort and finally delete the intire linked list.

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head = NULL;

struct node *createLinkedList(struct node *head);
struct node *display(struct node *head);
struct node *insertAtBeginning(struct node *head);
struct node *insertAtEnd(struct node *head);
struct node *insertBefore(struct node *head);
struct node *insertAfter(struct node *head);
struct node *deleteAtBeginning(struct node *head);
struct node *deleteAtEnd(struct node *head);
struct node *deleteBefore(struct node *head);
struct node *deleteAfter(struct node *head);
struct node *deleteNode(struct node *head, int data);
struct node *deleteLinkedList(struct node *head);
struct node *sortLinkedList(struct node *head);

int main()
{
    int choice;
    printf("Linked List Operations\n");
    printf("***********************\n");
    printf("1. Create linked list\n2. Display\n3. Insert at beginning\n4. Insert at end\n5. Insert before\n6. Insert after\n7. Delete at beginning\n8. Delete at end\n9. Delete before\n10. Delete after\n11. Delete node\n12. Delete linked list\n13. Sort linked list\n14. Exit\n");
    while (1)
    {
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            head = createLinkedList(head);
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
            head = insertBefore(head);
            break;
        case 6:
            head = insertAfter(head);
            break;
        case 7:
            head = deleteAtBeginning(head);
            break;
        case 8:
            head = deleteAtEnd(head);
            break;
        case 9:
            head = deleteBefore(head);
            break;
        case 10:
            head = deleteAfter(head);
            break;
        case 11:
        {
            int data;
            printf("Enter the data of the node to be deleted: ");
            scanf("%d", &data);
            head = deleteNode(head, data);
            break;
        }
        case 12:
            head = deleteLinkedList(head);
            break;
        case 13:
            head = sortLinkedList(head);
            break;
        case 14:
            printf("Exiting from the program\n");
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }
    return 0;
}

// Take input from user and create a linked list until user user enter -1 to stop.
struct node *createLinkedList(struct node *head)
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
        }
        else
        {
            temp = head;
            while (temp->next != NULL)
            {
                temp = temp->next;
            }
            temp->next = newNode;
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
        while (temp != NULL)
        {
            printf("%d -> ", temp->data);
            temp = temp->next;
        }
        printf("NULL\n");
    }
    return head;
}

struct node *insertAtBeginning(struct node *head)
{
    struct node *newNode;
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
        newNode->next = NULL;
        if (head == NULL)
        {
            head = newNode;
        }
        else
        {
            temp = head;
            while (temp->next != NULL)
            {
                temp = temp->next;
            }
            temp->next = newNode;
        }
    }
    printf("Element %d is inserted at the end\n", data);
    return head;
}

struct node *insertBefore(struct node *head)
{
    struct node *newNode, *temp, *prev;
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
        if (head == NULL)
        {
            printf("List is empty\n");
        }
        else
        {
            temp = head;
            while (temp != NULL && temp->data != key)
            {
                prev = temp;
                temp = temp->next;
            }
            if (temp == NULL)
            {
                printf("Key not found\n");
            }
            else
            {
                if (temp == head)
                {
                    newNode->next = head;
                    head = newNode;
                }
                else
                {
                    prev->next = newNode;
                    newNode->next = temp;
                }
            }
        }
    }
    printf("Element %d is inserted before %d\n", data, key);
    return head;
}

struct node *insertAfter(struct node *head)
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
        if (head == NULL)
        {
            printf("List is empty\n");
        }
        else
        {
            temp = head;
            while (temp != NULL && temp->data != key)
            {
                temp = temp->next;
            }
            if (temp == NULL)
            {
                printf("Key not found\n");
            }
            else
            {
                newNode->next = temp->next;
                temp->next = newNode;
            }
        }
    }
    printf("Element %d is inserted after %d\n", data, key);
    return head;
}

struct node *deleteAtBeginning(struct node *head)
{
    struct node *temp;
    if (head == NULL)
    {
        printf("List is empty\n");
    }
    else
    {
        temp = head;
        head = head->next;
        free(temp);
    }
    printf("Node %d deleted from the beginning\n", temp->data);
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
        while (temp->next != NULL)
        {
            prev = temp;
            temp = temp->next;
        }
        if (temp == head)
        {
            head = NULL;
        }
        else
        {
            prev->next = NULL;
        }
        free(temp);
    }
    printf("Node %d deleted from the end\n", temp->data);
    return head;
}

struct node *deleteBefore(struct node *head)
{
    struct node *temp, *prev, *prevPrev;
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
        while (temp != NULL && temp->data != key)
        {
            prevPrev = prev;
            prev = temp;
            temp = temp->next;
        }
        if (temp == NULL)
        {
            printf("Key not found\n");
        }
        else
        {
            if (temp == head)
            {
                printf("No element before the key\n");
            }
            else if (prev == head)
            {
                head = temp;
                free(prev);
            }
            else
            {
                prevPrev->next = temp;
                free(prev);
            }
        }
    }
    printf("Node before %d is %d was deleted\n", key, prev->data);
    return head;
}

struct node *deleteAfter(struct node *head)
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
        while (temp != NULL && temp->data != key)
        {
            temp = temp->next;
        }
        if (temp == NULL)
        {
            printf("Key not found\n");
        }
        else if (temp->next == NULL)
        {
            printf("No element after the key\n");
        }
        else
        {
            prev = temp->next;
            temp->next = prev->next;
            free(prev);
            printf("Node after %d deleted\n", key);
        }
    }
    printf("Node after %d is %d was deleted\n", key, prev->data);
    return head;
}

struct node *deleteNode(struct node *head, int data)
{
    struct node *temp, *prev;
    if (head == NULL)
    {
        printf("List is empty\n");
    }
    else
    {
        temp = head;
        while (temp != NULL && temp->data != data)
        {
            prev = temp;
            temp = temp->next;
        }
        if (temp == NULL)
        {
            printf("Data not found\n");
        }
        else
        {
            if (temp == head)
            {
                head = temp->next;
            }
            else
            {
                prev->next = temp->next;
            }
            free(temp);
        }
    }
    printf("Node with data %d is deleted\n", data);
    return head;
}

struct node *deleteLinkedList(struct node *head)
{
    struct node *temp;
    if (head == NULL)
    {
        printf("List is empty\n");
    }
    else
    {
        while (head != NULL)
        {
            temp = head;
            head = head->next;
            free(temp);
        }
        printf("Linked list deleted\n");
    }
    return head;
}

struct node *sortLinkedList(struct node *head)
{
    struct node *i, *j;
    int temp;
    if (head == NULL)
    {
        printf("List is empty\n");
    }
    else
    {
        for (i = head; i->next != NULL; i = i->next)
        {
            for (j = i->next; j != NULL; j = j->next)
            {
                if (i->data > j->data)
                {
                    temp = i->data;
                    i->data = j->data;
                    j->data = temp;
                }
            }
        }
        printf("Linked list sorted\n");
    }
    return head;
}