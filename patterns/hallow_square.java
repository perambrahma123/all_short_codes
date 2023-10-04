//printing  a hllow square of * or what every we want in it 
/* we want to print when n value is 5 

the output should be:

* * * * * 
*       *
*       *
*       *
* * * * *

*/
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt(); //as we are taking square t is good enough because both side are t value only 
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                if(i==0||j==0||i==t-1||j==t-1){
System.out.print("* "); //here * is the string that we want to put in square
                }
                else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}