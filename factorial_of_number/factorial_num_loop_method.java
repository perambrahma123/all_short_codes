import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	System.out.println(fact(n));
	}
	 static int fact(int n){
     int t=1;
     if(n==0)
       return 1;
	    for(int i=1;i<=n;i++){
        t=i*t;
	}
     return t;
   }
}
