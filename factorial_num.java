import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in); //scaning object 
	int n=s.nextInt(); //the number that you want to get the factorial
	
	System.out.println(fact(n)); //printing the answer but passing the n value to thge fact funtion 
	}
	 static int fact(int n){
	     if (n==0||n==1) //checking if n 0 or 1 if so it will return 1
	        return 1;
	     else
	        return n*fact(n-1); //recursive function
	}
}
