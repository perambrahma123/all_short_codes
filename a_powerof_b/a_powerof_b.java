import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); //creating a scaning Object
		int a=s.nextInt(); //a is the base number 
		int b=s.nextInt(); //b is the power 
		int n=a; //copying a value into n
		while(b-->1){
		    a=a*n; //multipleing a with n(a values) b times
		}
	System.out.println(a);
		
	}
}
