import java.util.Scanner;
public class functions{
    //Write a function that takes in age as input and returns if that person is eligible to vote or not.
    // A person of age > 18 is eligible to vote.
    public static void personVote(int age){
        if(age>18){
            System.out.print("eligible to vote");
        }else {
            System.out.print("not eligible vote");
        }
        return;
    }
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int age= sc.nextInt();
       personVote(age);
   }
}
