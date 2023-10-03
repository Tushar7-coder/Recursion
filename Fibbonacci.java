package Recursion;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fiboN(50));
    }
    static int fiboN(int n){
        if (n<=1) return 1;
        return fiboN(n-1)+ fiboN(n-2);
    }

}

