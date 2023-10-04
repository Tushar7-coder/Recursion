package Recursion;

public class JoshephusProblem {
    public static void main(String[] args) {

        System.out.println(josephus(3,2));

    }
    static int josephus(int n,int k){
        if (n==1) return 1;
        return (josephus(n-1,k)+k-1)%n+1;
    }

}
