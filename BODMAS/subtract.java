//here the Subtraction of integre,float and both is are shown 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		System.out.println("enter two integers you want to subtract:");
		int t=s.nextInt();
	    int y=s.nextInt();
	    System.out.println(t-y);
	    System.out.println("enter two float you want to subtract:");
        float a=s.nextFloat();
        float b=s.nextFloat();
        System.out.println(a-b);
        
        System.out.println("down is subtract value of integer t and float b \n"+t-b);
	}
}
