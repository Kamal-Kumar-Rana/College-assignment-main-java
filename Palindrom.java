import java.util.Scanner;

class Palindrom
{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);
System.out.print("Enter a number to cheak the number is Palindrom or not:: ");
int n=sc.nextInt();

int rem,rev=0;
int num=n;
while(n>0)
{
rem=n%10;
rev=(rev*10)+rem;
n=n/10;

}
if(num==rev)
System.out.println(num+" is Palindrom Number");

else
System.out.println(num+ " is Not Palilndrom Number");

}

}