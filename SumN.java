package Recursion;

public class SumN {
    public static void main(String[] args) {
        System.out.println(sumn(5));
    }
    static  int sumn(int n ){
        if (n==1) return 1;
        return sumn(n-1)+n;
    }
}
