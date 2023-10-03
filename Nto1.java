package Recursion;

public class Nto1 {
    public static void main(String[] args) {
//        num(5);
 //       numrev(6);
        both(4);
    }
    static void num(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        num(n-1);
    }
    static void numrev(int n){
        if (n==0){
            return;
        }
        numrev(n-1);
        System.out.println(n);
    }
    static void both(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}
