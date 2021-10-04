#include<stdio.h>
int main()
{
    int rem , n , res = 0 ;
    printf("Enter the no:\n");
    scanf("%d" , &n);
    while(n!=0)
    {
        rem = n%10;
        res = res *10 +rem;
        n = n/10;
    }

    printf("The reversed no is = %d \n" , res);

    return 0;
}
