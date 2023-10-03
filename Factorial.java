package Recursion;

public class Factorial {
    public static void main(String[] args) {
//    int answer = factorial(5);
//        System.out.println(answer);
        System.out.println(sumOfNum(5));

    }
    static int factorial(int n){
        if (n<=1 ){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int sumOfNum(int n){
        if (n==0){
            return 0;
        }
        return n+sumOfNum(n-1);
    }
}
