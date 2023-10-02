//printing a square of * or what every we want in it 
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt(); //as we are taking square t is good enough because both side are t value only 
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                System.out.print("* "); //here * is the string that we want to put in square
            }
            System.out.println();
        }
    }
}