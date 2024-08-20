import java.util.Scanner;
public class functions{
    //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static void circumference(int r){
        double circumference=2*3.14*r;
        System.out.println("circumference of circle = "+circumference);
    }
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int r=sc.nextInt();
       circumference(r);
   }
}
