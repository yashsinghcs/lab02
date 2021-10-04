 #include<stdio.h>
int main()
{
    int rem , n , res = 0 , temp , sum;
    printf("Enter the no:\n");
    scanf("%d" , &n);
    temp = n;
    while(n!=0)
    {
        rem = n%10;
      res += rem * rem * rem;
        n = n/10;

    }
   if ( temp == res)
   {
       printf("Armstrong");

   }
    else
        {
            printf("Not Armstrong");
        }
    return 0;
}