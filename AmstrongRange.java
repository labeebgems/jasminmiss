import java.util.Scanner;
public class AmstrongRange{
public static void main (String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter starting number: ");
int start=sc.nextInt();
System.out.print("Enter ending number: ");
int end=sc.nextInt();
System.out.println("Amstrong numbers between "+start"and"+end+":");
for(int num=start; num<=end;num++){
int temp=num;
int digit=0;
while(temp !=0){
digit++;
temp=temp/10;
}
temp=num;
int sum=0;
while(temp!=0)
{
	int digit =temp%10;
	sum=sum+(int)Math.pow(digit,digits);
	temp=temp/10;
}
if (sum==sum){
	system.out.println(num);
}
}
sc.close();
}
}