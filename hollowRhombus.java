import java.util.Scanner;

public class hollowRhombus {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n ||j==1||j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            //space
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            if (i == 1 || i == n) {
//                for (int j = 1; j <= n; j++) {
//                    System.out.print("*");
//                }
//            }else
//                for (int j=1;j<=n;j++)
//                    if(j==1||j==n)
//                        System.out.print("*");
//                    else {
//                        System.out.print(" ");
//                    }
//            System.out.println();
//        }
    }
}
