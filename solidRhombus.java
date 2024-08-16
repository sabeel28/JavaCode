import java.util.Scanner;
public class solidRhombus {
    public static void main(String[] args) {
        int n = 4;
        //solid rhombus
        for(int i=1;i<=n;i++){
            //space
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //printing star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
