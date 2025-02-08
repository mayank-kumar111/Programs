// Write a program to traverse a tree. functions to generate, inorder, preorder, postorder, and delete a tree.

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

void inorder(struct node *root)
{
    if (root != NULL)
    {
        inorder(root->left);
        printf("%d -> ", root->data);
        inorder(root->right);
    }
}

void preorder(struct node *root)
{
    if (root != NULL)
    {
        printf("%d -> ", root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(struct node *root)
{
    if (root != NULL)
    {
        postorder(root->left);
        postorder(root->right);
        printf("%d -> ", root->data);
    }
}

struct node *deleteTree(struct node *root)
{
    if (root != NULL)
    {
        deleteTree(root->left);
        deleteTree(root->right);
        free(root);
    }
    return NULL;
}

int main()
{
    struct node *root = NULL;
    int choice, data;
    printf("\n1. Insert\n2. Inorder\n3. Preorder\n4. Postorder\n5. Delete\n6. Exit\n");
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
            inorder(root);
            printf("\n");
            break;
        case 3:
            preorder(root);
            printf("\n");
            break;
        case 4:
            postorder(root);
            printf("\n");
            break;
        case 5:
            root = deleteTree(root);
            printf("Tree deleted\n");
            break;
        case 6:
            printf("Exiting...\n");
            exit(0);
            break;
        default:
            printf("Invalid choice\n");
        }
    }
    return 0;
}
