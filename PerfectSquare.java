import java.util.Scanner;

class PerfectSquare
{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);
System.out.print("Enter a Number:: ");
int num=sc.nextInt();
double x= Math.floor(Math.sqrt(num));
if(x*x==num)
System.out.println(num + " is a Perfact Square with root-> "+x);

else
System.out.println(num + " is Not a Perfact Square" );
}

}