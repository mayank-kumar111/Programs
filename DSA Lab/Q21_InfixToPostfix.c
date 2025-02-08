// Program to convert infix expression to postfix expression.

#include <stdio.h>
#include <conio.h>
#include <string.h>

char pop();
void push();
int getprec(char);
char infix[20], stack[20], post[20], val;
int i = 0, j = 0, k = 0;

int main()
{
    char a;
    int pre, pre1;
    puts("enter the expression: ");
    gets(infix);
    for (i = 0; infix[i] != '\0'; i++)
    {
        val = infix[i];
        switch (val)
        {
        case '(':
            push();
            break;
        case ')':
            while ((a = pop()) != '(')
                post[j++] = a;
            break;
        case '+':
        case '-':
        case '*':
        case '/':
        case '%':
        case '^':
            pre = getprec(val);
            pre1 = getprec(stack[k - 1]);
            while (pre1 >= pre)
            {
                a = pop();
                post[j++] = a;
                pre1 = getprec(stack[k - 1]);
            }
            push();
            break;
        default:
            post[j++] = val;
        }
    }
    while ((a = pop()) != '\0')

        post[j++] = a;

    puts(post);
    return 0;
}

char pop()
{
    char a;
    a = stack[k - 1];
    k--;
    return a;
}
void push()
{
    stack[k] = val;
    k++;
}
int getprec(char item)
{
    if (item == '+' || item == '-')
        return (1);
    else if (item == '*' || item == '/' || item == '%')
        return (2);
    else if (item == '^')
        return (3);
    else
        return (0);
}