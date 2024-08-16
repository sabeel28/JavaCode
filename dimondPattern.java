import java.util.Scanner;

public class dimondPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //space
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            //star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //down part
        for(int i=n;i>=1;i--){
            //space
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            //star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
