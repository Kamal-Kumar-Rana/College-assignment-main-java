import java.util.Scanner;

class Prime
{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);
System.out.print("Enter a number to cheak the number is prime or not:: ");
int n=sc.nextInt();
int i,flag=0;
for(i=2;i<=(n/2);i++)
{

if(n%i==0){
flag=1;
break;
}
}
if(flag==1)
System.out.println(n+" is Not Prime Number");

else
System.out.println(n+ " is Prime Number");

}

}