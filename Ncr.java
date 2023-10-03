package Recursion;

public class Ncr {
    public static void main(String[] args) {
        int ans = ncr(10,4);
        System.out.println(ans);
    }
    static int ncr(int n,int r){
        if (n==r || r==0) {
            return 1;
        } return ncr(n-1,r-1)+ ncr(n-1,r);

    }
}
