package Recursion;

public class NumberExample {
    public static void main(String[] args) {
        number(1);
    }
    static void number(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        number(n+1);


    }
}
