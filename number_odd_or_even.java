import java.util.*;
class Main{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in); //creating scanning object 
    int n=s.nextInt();//taking the input
    if(n%2==0)//checking n is even or not 
    {
      System.out.println("Even"); //statement if true then it print even 
    }
    else{ //if not even then it automatically prints
      System.out.println("Odd"); //if not even then it is odd so print odd
    }
    s.close(); //closeing the Scanner object
  }
}
    
