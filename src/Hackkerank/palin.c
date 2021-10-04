#include<stdio.h>
int main()
{
    int rem , n , res = 0 , temp;
    printf("Enter the no:\n");
    scanf("%d" , &n);
    temp = n;
    while(n!=0)
    {
        rem = n%10;
        res = res *10 +rem;
        n = n/10;
    }

    if (temp == res)

    {
        printf("Is Palindrome\n");

    }
    else
    {
        printf("Not a palindrome");

    }
    return 0;
}

