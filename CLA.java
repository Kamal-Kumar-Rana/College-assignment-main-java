class CLA{

public static void main(String args[])
{
int m=args.length;
int sum=0;

for(int i=0;i<m;i++)
{
sum+=Integer.parseInt( args[i]);

}
System.out.println("Sum of numbers is:: "+sum);
}
}