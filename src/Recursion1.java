public class Recursion1 {
    public static void printNmb(int n){
        if(n==0) {
            return;
        }
        System.out.println(n);
        printNmb(n-1);
    }
    public static void main(String args[]){
        int n=5;
        printNmb(n);
    }
}
