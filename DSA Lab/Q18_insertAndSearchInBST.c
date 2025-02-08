// Insertion and searching in Binary Search Tree.

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

struct node *createNode(int data)
{
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    if (newNode == NULL)
    {
        printf("Unable to allocate memory\n");
    }
    else
    {
        newNode->data = data;
        newNode->left = NULL;
        newNode->right = NULL;
    }
    return newNode;
}

struct node *insert(struct node *root, int data)
{
    if (root == NULL)
    {
        root = createNode(data);
    }
    else if (data <= root->data)
    {
        root->left = insert(root->left, data);
    }
    else
    {
        root->right = insert(root->right, data);
    }
    return root;
}

int search(struct node *root, int data)
{
    if (root == NULL)
    {
        return 0;
    }
    else if (root->data == data)
    {
        return 1;
    }
    else if (data <= root->data)
    {
        return search(root->left, data);
    }
    else
    {
        return search(root->right, data);
    }
}

int display(struct node *root)
{
    if (root != NULL)
    {
        display(root->left);
        printf("%d -> ", root->data);
        display(root->right);
    }
}

int main()
{
    struct node *root = NULL;
    int choice, data;
    printf("\n1. Insert\n2. Search\n3. Display\n4. Exit\n");
    while (1)
    {
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Tacking data as input until -1 is entered\n");
            while (1)
            {
                printf("Enter the data: ");
                scanf("%d", &data);
                if (data == -1)
                {
                    break;
                }
                root = insert(root, data);
            }
            break;
        case 2:
            printf("Enter the data to search: ");
            scanf("%d", &data);
            if (search(root, data))
            {
                printf("Data found\n");
            }
            else
            {
                printf("Data not found\n");
            }
            break;
        case 3:
            display(root);
            printf("\n");
            break;
        case 4:
            printf("Exiting...\n");
            exit(0);
            break;
        default:
            printf("Invalid choice\n");
        }
    }
    return 0;
}