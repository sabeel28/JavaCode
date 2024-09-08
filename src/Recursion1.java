//print from 5 to 1
public class Recursion1 {
    public static void printNmb(int n){
        if(n==0) {
            return;
        }
        System.out.println(n);//first we print n i.e. 5 and rest of the work is done by the function itself.
        printNmb(n-1);
    }
    public static void main(String args[]){
        int n=5;
        printNmb(n);
    }
}
//print from 1 to 5
//public class Recursion1 {
//    public static void printNumb(int n){
//        if(n==6){
//            return;
//        }
//        System.out.println(n);
//        printNumb(n+1);
//    }
//    public static void main(String args[]){
//        int n=1;
//        printNumb(n);
//    }
//}
