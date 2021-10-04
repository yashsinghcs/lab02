#include <bits/stdc++.h>

using namespace std;

float findArea(int s1,int a1,int a2,int a3){
    if(a1<0 || a2<0  || a3<0 || a1+a2<=a3 || a3+a2<=a1 || a1+a3<=a2){
        cout<<"Triangle is not possible";
        exit(0);
    }
    float halfParimeter = float(a1+a2+a3)/2;
    return ((s1*s1)-sqrt(halfParimeter*(halfParimeter-a1)*(halfParimeter-a2)*(halfParimeter-a3)));
}

int main(){
    int s=8,a=3,b=2,c=2;
    cout<<"Area is: "<<findArea(s,a,b,c);

    return 0;
}

