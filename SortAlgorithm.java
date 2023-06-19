import java.util.Scanner;
class SortAlgorithm{
	public static void main(String args[])
	{
	int temp;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number of elements to be sorted:");
	int a = scanner.nextInt();
	int b[]  = new int[a];
	for(int i = 0; i<a;i++){
	System.out.println("Enter the element at" +(i+1)+ "position:");
	b[i] = scanner.nextInt();
				}
	System.out.println("Enter the order to sort the elements: 1. Ascending 2. Descending");
	int c = scanner.nextInt();
	if(c==1)
	{
	for(int i=0;i<a;i++)
	{
	for(int j=i+1;j<a;j++)
	{
	if(b[i]>b[j])
	{
	temp = b[i];
	b[i]=b[j];
	b[j]=temp;
	}
	}
	}
	System.out.println("In ascending order:");
	for(int i = 0; i<a;i++)
	{
	System.out.println(b[i]);
	}
	}
	else
	{
	for(int i=0;i<a;i++)
	{
	for(int j=i+1;j<a;j++)
	{
	if(b[i]<b[j])
	{
	temp = b[i];
	b[i]=b[j];
	b[j]=temp;
	}
	}
	}
	System.out.println("In descending order:");
	for(int i = 0; i<a;i++)
	{
	System.out.println(b[i]);
	}
	}
	}
}	