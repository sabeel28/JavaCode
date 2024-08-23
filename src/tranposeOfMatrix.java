import java.util.Scanner;

public class tranposeOfMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        //input
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        //actual matrix
        System.out.println("Actual Matrix: ");
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //output-transpose of matrix
        System.out.println("Transpose of Matrix: ");
        for(int j=0;j<m;j++){
            for (int i=0;i<n;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
