package Recursion;

public class RecursionBasics {
    public static void main(String[] args) {
//        greet();
        print2(5);
    }
//    static void greet(){
//        System.out.println("Hello world ");
//        greet();
//    }
//    static void print(int n){
//        if (n>0){
//            System.out.println(n);
//            print(n-1);
//        }
//    }
    static void print2(int n){
        if (n>0){
            print2(n-1);
            System.out.println(n);

        }
    }
}
