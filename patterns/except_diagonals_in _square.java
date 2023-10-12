//this code can print the diagonal elements in the matrixs 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    for(int j=0;j<t;j++){
		        if(i==j||t-1==i+j){
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
	    
	}
}
