import java.util.Scanner;
public class functions{
    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static void greaterOfTwo(int a,int b){
        if(a>b){
            System.out.print("a is greater");
        }else{
            System.out.print("b is greater");
        }
        return;
    }
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int a= sc.nextInt();
       int b=sc.nextInt();
       greaterOfTwo(a,b);
   }
}