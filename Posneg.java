import java.util.Scanner;
public class Posneg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int a;
Scanner s=new Scanner(System.in);
System.out.println("enter the value:");
a=s.nextInt();
if(a>0)
{
	System.out.println("positive");
}
else if(a<0)
{
	System.out.println("negative");
}
else
{
	System.out.println("Neither positive or negative");
}
	}

}
