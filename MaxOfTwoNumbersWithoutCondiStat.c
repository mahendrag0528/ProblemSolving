#include<stdio.h>
int max1(int a,int b){
	int max=(a>b)*a+(b>a)*b;
	int min=(a<b)*a+(b<a)*b;
	return max;
}
int main(){
	int a,b;
	scanf("%d %d",&a,&b);
	int ans=max1(a,b);
	printf("%d",ans);
	return 0;
}