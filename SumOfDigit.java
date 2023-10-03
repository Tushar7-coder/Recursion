package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(digit(123));
    }
    static int digit(int n){
        if (n%10==n){
            return n;
        }
        return (n%10) + digit(n/10) ;
    }
}
