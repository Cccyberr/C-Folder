int main(void){
	int a,b,temp;
	printf("enter the values for a, b");
	scanf("%d %d", &a, &b);
	printf("value of a and b is:a=%d , b=%d", a,b);
	temp = a;
	a = b;
	b = temp;
	printf("value of a and b is:a=%d, b=%d", a,b);
	return EXIT_SUCCESS;
}
